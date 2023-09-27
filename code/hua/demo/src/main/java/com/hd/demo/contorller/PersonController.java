package com.hd.demo.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hd.demo.entity.Person;
import com.hd.demo.service.PersonService;

//添加@RestController，会让Spring容器自动将这个类的对象初始化。
@RestController
public class PersonController {

	//@Autowired注解会自动将Spring容器中的PersonService对象注入到以下属性（personService）
	@Autowired
	private PersonService personService;
	
	//声明一个url,供外部调用。
	@RequestMapping("/findOne")
	public Person findOne(Integer id) {
		if (id == null) {
			return Person.notFound(id);
		}
		return personService.findOne(id);
	}
	
	@RequestMapping("/add")
	public String add(String name) {
		if (name != null && "".equals(name)) {
			return "ERROR";
		}
		return personService.add(name);
	}
	
}
