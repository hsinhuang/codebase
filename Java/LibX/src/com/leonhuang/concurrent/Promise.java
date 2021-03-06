package com.leonhuang.concurrent;

import com.leonhuang.common.Func0WithErr;

public abstract class Promise<T> extends Func0WithErr<T, Exception> {
    @Override
    public abstract T apply() throws Exception;

    public final Future<T> future() {
        return new Future<T>(this);
    }
}
