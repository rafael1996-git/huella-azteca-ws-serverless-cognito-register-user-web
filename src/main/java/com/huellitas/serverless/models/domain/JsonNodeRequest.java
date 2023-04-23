package com.huellitas.serverless.models.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JsonNodeRequest {

    //@SerializedName("version")
    String version;

    //@SerializedName("region")
    String region;

    public JsonNodeRequest() {

    }

    //@SerializedName("userPoolId")
    //String userPoolId;

    //@SerializedName("userName")
    //String userName;

    //@SerializedName("callerContext")
    //JsonCallerContext callerContext;

    //@SerializedName("triggerSource")
    //String triggerSource;

    //@SerializedName("request")
    //JsonRequest request;

    //@SerializedName("response")
    //JsonResponse response;

}
