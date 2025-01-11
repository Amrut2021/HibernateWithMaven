package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.ProductEntity;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class ProductDao {
	
	public void InsertData() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(ProductEntity.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		ProductEntity p=new ProductEntity();
		p.setName("Suger");
		p.setPrice(50);
		p.setWeight("1 Kg");
		p.setColor("White");
		ss.persist(p);
		tr.commit();
		ss.close();		
	}
	
	public void GetSingleRecord() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(ProductEntity.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int id=2;
		ProductEntity p =ss.get(ProductEntity.class, id);
		System.out.println(p);
		tr.commit();
	}
	
	public void DeleteData() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(ProductEntity.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int id=1;
		ProductEntity p =ss.get(ProductEntity.class, id);
		ss.remove(p);
		tr.commit();
	}
	
	public void UpdateData() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(ProductEntity.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int id=2;
		ProductEntity p =ss.get(ProductEntity.class, id);
		p.setColor("Brown");
		ss.merge(p);
		tr.commit();
		ss.close();
	}
	
	public void FetchAll() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(ProductEntity.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		CriteriaQuery<Object>cq=cb.createQuery();
		Root<ProductEntity>root=cq.from(ProductEntity.class);
		cq.select(root);
		
		Query query=ss.createQuery(cq);
		
		List<ProductEntity>list=query.getResultList();
		for (ProductEntity p : list) {
			System.out.println(p);			
		}
		tr.commit();

	}

}
