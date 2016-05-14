package com.tomduan.kickoff.model;

import java.util.List;

import retrofit2.Response;
import rx.Observable;

/**
 * Created by tomduan on 16-3-10.
 */
public interface Repository {

    Observable<Response<List<SoccerSeason>>> getSoccerSeasons(String year);
}
