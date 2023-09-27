package com.hd.demo.entity;

import org.springframework.data.annotation.Id;

public class Person {
	
	public static Person notFound(Integer id) {
		return new Person(id, "No Person found!");
	}

	//该注解指定该字段映射到表中的主键字段。
	@Id
	private Integer id;
	private String name;

	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
