package com.apress.prospring3.ch2;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
	private static MessageSupportFactory instance = null;
	private Properties props = null;
	private MessageRenderer renderer = null;
	private MessageProvider provider = null;
	
	private MessageSupportFactory() {
		props = new Properties();
		try {
			// props.load(new FileInputStream("/ch2/src/conf/msf.properties"));
			// props.load(new FileInputStream("C:\\Users\\Alexander\\Documents\\workspace-sts-3.6.0.RELEASE\\HelloWorld\\src\\conf\\msf.properties"));
			props.load(new FileInputStream("C:\\Projects\\Java\\workspace-sts-3.6.0.RELEASE\\HelloWorld\\src\\conf\\msf.properties"));
			
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			renderer = (MessageRenderer)Class.forName(rendererClass).newInstance();
			provider = (MessageProvider)Class.forName(providerClass).newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	static {
		instance = new MessageSupportFactory();
	}
	public static MessageSupportFactory getInstance() {
		return instance;
	}
	public MessageRenderer getMessageRenderer() {
		return renderer;
	}
	public MessageProvider getMessageProvider() {
		return provider;
	}
}
