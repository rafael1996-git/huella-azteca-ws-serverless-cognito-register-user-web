package com.huellitas.serverless.models.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class CallerContext {

    @SerializedName("awsSdkVersion")
    String awsSdkVersion;
    @SerializedName("clientId")
    String clientId;

}
