package com.david.lesson9;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Pencil {
	String company;
	@Value("0.5 mm")
	String leadSize;

	public String getCompany() {
		return company;
	}
	@Required
	@Value("Faber Castel")
	public void setCompany(String company) {
		this.company = company;
	}

	public String getLeadSize() {
		return leadSize;
	}

	public void setLeadSize(String leadSize) {
		this.leadSize = leadSize;
	}

	@Override
	public String toString() {
		return "Pencil [company=" + company + ", leadSize=" + leadSize + "]";
	}

}
