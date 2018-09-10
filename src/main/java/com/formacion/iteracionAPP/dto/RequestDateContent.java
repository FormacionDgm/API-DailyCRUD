package com.formacion.iteracionAPP.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

public class RequestDateContent extends RequestContent {

	private Date date;

	public RequestDateContent() {
	}

	public RequestDateContent(Date date,String content) {
		this.date = date;
		this.setContent(content);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
