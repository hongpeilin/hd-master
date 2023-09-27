package com.hd.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hd.demo.entity.Person;
import com.hd.demo.repo.PersonRepository;
import com.hd.demo.service.PersonService;

//@Service注解会实例化一个PersonServiceImpl对象，注册到Spring容器，以供Controller对象使用
@Service
//代表该Class的所有方法都自动带有事务处理功能。
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository repo;

	@Override
	public Person findOne(Integer id) {
		return repo.findTopById(id);
	}

	@Override
	public String add(String name) {
		repo.save(new Person(null, name));
		return "SUCCESS";
	}

}
