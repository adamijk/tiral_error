package org.jenith.main;

import org.jenith.designpatterns.singleton.SingletonStaticBlock;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonTest {

	public static void main(String args[]){
		Singleton singletonTest = Singleton.getInstance();
		singletonTest.print();
		SingletonStaticBlock ssb = SingletonStaticBlock.getInstance();
		SingletonStaticBlock ssb2 = SingletonStaticBlock.getInstance();
	}

}

