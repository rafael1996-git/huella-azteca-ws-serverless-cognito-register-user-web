package com.huellitas.serverless.models.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class JsonRequest {

    @SerializedName("userAttributes")
    JsonUserAttributes userAttributes;

}
