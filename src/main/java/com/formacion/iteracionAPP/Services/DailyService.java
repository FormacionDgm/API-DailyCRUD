package com.formacion.iteracionAPP.Services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.formacion.iteracionAPP.Entities.Daily;
import com.formacion.iteracionAPP.Repositories.DailyIdentify;
import com.formacion.iteracionAPP.Repositories.DailyRepository;

@Service
public class DailyService implements DailyServiceInterface {

	private DailyRepository dailyRepo;
	
	@Override
	public boolean addDaily(Daily daily) {
		Optional <Daily> dailyInDDBB = null;
		boolean saveDone = false; 
		dailyInDDBB = dailyRepo.findByDailyIdentifyUserAndDailyIdentifyDate(
				daily.getDailyIdentify().getUser(),daily.getDailyIdentify().getDate()); 
		if( dailyInDDBB == null ) {	
			dailyRepo.save(daily);
			saveDone = true;
		}
		return saveDone;
	}


	
	
}
