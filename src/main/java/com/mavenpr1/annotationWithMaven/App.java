package com.mavenpr1.annotationWithMaven;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Apllication Started..." );
        
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session ses1=factory.openSession();
        
        Student s1=(Student)ses1.load(Student.class,10);
        
        System.out.println("getting first object..........");
        System.out.println(s1.getId()+"..."+s1.getName());
        
        Transaction tx=ses1.beginTransaction();
        
        ses1.save(s1);
        tx.commit();
        ses1.close();
        
        Session ses2=factory.openSession();
        Student s2=(Student)ses2.load(Student.class,10);
        
        System.out.println("getting seecond object.....");
        System.out.println(s2.getId()+"..."+s2.getName());
        
        Transaction tx1=ses2.beginTransaction();

        ses2.save(s2);

        tx1.commit();
        ses2.close();
        System.out.println("session closed.....");
      //  factory.close();
        
      
    }
}
