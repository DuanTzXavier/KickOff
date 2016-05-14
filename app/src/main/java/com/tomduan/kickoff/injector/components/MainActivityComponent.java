package com.tomduan.kickoff.injector.components;

import com.tomduan.kickoff.domain.net.GetSeasonsUsecase;
import com.tomduan.kickoff.injector.Activity;
import com.tomduan.kickoff.injector.modules.ActivityModule;
import com.tomduan.kickoff.injector.modules.MainAcitvityModule;

import dagger.Component;

/**
 * Created by tomduan on 16-4-19.
 */
@Activity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class, MainAcitvityModule.class})
public interface MainActivityComponent {
    GetSeasonsUsecase getxxxx();
}
