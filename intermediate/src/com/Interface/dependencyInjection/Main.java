package com.Interface.dependencyInjection;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.observers.BlockingFirstObserver;

public class Main {
	public static void main(String[] args) {
		String[] letters = { "a", "b", "c", "d", "e", "f", "g" };
		Observable<String> observable = Observable.fromArray(letters);
		observable.blockingSubscribe(new Consumer<String>() {

			@Override
			public void accept(@NonNull String t) throws Throwable {
				System.out.println(t);

			}
		}, new Consumer<Throwable>() {

			@Override
			public void accept(@NonNull Throwable t) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println(t.getMessage());
			}
		}, new Action() {

			@Override
			public void run() throws Throwable {
				// TODO Auto-generated method stub
				System.err.println("complete");
			}
		});

		/*
		 * observable.subscribe(i -> result += i, // OnNext Throwable::printStackTrace,
		 * // OnError () -> result += "_Completed" // OnCompleted );
		 */

	}
}
