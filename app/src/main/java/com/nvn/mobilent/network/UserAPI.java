package com.nvn.mobilent.network;

import com.nvn.mobilent.model.RLogin;
import com.nvn.mobilent.model.RUser;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserAPI {
    @GET("/api/user")
    Call<RUser> getCartItemByID(
            @Query("page") int type,
            @Query("page_size") int page
    );


    @POST("/api/user/login")
    Call<RLogin> loginUser(
            @Query("email") String email,
            @Query("password") String password
    );


    @POST("/api/user")
    @FormUrlEncoded
    Call<RLogin> registerUser(
            @Field("email") String email,
            @Field("firstname") String firstname,
            @Field("lastname") String lastname,
            @Field("password") String password,
            @Field("address") String address,
            @Field("phone") String phone,
            @Field("sex") int sex,
            @Field("birthday") String birthday
    );

    @POST("/api/user/change-password")
    @FormUrlEncoded
    Call<RLogin> changePassword(
            @Field("email") String email,
            @Field("oldPassword") String oldpassword,
            @Field("newPassword") String newPassword
    );
}