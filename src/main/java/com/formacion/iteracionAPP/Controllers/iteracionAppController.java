package com.formacion.iteracionAPP.Controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;


import com.formacion.iteracionAPP.Services.DailyService;
import com.formacion.iteracionAPP.dto.RequestContent;
import com.formacion.iteracionAPP.dto.RequestDateContent;
import com.formacion.iteracionAPP.dto.ResponseDTO;
import com.formacion.iteracionAPP.dto.ResponseFullDTO;


@RestController

public class iteracionAppController {

	@Autowired
	private DailyService dailyService;

	@RequestMapping(value = "/daily", method = RequestMethod.POST)
	public ResponseDTO newDailyUser(
			@RequestParam(value = "user", required = true) String user,
			@RequestBody RequestContent content) 
	{
		
		//Daily daily = new Daily(user, CommonServices.getDateNow(), content.getContent());
		ResponseDTO responseDTO =  dailyService.addDailyWithUser(user, content);
		return responseDTO;
	}
	
	@RequestMapping(value = "/daily" , method = RequestMethod.GET)
	public ResponseFullDTO getDaily(
			@RequestParam(required = true) String user,
			@RequestParam(required = true) Date date) 
	{
		ResponseFullDTO responseDto = dailyService.getDaily(user, date);
		return responseDto;
	}
	
	@RequestMapping(value="/daily", method = RequestMethod.PUT)
	public ResponseDTO updateDaily(
			@RequestParam(value ="user",required = true) String user,
			@RequestParam(value = "date") Date date,
			@RequestBody RequestDateContent updateContent
			)
	{
		ResponseDTO	responseDto = dailyService.updateDaily(user, date, updateContent);
		return responseDto;
	}

}
