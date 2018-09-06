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
import com.formacion.iteracionAPP.dto.RequestContent;
import com.formacion.iteracionAPP.dto.ResponseDTO;
import com.formacion.iteracionAPP.dto.model.CommonServices;
import com.formacion.iteracionAPP.dto.model.Status;

@RestController

public class iteracionAppController {

	@Autowired
	private DailyService dailyService;

	@RequestMapping(value = "/daily", method = RequestMethod.POST)
	public ResponseDTO newDailyUser(@RequestParam(value = "user", required = true) String user,
			@RequestBody RequestContent content) {
		ResponseDTO responseDTO;
		Daily daily = new Daily(new DailyIdentify(user, CommonServices.getDateNow()), content.getContent());
		if (dailyService.addDaily(daily)) {
			responseDTO = new ResponseDTO(Status.OK);
		} else {
			responseDTO = new ResponseDTO(Status.FAIL);
		}
		
		return responseDTO;
	}

}
