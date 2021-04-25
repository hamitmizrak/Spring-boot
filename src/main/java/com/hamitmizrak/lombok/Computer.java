package com.hamitmizrak.lombok;

import lombok.NonNull;

public class Computer {
	//nesne değişkenleri
	private long computerId;
	@NonNull private String computerName;
	private String computerTradeMark;
	private String computerSales;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(long computerId, String computerName, String computerTradeMark, String computerSales) {
		super();
		this.computerId = computerId;
		this.computerName = computerName;
		this.computerTradeMark = computerTradeMark;
		this.computerSales = computerSales;
	}

	@Override
	public String toString() {
		return "Computer [computerId=" + computerId + ", computerName=" + computerName + ", computerTradeMark="
				+ computerTradeMark + ", computerSales=" + computerSales + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (computerId ^ (computerId >>> 32));
		result = prime * result + ((computerName == null) ? 0 : computerName.hashCode());
		result = prime * result + ((computerSales == null) ? 0 : computerSales.hashCode());
		result = prime * result + ((computerTradeMark == null) ? 0 : computerTradeMark.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (computerId != other.computerId)
			return false;
		if (computerName == null) {
			if (other.computerName != null)
				return false;
		} else if (!computerName.equals(other.computerName))
			return false;
		if (computerSales == null) {
			if (other.computerSales != null)
				return false;
		} else if (!computerSales.equals(other.computerSales))
			return false;
		if (computerTradeMark == null) {
			if (other.computerTradeMark != null)
				return false;
		} else if (!computerTradeMark.equals(other.computerTradeMark))
			return false;
		return true;
	}

	public long getComputerId() {
		return computerId;
	}

	public void setComputerId(long computerId) {
		this.computerId = computerId;
	}

	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	public String getComputerTradeMark() {
		return computerTradeMark;
	}

	public void setComputerTradeMark(String computerTradeMark) {
		this.computerTradeMark = computerTradeMark;
	}

	public String getComputerSales() {
		return computerSales;
	}

	public void setComputerSales(String computerSales) {
		this.computerSales = computerSales;
	}


	
	

}
