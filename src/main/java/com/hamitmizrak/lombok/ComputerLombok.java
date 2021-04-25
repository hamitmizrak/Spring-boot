package com.hamitmizrak.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor  @NoArgsConstructor   
public class ComputerLombok {
	private long computerId;
    private String computerName;
	private String computerTradeMark;
	private String computerSales;
}
