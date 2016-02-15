package com.sambatech.sample.rest;

import com.sambatech.player.model.SambaMedia;
import com.sambatech.sample.model.LiquidMedia;

import java.util.ArrayList;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;


/**
 * Created by tmiranda on 11/01/16.
 */
public interface ILiquidApi {

    @Headers({
            "Content-type: application/json"
    })

    @GET("medias")
    Call<ArrayList<LiquidMedia>> getMedias(@Query("access_token") String token, @Query("pid") int pid, @Query("published") Boolean published, @Query("types") String type);

    @GET("media/{mediaId}")
    Call<SambaMedia> getMedia(@Path("mediaId") String mediaId);

    @GET("{url}")
    Call<ArrayList<LiquidMedia.AdTag>> getTags(@Path("url") String url);

}
