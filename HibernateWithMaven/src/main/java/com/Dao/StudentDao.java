package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.Entity.Student;

public class StudentDao {
	
	public void InsertData() {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		String hqlQuery="insert into Student(fName,lName,age,gender)values(:fName,:lName,:age,:gender)";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("fName","Ayush");
		query.setParameter("lName","Pawar");
		query.setParameter("age","24");
		query.setParameter("gender","Male");
		query.executeUpdate();
		tr.commit();	
	}
	
	public void UpdateData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		String hqlQuery="update Student set fName=:myname where id=:myid";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("fName","Raj");
		query.setParameter("myid", 2);
		query.executeUpdate();
		tr.commit();	
	}
	
	public void DeleteData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		String hqlQuery="delete Student where id=:myid";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("myid",3);
		query.executeUpdate();
		tr.commit();		
	}
	
	public void GetSingleRecord() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		String hqlQuery="from Student where id=:myid";
		Query<Student> query=ss.createQuery(hqlQuery,Student.class);
		query.setParameter("myid", 1);
		Student s= query.getSingleResult();
		System.out.println(s);
		tr.commit();
	}
	public void FetchAllRecord() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		String hqlQuery="from Student";
		Query<Student> query=ss.createQuery(hqlQuery,Student.class);
	
		List<Student>list= query.getResultList();
		for(Student s:list) {
		System.out.println(s);
		}
		tr.commit();
	}
	

}
