package com.tomduan.kickoff.injector.modules;

import android.content.Context;

import com.tomduan.kickoff.injector.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tomduan on 16-3-10.
 */
@Module
public class ActivityModule {

    private final Context mContext;

    public ActivityModule(Context mContext) {
        this.mContext = mContext;
    }

    @Provides @Activity
    Context provideActivityContext(){
        return mContext;
    }
}
