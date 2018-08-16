package org.jenith.designpatterns.factory;

public class PC extends Computer {
	private String ram;
	private String cpu;
	private String hdd;

	public PC(String ram, String hdd, String cpu) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
}
