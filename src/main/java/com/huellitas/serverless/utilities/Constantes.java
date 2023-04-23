package com.huellitas.serverless.utilities;

import com.huellazteca.core.utils.Environment;

public class Constantes {

    public static final String FAILED_GET_DB_CONFIG = "Failed to get DB configuration.";
    public static final String CODIGO_FAILED_GET_DB_CONFIG = "-10";
    public static final int DB_TIMEOUT = 7;

    private static String initializeVariable(String value) {
        String result;
        try {
            result = Environment.get(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = null;
        }

        return result;
    }

}
