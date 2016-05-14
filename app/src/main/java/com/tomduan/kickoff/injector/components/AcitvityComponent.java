package com.tomduan.kickoff.injector.components;

import android.content.Context;

import com.tomduan.kickoff.injector.Activity;
import com.tomduan.kickoff.injector.modules.ActivityModule;

import dagger.Component;

/**
 * Created by tomduan on 16-3-10.
 */
@Activity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface AcitvityComponent {
    Context context();
}
