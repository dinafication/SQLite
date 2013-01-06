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
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import Poc.TestSqliteJdbc.dao.WordDao;
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
    	("springAppCntx.xml");
    	
    	JdbcTemplate simpleJdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    	
    	WordDao wd = (WordDao) ctx.getBean("wordDao");
    	Word w = wd.findById("p1", "GER");
    	
//    	String sql = "SELECT count(*) FROM Word";
//    	 
//    	int customers  = simpleJdbcTemplate.queryForInt(sql);
    	//simpleJdbcTemplate.query(sql, Word.class);
    	
    	System.out.print(w.getLanguage());
      
    }
}
