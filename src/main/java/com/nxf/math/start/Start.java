package com.nxf.math.start;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		System.out.println("生产者启动前");
		ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("生产者启动");
		System.in.read();
	}
}
