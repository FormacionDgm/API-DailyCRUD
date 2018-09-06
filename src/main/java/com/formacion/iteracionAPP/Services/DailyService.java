package com.formacion.iteracionAPP.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.iteracionAPP.Entities.Daily;
import com.formacion.iteracionAPP.Repositories.DailyIdentify;
import com.formacion.iteracionAPP.Repositories.DailyRepository;

@Service
public class DailyService implements DailyServiceInterface {

	@Autowired
	private DailyRepository dailyRepo;

	@Override
	public boolean addDaily(Daily daily) {
		boolean saveDone = false;
		Optional<Daily> dailyInDDBB = dailyRepo.findByDailyIdentifyUserAndDailyIdentifyDate(
				daily.getDailyIdentify().getUser(), daily.getDailyIdentify().getDate());
		if (!dailyInDDBB.isPresent()) {
			daily = dailyRepo.save(daily);
			saveDone = true;
		}
		return saveDone;
	}
	
}
