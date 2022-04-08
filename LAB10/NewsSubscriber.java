package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	private final String name_reader;

	public NewsSubscriber(String name_reader) {
        	this.name_reader = name_reader;
    	}

	@Override
    	public void onSubscribe(Subscription subscription) {
        	System.out.println(name_reader + " subscribed to " + subscription.getClass().getName());
    	}
	@Override
    	public void onNext(News item) {
        	System.out.println(reader + " get the news : " + item.getContent());
    	}
	@Override
    	public void onError(Throwable throwable) {
        	System.out.println("Error");
    	}
	@Override
    	public void onComplete() {
        	System.out.println("Complete");
    	}

}
