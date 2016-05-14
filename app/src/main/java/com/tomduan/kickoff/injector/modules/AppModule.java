package com.tomduan.kickoff.injector.modules;

import com.tomduan.kickoff.BaseApplication;
import com.tomduan.kickoff.model.Repository;
import com.tomduan.kickoff.model.rest.RestRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tomduan on 16-3-10.
 */
@Module
public class AppModule {

    private final BaseApplication mApplication;

    public AppModule(BaseApplication mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    BaseApplication provideApplicationContext(){
        return mApplication;
    }

    @Provides
    @Singleton
    Repository provideRepository(RestRepository repository){
        return repository;
    }
}
