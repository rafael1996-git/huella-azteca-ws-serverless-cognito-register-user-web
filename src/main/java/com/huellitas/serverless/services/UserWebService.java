package com.huellitas.serverless.services;

import com.huellitas.serverless.models.domain.Response;

public interface UserWebService {
    Response registerUserWeb(String nick, String idCongnito) throws Exception;
}
