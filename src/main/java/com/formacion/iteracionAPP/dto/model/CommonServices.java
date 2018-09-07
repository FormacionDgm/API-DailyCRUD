package com.formacion.iteracionAPP.dto.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class CommonServices {

	public static Date getDateNow() {
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}
	
}
