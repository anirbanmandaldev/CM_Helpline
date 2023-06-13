package com.example.cm_helpline.ui;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface API {
    @POST("")
    Call<UserResponse> saveUserdetails (@Body User muser );
}
