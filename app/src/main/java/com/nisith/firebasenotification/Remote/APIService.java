package com.nisith.firebasenotification.Remote;

import com.nisith.firebasenotification.Model.MyResponse;
import com.nisith.firebasenotification.Model.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAv0Vchrw:APA91bFeybyv3vTmLQ4E_hPCm_97laYjjF0wys1Ubs66bFzFvavgA0gx3c5j_vz5zANfQyIUdVEPpuT6WhWsXhUbV14W0kH_Sxe0p-ZF2xHMuu9zVt71vDUUNhTEHMXb0j3jZ_WRoa9c"
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
