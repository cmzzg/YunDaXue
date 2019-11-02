package com.yundaxue.test;


import com.yundaxue.dao.impl.PublishDaoImpl;
import com.yundaxue.pojo.Message;

public class Test {
	public static void main(String[] args) {
		Integer a = 1;
	Message m = new Message();
	m.setLike_number(a);
	PublishDaoImpl pdi = new PublishDaoImpl();
	pdi.publishMessageDao(m);
	}
}
