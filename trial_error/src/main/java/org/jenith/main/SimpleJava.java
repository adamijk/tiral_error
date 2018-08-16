package org.jenith.main;

import org.springframework.util.StringUtils;

public class SimpleJava {
	public static void main(String[] args) {
		if ("String".equals("STRING")) {
			System.out.println("do");
		}
		System.out.println(StringUtils.capitalize("JENITH"));
	}
}
