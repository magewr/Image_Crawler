package com.example.wr.crawler.ui.listener;

import android.widget.Toast;

import com.example.wr.crawler.App;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;

/**
 * Created by loadm on 2018-02-27.
 */

public class SimpleSingleObserver<T> extends DisposableSingleObserver<T> {

    @Override
    public void onSuccess(T t) {

    }

    @Override
    public void onError(Throwable e) {
        Toast.makeText(App.getContext(), "에러발생 : " + e.getMessage(), Toast.LENGTH_LONG).show();
    }
}
