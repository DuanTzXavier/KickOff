package com.tomduan.kickoff.domain.net;

import com.tomduan.kickoff.domain.Usecase;
import com.tomduan.kickoff.model.Repository;
import com.tomduan.kickoff.model.SoccerSeason;

import java.util.List;

import retrofit2.Response;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by tomduan on 16-4-19.
 */
public class GetSeasonsUsecase implements Usecase<Response<List<SoccerSeason>>> {

    private final Repository mRepository;
    private final String year;

    public GetSeasonsUsecase(Repository mRepository, String year) {
        this.mRepository = mRepository;
        this.year = year;
    }

    @Override
    public Observable<Response<List<SoccerSeason>>> execute() {
        return mRepository.getSoccerSeasons(year)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
