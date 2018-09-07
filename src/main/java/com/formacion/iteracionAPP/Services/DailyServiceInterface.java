package com.formacion.iteracionAPP.Services;

import java.util.Date;

import com.formacion.iteracionAPP.Entities.Daily;
import com.formacion.iteracionAPP.dto.ResponseFullDTO;

public interface DailyServiceInterface {

	
	boolean addDaily(Daily daily);
	ResponseFullDTO getDaily(String user, Date date);
	
}
