package com.tomduan.kickoff;

import android.app.Application;

import com.tomduan.kickoff.injector.components.AppComponent;
import com.tomduan.kickoff.injector.components.DaggerAppComponent;
import com.tomduan.kickoff.injector.modules.AppModule;

/**
 * Created by tomduan on 16-4-19.
 */
public class BaseApplication extends Application {


    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return this.mAppComponent;
    }
}
