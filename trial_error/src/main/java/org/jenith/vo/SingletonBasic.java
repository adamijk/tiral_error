package org.jenith.vo;

public class SingletonBasic {
	public static final SingletonBasic instance = new SingletonBasic();
	private SingletonBasic(){}
	public static SingletonBasic getInstance(){
		return instance;
	}
}
