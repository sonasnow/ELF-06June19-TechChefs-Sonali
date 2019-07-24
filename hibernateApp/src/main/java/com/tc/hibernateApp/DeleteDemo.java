package com.tc.hibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tc.hibernate.util.HibernateUtil;
import com.tc.hibernateApp.dto.EmployeeOtherInfoBean;

public class DeleteDemo {
	public static void main(String[] args) {
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
////			cfg.addAnnotatedClass(EmployeeInfoBean.class);
//
//		SessionFactory factory = cfg.buildSessionFactory();
//		Session session = factory.openSession();
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

//		EmployeeInfoBean empInf = session.get(EmployeeInfoBean.class, 101);
//		empInf.setName("Tushar");

		EmployeeOtherInfoBean empother = session.get(EmployeeOtherInfoBean.class, 6);

		Transaction transaction = session.beginTransaction();
		session.delete(empother);
		transaction.commit();

		session.close();
	}
}
