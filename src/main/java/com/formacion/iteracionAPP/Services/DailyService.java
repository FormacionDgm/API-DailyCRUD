package com.formacion.iteracionAPP.Services;

import java.util.Date;
//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.iteracionAPP.Entities.Daily;
//import com.formacion.iteracionAPP.Repositories.DailyIdentify;
import com.formacion.iteracionAPP.Repositories.DailyRepository;
import com.formacion.iteracionAPP.dto.ResponseFullDTO;
import com.formacion.iteracionAPP.dto.model.Status;

@Service
public class DailyService implements DailyServiceInterface {

	@Autowired
	private DailyRepository dailyRepo;

	@Override
	public boolean addDaily(Daily daily) {
		boolean saveDone = false;
//		Optional<Daily> dailyInDDBB = dailyRepo.findByDailyIdentifyUserAndDailyIdentifyDate(
//				daily.getDailyIdentify().getUser(), daily.getDailyIdentify().getDate());
		
		Daily dailyDDBB = this.isDaily(daily.getUser(), daily.getDate());
		if (dailyDDBB != null) {
			daily = dailyRepo.save(daily);
			saveDone = true;
		}
		return saveDone;
	}

	public ResponseFullDTO getDaily(String user, Date date) {
		Daily daily = this.isDaily(user, date);
		System.out.println("User: "+ user + "\nDate: " + date.getTime());
		ResponseFullDTO reponseDaily = (daily != null)
												? new ResponseFullDTO(daily,Status.OK) 
												: new ResponseFullDTO(user,date ,Status.NOT_FOUND);
		System.out.println(reponseDaily.toString());
		return reponseDaily;
	}
	
	private Daily isDaily(String user, Date date) {
		Daily daily= dailyRepo.findByDailyIdentifyUserAndDailyIdentifyDate(user, date);
		
		return daily;
	}
}
