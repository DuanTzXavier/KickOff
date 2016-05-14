package com.tomduan.kickoff.injector.modules;

import com.tomduan.kickoff.domain.net.GetSeasonsUsecase;
import com.tomduan.kickoff.injector.Activity;
import com.tomduan.kickoff.model.Repository;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tomduan on 16-4-19.
 */
@Module
public class MainAcitvityModule {

    private final String year;

    public MainAcitvityModule(String year) {
        this.year = year;
    }

    @Activity
    @Provides
    GetSeasonsUsecase provideGetSeasonsUsecase(Repository repository){
        return new GetSeasonsUsecase(repository, year);
    }
}
