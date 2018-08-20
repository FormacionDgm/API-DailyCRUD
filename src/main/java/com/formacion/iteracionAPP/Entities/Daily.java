package com.formacion.iteracionAPP.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

import com.formacion.iteracionAPP.Repositories.DailyIdentify;



@Entity
@Table(name = "dailies")
public class Daily implements Serializable {


	@EmbeddedId
	private DailyIdentify dailyIdentify;
	
	@NonNull
	private String content;

	/* Construct */
	public Daily() {

	}

	

	public Daily(DailyIdentify dailyIdentify, String content) {
		this.dailyIdentify = dailyIdentify;
		this.content = content;
	}

	


	public DailyIdentify getDailyIdentify() {
		return dailyIdentify;
	}



	public void setDaiylyIdentify(DailyIdentify dailyIdentify) {
		this.dailyIdentify = dailyIdentify;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public void printDaily() {
		System.out.println( "User: \t"+ this.getDailyIdentify().getUser() );
		System.out.println( "Content: \t"+ this.getContent() );
		System.out.println( "Date: \t"+ this.getDailyIdentify().getDate() );
	}
	public String dailyToScreen() {
		return 	"<p>\nUser: \t"+ this.getDailyIdentify().getUser() +
				"\nContent: \t"+ this.getContent()+
				"\nDate: \t"+ this.getDailyIdentify().getDate() +
				"</p>";
	}
}
