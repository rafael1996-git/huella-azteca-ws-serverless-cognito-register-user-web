package com.huellitas.serverless.models.domain;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class UserAttributes {

    @SerializedName("sub")
    String sub;

    @SerializedName("email_verified")
    String emailVerified;

    @SerializedName("cognito:user_status")
    String cognitoUserStatus;

    @SerializedName("cognito:email_alia")
    String cognitoEmailAlias;

    @SerializedName("email")
    String email;

}
