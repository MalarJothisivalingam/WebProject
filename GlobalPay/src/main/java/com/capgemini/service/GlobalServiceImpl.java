package com.capgemini.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capgemini.dao.GlobalDao;
@Service
@Component("service")
public class GlobalServiceImpl implements GlobalService{
	@Autowired
	GlobalDao dao;

	@Override
	public void method() {
		dao.method();
		
	}

}
