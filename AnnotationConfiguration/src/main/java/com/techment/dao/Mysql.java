package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Mysql implements IDao {

	@Override
	public void dataBaseName() {
		System.out.println("connecting to mysql database");
	}

}
