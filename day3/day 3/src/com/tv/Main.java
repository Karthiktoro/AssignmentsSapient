package com.tv;

public class Main {
public static void main(String[] args) {
	TvRemote t1 = new SonyTv();
	TvRemote t2 = new BplTv();
	TvRemote t3 = new PanasonicTv();
	
	t1.power();
	t2.power();
	t3.power();
}
}
