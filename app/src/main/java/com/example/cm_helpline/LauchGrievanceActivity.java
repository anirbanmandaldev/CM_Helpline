package com.example.cm_helpline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.cm_helpline.ui.API;
import com.example.cm_helpline.ui.RetrofitClient;
import com.example.cm_helpline.ui.User;
import com.example.cm_helpline.ui.UserResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LauchGrievanceActivity extends AppCompatActivity {

    private static final String TAG = "LauchGrievanceActivity";
   API apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lauch_grievance);
        apiInterface = RetrofitClient.getClient().create(API.class);

        User user = new User("morpheus", "9655555565", "", "","" );
        Call<UserResponse> call1 = apiInterface.saveUserdetails(user);
        call1.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse( @NonNull Call<UserResponse> call, @NonNull Response<UserResponse> response) {
                UserResponse mUserResponse = response.body();
                Log.d(TAG, "onResponse: "+mUserResponse);
                assert mUserResponse != null;
                Toast.makeText(getApplicationContext(),""+mUserResponse.getMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure( @NonNull Call<UserResponse> call, @NonNull Throwable t) {
                call.cancel();
            }
        });

    }
}