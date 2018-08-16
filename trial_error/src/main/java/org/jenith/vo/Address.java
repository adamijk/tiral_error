package org.jenith.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private int zipCode;
}
