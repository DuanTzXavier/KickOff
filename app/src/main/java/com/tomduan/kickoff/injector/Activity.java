package com.tomduan.kickoff.injector;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by tomduan on 16-3-10.
 */
@Scope
@Retention(RUNTIME)
public @interface Activity {
}
