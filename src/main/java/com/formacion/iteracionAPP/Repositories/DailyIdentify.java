//package com.formacion.iteracionAPP.Repositories;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Date;
//import javax.persistence.Embeddable;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import org.springframework.lang.NonNull;
//
//@Embeddable	//tag to make this "class" a composite primaryKey to Daily
//public class DailyIdentify implements Serializable {
//
//	@NonNull
//	private String user;
//	@NonNull
//	@Temporal(TemporalType.DATE)
//	private Date date;
//	
//	
//	
//	public DailyIdentify() {
//	}
//
//
//	public DailyIdentify(String user, Date date) {
//		this.user = user;
//		this.date = date;
//	}
//
//
//	public String getUser() {
//		return user;
//	}
//
//
//	public void setUser(String user) {
//		this.user = user;
//	}
//
//
//	public Date getDate() {
//		return date;
//	}
//
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	
//	
//	
//}
