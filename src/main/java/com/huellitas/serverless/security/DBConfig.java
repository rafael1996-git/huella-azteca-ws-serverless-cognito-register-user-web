package com.huellitas.serverless.security;

import lombok.Data;

import java.io.Serializable;

@Data
public class DBConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    private String url = "jdbc:oracle:thin:@huella-azteca-dev-oracle.cevuunabkbl6.us-east-1.rds.amazonaws.com:1521:HUEAZDEV";
    private String user = "USRHUELLITAS";
    private String pass = "U5rZ3u5H0t31";
}
