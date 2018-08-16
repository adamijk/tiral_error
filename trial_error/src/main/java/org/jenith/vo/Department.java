package org.jenith.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department {
	private int departmentId;
	private String departmentCode;
	private String departmentDescription;
}