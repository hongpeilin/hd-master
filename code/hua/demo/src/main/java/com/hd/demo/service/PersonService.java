package com.hd.demo.service;

import com.hd.demo.entity.Person;

public interface PersonService {

	Person findOne(Integer id);

	String add(String name);
}
