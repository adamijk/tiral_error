package org.jenith.designpatterns.factory;

public class TestComputerFactory {

	public static void main(String []args){
		Computer pc = ComputerFactory.getComputer("PC", "16GB", "10TB", "QuadCore");
		Computer server = ComputerFactory.getComputer("Server", "512GB", "100ZB", "OctaCore");
		
		System.out.println("PC-"+pc);
		System.out.println("Server-"+server);
	}
}
