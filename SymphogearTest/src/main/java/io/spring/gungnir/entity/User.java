package io.spring.gungnir.entity;

import lombok.Data;

@Data
public class User {

	/*
	 * ユーザー情報 entity
	 */
	private int id;
	private String name;
	private String symphogear_name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymphogearName() {
		return symphogear_name;
	}
	public void setSymphogearName(String symphogear_name) {
		this.symphogear_name = symphogear_name;
	}
	
	
}
