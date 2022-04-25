package com.observer;

public class Subscriber {

	private String name;
	private Channel channel;

	public Subscriber(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println("Hey " + name + " , " + channel.title + " uploaded in " + channel.channel);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

}
