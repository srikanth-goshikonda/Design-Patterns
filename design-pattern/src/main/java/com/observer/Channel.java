package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	public String channel;
	public String title;

	public Channel(String channel) {
		super();
		this.channel = channel;
	}

	public void subscribe(Subscriber e) {
		e.setChannel(this);
		subscribers.add(e);
	}

	public void unSubscribe(Subscriber e) {
		subscribers.remove(e);

	}

	public void notification() {

		for (Subscriber e : subscribers)
			e.update();
	}

	public void upload(String title) {
		this.title = title;
		this.notification();
	}
}
