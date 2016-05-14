package com.tomduan.kickoff.injector.components;

import com.tomduan.kickoff.BaseApplication;
import com.tomduan.kickoff.injector.modules.AppModule;
import com.tomduan.kickoff.model.Repository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tomduan on 16-3-10.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    BaseApplication application();
    Repository repository();
}
