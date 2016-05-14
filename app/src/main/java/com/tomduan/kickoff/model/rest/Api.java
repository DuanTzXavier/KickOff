package com.tomduan.kickoff.model.rest;

import com.tomduan.kickoff.model.SoccerSeason;

import java.util.List;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by tomduan on 16-3-10.
 */
public interface Api {
    public static final String BASE_URL = "http://api.football-data.org/v1/";

    @GET("soccerseasons")
    Observable<Response<List<SoccerSeason>>> getSoccerSeasons(
            @Query("season") String year
    );
}
