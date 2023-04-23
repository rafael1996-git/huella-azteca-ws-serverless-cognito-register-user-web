package com.huellitas.serverless.models.domain;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestModel {

    @SerializedName("version")
    String version;
    @SerializedName("region")
    String region;
    @SerializedName("userPoolId")
    String userPoolId;
    @SerializedName("userName")
    String userName;
    @SerializedName("callerContext")
    CallerContext callerContext;
    @SerializedName("triggerSource")
    String triggerSource;
    @SerializedName("request")
    SyncRequestModel request;
    @SerializedName("response")
    ResponseModel response;
}
