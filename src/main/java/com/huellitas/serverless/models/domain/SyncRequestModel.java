package com.huellitas.serverless.models.domain;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SyncRequestModel {

    @SerializedName("userAttributes")
    UserAttributes userAttributes;

}
