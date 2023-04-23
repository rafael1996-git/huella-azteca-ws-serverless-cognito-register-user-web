package com.huellitas.serverless;

import com.huellazteca.core.utils.GsonParser;
import com.huellazteca.core.utils.LogHandler;
import com.huellitas.serverless.models.domain.RequestModel;
import com.huellitas.serverless.models.domain.Response;
import com.huellitas.serverless.services.UserWebService;
import com.huellitas.serverless.services.implement.UserWebServiceImpl;

public class App {
	private UserWebService userWebService = null;

    protected Object preHandler(Object request) {
        System.out.println("preHandler request: " + request);
        return request;
    }

    public Object handleRequest(Object request){
        request = this.preHandler(request);
        System.out.println("Request:: " + request);

        if (userWebService == null) {
            userWebService = new UserWebServiceImpl();
        }

        try {
            System.out.println("Start Deserealization");
            String finalData = GsonParser.serialize(request);
            RequestModel userRequest = GsonParser.deserialize(finalData, RequestModel.class);
            System.out.println("End Deserealization");

            Response response = userWebService.registerUserWeb(userRequest.getRequest().getUserAttributes().getEmail(),
                    userRequest.getRequest().getUserAttributes().getSub());
            LogHandler.writeLog(new StringBuilder(response.isSuccess() ? "[SUCCESS] " : "[FAIL] ").append(response.getMessage()).toString());

            System.out.println("Response isSuccess: "+ response);
            return this.postHandler(request);
        } catch (Exception e){
                e.printStackTrace();
            LogHandler.manageInternalException("App.handleRequest: ",e);
            return this.postHandler(request);
        }
    }

    protected Object postHandler(Object request) {
        System.out.println("postHandler request: " + request);
        return request;
    }
 

}

