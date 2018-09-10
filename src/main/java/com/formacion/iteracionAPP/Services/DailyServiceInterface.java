package com.formacion.iteracionAPP.Services;

import java.util.Date;
import java.util.List;

import com.formacion.iteracionAPP.Entities.Daily;
import com.formacion.iteracionAPP.dto.RequestContent;
import com.formacion.iteracionAPP.dto.RequestDateContent;
import com.formacion.iteracionAPP.dto.ResponseDTO;
import com.formacion.iteracionAPP.dto.ResponseFullDTO;

public interface DailyServiceInterface {

	
	ResponseDTO addDaily(Daily daily);
	ResponseDTO addDailyWithUser(String user,RequestContent content);
	ResponseFullDTO getDaily(String user, Date date);
	ResponseDTO updateDaily(String user,Date date, RequestDateContent updateContent);
	ResponseDTO updateDDBB();
}
