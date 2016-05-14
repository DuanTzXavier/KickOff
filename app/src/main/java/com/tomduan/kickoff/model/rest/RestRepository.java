package com.tomduan.kickoff.model.rest;

import com.tomduan.kickoff.model.Repository;
import com.tomduan.kickoff.model.SoccerSeason;

import java.util.List;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by tomduan on 16-3-10.
 */
public class RestRepository implements Repository {

    private final Api mApi;

    @Inject
    public RestRepository() {
        mApi = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .client(new OkHttpClient.Builder()
                        .addInterceptor(chain ->
                                chain.proceed(chain.request()
                                        .newBuilder()
                                        .addHeader("X-Auth-Token", "35b7af16fca2439a832e1c3351f95963")
                                        .addHeader("X-Response-Control", "minified")
                                        .build()))
                        .build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build().create(Api.class);
    }

    @Override
    public Observable<Response<List<SoccerSeason>>> getSoccerSeasons(String year) {
        return mApi.getSoccerSeasons(year);
    }
}
