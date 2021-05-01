package com.alam.sannan.chatapp.Fragments;

import com.alam.sannan.chatapp.Notifications.MyResponse;
import com.alam.sannan.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAABFPb2zA:APA91bEBcSZ-MrDFMJyPtUAusmEPDmP-e2f2fPz5xmbxV_lR-VGDA8kWkrCIYohIJQFostig8hsTGr6VKJbpjziqUs7bulbNnUwCDndaJP6QM8T_5UBhAG0BqIfGK0M9qyKBmzUSN8gn"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
