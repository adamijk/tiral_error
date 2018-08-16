package org.jenith.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int empID;
	private String empCode;
	private String empName;
	private String empDeptCode;
	private List<Address> empAddresses;
}
