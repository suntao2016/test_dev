package com.ccigmall.auto.test.utils;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class DataProviderTest {
	public void testInitProperty() {
		ResourceBundle bundle = DataProvider
				.initProperty("regression/test/base");
		Enumeration<String> en = bundle.getKeys();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				int j = 10;
				while (true) {
					if (j > 0) {
						try {
							Thread.sleep(1000);
							System.out.println(j);
							j--;
							if(j==0){
								System.exit(0);
							}						
							System.out.println(Thread.currentThread().getName());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}

		}, "checkAutoRunning").start();
	}

}
