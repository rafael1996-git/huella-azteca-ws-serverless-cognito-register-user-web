package com.huellitas.serverless.models.domain;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class JsonUserAttributes {

    @SerializedName("sub")
    String sub;

    //@JsonProperty("email_verified")
    //private String email_verified;

    //@JsonProperty("cognito:user_status")
    //private String cognitoUserStatus;

    //@JsonProperty("cognito:email_alias")
    //private String cognitoEmailAlias;

    @SerializedName("email")
    String email;

}
