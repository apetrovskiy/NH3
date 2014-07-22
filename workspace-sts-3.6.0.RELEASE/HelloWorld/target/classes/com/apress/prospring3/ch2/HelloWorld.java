package com.apress.prospring3.ch2;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		// System.out.println("Hello World!");
		// 2
		/*
		if (args.length > 0) {
			System.out.println(args[0]);
		} else {
			System.out.println("Hello World!");
		}
		*/
		// 3
		/*
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
		*/
		// 4
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}

}
