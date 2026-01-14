package com.kh.chap05_sync.synccontrol;

import com.kh.chap05_sync.synccontrol.model.thread.Data;
import com.kh.chap05_sync.synccontrol.model.thread.Consumer;
import com.kh.chap05_sync.synccontrol.model.thread.Provider;

public class Run {
	public static void main(String[] args) {
		Data data = new Data();
		Thread provider = new Thread(new Provider(data));
		Thread consumer = new Thread(new Consumer(data));
		
		provider.start();
		consumer.start();
		
	}
}






















