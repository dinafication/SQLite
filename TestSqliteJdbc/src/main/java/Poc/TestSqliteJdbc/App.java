package Poc.TestSqliteJdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.Session;

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
       
    	Session session = null;
		
		try {
			session = HibernateUtil.getSession();
			
			// Fetching saved data
			List<Word> wordList = session.createQuery("from Word").list();
			
			for (Word w : wordList) {
				System.out.println(w);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally{
			if(session != null) {
				session.close();
			}
		}
      
    }
}
