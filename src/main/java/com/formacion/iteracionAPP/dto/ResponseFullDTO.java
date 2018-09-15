package com.formacion.iteracionAPP.dto;

import java.util.Date;

import com.formacion.iteracionAPP.Entities.Daily;
import com.formacion.iteracionAPP.dto.model.Status;

import lombok.Data;

@Data
public class ResponseFullDTO extends ResponseDTO {
	
	private String user;
	private Date date;
	private String content;

	public ResponseFullDTO() {
	}
	
	public ResponseFullDTO(String user, Date date, String content) {
		this.user = user;
		this.date = date;
		this.content = content;
	}
	public ResponseFullDTO(String user, Date date,Status status) {
		this.user = user;
		this.date = date;
		this.setStatus(status);
	}
	
	public ResponseFullDTO(Daily daily,Status status) {
		this.user = daily.getUser();
		this.date = daily.getDate();
		this.content = daily.getContent();
		this.setStatus(status);
	}
	

}
