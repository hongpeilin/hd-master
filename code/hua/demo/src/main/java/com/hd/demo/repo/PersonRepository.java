package com.hd.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hd.demo.entity.Person;

// 类似与@RestController @Service，将本类的一个实现注入到Spring容器，以供Service层注入。
@Repository
//本接口用于处理SQL操作，框架会自动实例化一个该类的对象进性jdbc操作。
public interface PersonRepository extends CrudRepository<Person, Integer> {

	/*
	 * 按照框架规则定义的方法名，框架根据该方法名称会执行：
	 * select * from person where id=${id}
	 * 其它细节，查看文档：https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/
	 */
	Person findTopById(Integer id);
}
