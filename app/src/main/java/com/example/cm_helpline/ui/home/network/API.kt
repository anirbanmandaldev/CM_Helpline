//package com.milkyway.saron.network
//
//import com.milkyway.saron.model.ForgetPasswordResponse
//import retrofit2.Call
//import retrofit2.http.Field
//import retrofit2.http.FormUrlEncoded
//import retrofit2.http.POST
//
//interface API {
//    @FormUrlEncoded
//    @POST("api/v1/authenticate/SendOTPNew")
//    fun sendOtp(
//        @Field("UserName") UserName: String?,
//        @Field("Password") Password: String?,
//        @Field("MobileNo") MobileNo: String?
//    ): Call<ForgetPasswordResponse>
//
//    Call<ForgetPasswordResponse> sendOtpToServer(){
//        @Field("UserName")String UserName,
//        @Field("Password")String Password,
//        @Field("MobileNo")String MobileNo
//    }
//}