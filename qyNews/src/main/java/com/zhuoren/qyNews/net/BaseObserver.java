package com.zhuoren.qyNews.net;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * desc: .
 * author: Zhuoren.
 * date: 2018/12/5 9:19 .
 */

public abstract class BaseObserver<T> implements Observer<T> {

    public abstract void onSuccess(T t);
    public abstract void onFail(Throwable e);
    @Override
    public void onSubscribe(@NonNull Disposable d) {
    }

    @Override
    public void onNext(@NonNull T t) {
        onSuccess(t);
    }

    @Override
    public void onError(@NonNull Throwable e) {
        onFail(e);
    }

    @Override
    public void onComplete() {

    }
}
