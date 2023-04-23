package com.huellitas.serverless.services.implement;

import com.huellazteca.core.OracleDBPool;
import com.huellitas.serverless.dao.UserWebDao;
import com.huellitas.serverless.dao.implement.UserWebDaoImpl;
import com.huellitas.serverless.models.domain.Response;
import com.huellitas.serverless.services.UserWebService;

public class UserWebServiceImpl implements UserWebService {
    private UserWebDao userWebDao;

    public UserWebServiceImpl() {
        userWebDao = new UserWebDaoImpl();
    }

    @Override
    public Response registerUserWeb(String nick, String idCongnito) {
        Response response;
        try {

            System.out.println("Start Service");
            Long uRegister = userWebDao.registerUserWeb(nick, idCongnito);
            System.out.println("uRegister "+ uRegister);
            if (uRegister != -1){
                response = new Response("Success register", true);
            } else {
                response = new Response("User register", false);
            }

        } catch (Exception e) {
            e.printStackTrace();
            response = new Response(e.getMessage(),false);
        } finally {
           OracleDBPool.closeSingletonConnection();
        }
        return response;
    }



}
