package Poc.TestSqliteJdbc.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

/**
 * The persistent class for the contact database table.
 *
 */
@Entity
@Table(name = "word")
public class Word implements Serializable{

	@Id 
	@Column(name="phrase")
	private String phrase;
	
	@Id 
	@Column(name="language")
	private Integer language;
	
	@Column(name="level")
	private Integer level;

	public Word() {

	}

	public Word(String phrase, Integer language, Integer level) {
		this.phrase = phrase;
		this.language = language;
		this.level = level;
	}

	
	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	 @Id
	public Integer getLanguage() {
		return language;
	}

	public void setLanguage(Integer language) {
		this.language = language;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	
	@Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Phrase: ").append(this.getPhrase()).append(" |language:").append(this.getLanguage()).append(" | level:").append(this.getLevel());
         
        return stringBuilder.toString();
    }

}
