package top.lllyl2012.thymeleafDemo.controller;

import java.math.BigDecimal;
import java.util.Date;

public class User {
	private BigDecimal money;
	private Date time;
	public User(BigDecimal money, Date time) {
		super();
		this.money = money;
		this.time = time;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
