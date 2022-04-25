package com.observer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subscriber srikanth = new Subscriber("Srikanth");
		Subscriber naresh = new Subscriber("naresh");
		Subscriber suresh = new Subscriber("suresh");
		Subscriber naveen = new Subscriber("naveen");

		Channel channel = new Channel("SDC");
		channel.subscribe(naveen);
		channel.subscribe(suresh);
		channel.subscribe(naresh);
		channel.subscribe(srikanth);
		channel.upload("Java 8 Features");
	}

}
