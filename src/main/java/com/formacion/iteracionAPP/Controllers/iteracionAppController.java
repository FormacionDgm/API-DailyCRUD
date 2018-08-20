package com.formacion.iteracionAPP.Controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.iteracionAPP.Entities.Daily;
import com.formacion.iteracionAPP.Repositories.DailyIdentify;
import com.formacion.iteracionAPP.Services.DailyService;

@RestController

public class iteracionAppController {

	@Autowired
	private DailyService dailyService;

	@RequestMapping(value = "/daily", method = RequestMethod.POST)

	public String newDailyUser(
			@RequestBody String content, 
			@RequestParam(value = "user", required = true) String user
			){
		String estado = "Error al guardar Daily.";
		Date date = new Date();
		Daily daily = new Daily(new DailyIdentify(user, date), content);
		daily.printDaily();
		if (dailyService.addDaily(daily)) 
			{
			estado = "OK, se ha guardado con éxito";
			}
		return estado;
	}
	
}
