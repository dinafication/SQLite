package Poc.TestSqliteJdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Poc.TestSqliteJdbc.entity.Word;
import Poc.TestSqliteJdbc.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	// Initialize Spring ApplicationContext
    	ApplicationContext ctx = new ClassPathXmlApplicationContext
    	("C:/Users/Dina/git/SQLite/TestSqliteJdbc/src/main/resources/springAppCntx.xml");
    	
      
    }
}
