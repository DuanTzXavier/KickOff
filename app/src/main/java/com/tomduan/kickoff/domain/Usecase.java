package com.tomduan.kickoff.domain;

import rx.Observable;

/**
 * Created by tomduan on 16-3-10.
 */
public interface Usecase<T> {

    Observable<T> execute();


}
