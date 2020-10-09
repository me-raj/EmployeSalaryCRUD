package com.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Salary {
    private int id;
    private double amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
    
    
}
