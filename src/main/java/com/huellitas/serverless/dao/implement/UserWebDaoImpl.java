package com.huellitas.serverless.dao.implement;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.huellazteca.core.OracleDBPool;
import com.huellitas.serverless.dao.UserWebDao;
import com.huellitas.serverless.security.Credentials;
import com.huellitas.serverless.utilities.Constantes;
import com.huellitas.serverless.utilities.ConstantesSQL;
import com.huellitas.serverless.utilities.Exceptions.TradeException;

import oracle.jdbc.OracleTypes;

public class UserWebDaoImpl implements UserWebDao {

    static {
        try {
            if (Credentials.DB_CONFIG == null) {
                throw new TradeException(Constantes.FAILED_GET_DB_CONFIG,
                        Constantes.CODIGO_FAILED_GET_DB_CONFIG );
            }
            OracleDBPool.initSingletonConnectionCredentials(Credentials.DB_CONFIG.getUrl(),
                    Credentials.DB_CONFIG.getUser(),
                    Credentials.DB_CONFIG.getPass());

        } catch (Exception e) {
            System.out.println(e);
        }


    }
    public Long registerUserWeb(String nick, String idCongnito) throws Exception {
        CallableStatement cs = null;
        try {

            Connection conn = OracleDBPool.getSingletonConnection(Constantes.DB_TIMEOUT, ConstantesSQL.INSERT_REGISTER_USER);
            cs = conn.prepareCall(ConstantesSQL.INSERT_REGISTER_USER);
            cs.registerOutParameter(1, OracleTypes.NUMBER);
            cs.setString(2,nick);
            cs.setInt(3,1);
            cs.setString(4,idCongnito);
            cs.setInt(5,2);
            cs.execute();
            System.out.println("Ejecucion FN exito");
            return cs.getLong(1);
        }catch (Exception e){
            System.out.println("Error DB");
            e.printStackTrace();
            System.out.println(new StringBuilder("UserDaoImpl.registerUserWeb , ").append(e.getMessage()));
            throw new Exception(e.getMessage());
        } finally {
            if (cs != null) { try { cs.close(); } catch (Exception e) {} }
        }
    }
}
