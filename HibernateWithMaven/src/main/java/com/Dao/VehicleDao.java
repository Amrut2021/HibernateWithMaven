package com.Dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;


import com.Entity.Vehicle;

public class VehicleDao {
	
	public void InsertData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Vehicle Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Vehicle Color: ");
        String color = sc.nextLine();
        
        System.out.print("Enter Vehicle Model: ");
        String model = sc.nextLine();
		
		String hqlQuery="insert into Vehicle(name,color,model)values(:myName,:myColor,:myModel)";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("myName", name);
		query.setParameter("myColor", color);
		query.setParameter("myModel", model);
		
		query.executeUpdate();
		tr.commit();
		sc.close();
		ss.close();
	}
	
	public void UpdateData()
	
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id: ");
        int id=sc.nextInt();
        sc.nextLine();
		
		System.out.print("Enter Vehicle Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Vehicle Color: ");
        String color = sc.nextLine();
        
        System.out.print("Enter Vehicle Model: ");
        String model = sc.nextLine();
		
		String hqlQuery="Update Vehicle set name=:myName ,color=:myColor,model=:myModel where id=:myid";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("myName", name);
		query.setParameter("myColor", color);
		query.setParameter("myModel", model);
		query.setParameter("myid", id);
		
		query.executeUpdate();
		tr.commit();
		sc.close();
		ss.close();
	}
public void deleteData()
	
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id: ");
        int id=sc.nextInt();
		
		String hqlQuery="delete Vehicle where id=:myid";
		MutationQuery query=ss.createMutationQuery(hqlQuery);
		query.setParameter("myid", id);
		query.executeUpdate();
		tr.commit();
		sc.close();
		ss.close();	
	}

}
