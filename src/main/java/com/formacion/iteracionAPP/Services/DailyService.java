package com.formacion.iteracionAPP.Services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.iteracionAPP.Entities.Daily;
import com.formacion.iteracionAPP.Repositories.DailyRepository;
import com.formacion.iteracionAPP.dto.RequestContent;
import com.formacion.iteracionAPP.dto.RequestDateContent;
import com.formacion.iteracionAPP.dto.ResponseDTO;
import com.formacion.iteracionAPP.dto.ResponseFullDTO;
import com.formacion.iteracionAPP.dto.model.CommonServices;
import com.formacion.iteracionAPP.dto.model.Status;

@Service
public class DailyService implements DailyServiceInterface {

	@Autowired
	private DailyRepository dailyRepo;

	@Override
	public ResponseDTO addDailyWithUser(String user, RequestContent content) {
		Daily daily = new Daily(user, CommonServices.getDateNow(), content.getContent());
		ResponseDTO reponseDto = new ResponseDTO();
		reponseDto.setStatus(Status.FAIL);
		Daily dailyDDBB = this.isDaily(daily.getUser(), daily.getDate());
		if (dailyDDBB == null) {
			daily = dailyRepo.save(daily);
			reponseDto.setStatus(Status.OK);
		}
		return reponseDto;
	}

	@Override
	public ResponseFullDTO getDaily(String user, Date date) {
		Daily daily = this.isDaily(user, date);
		ResponseFullDTO reponseDaily = (daily != null) ? new ResponseFullDTO(daily, Status.OK)
				: new ResponseFullDTO(user, date, Status.NOT_FOUND);
		return reponseDaily;
	}

	@Override
	public ResponseDTO updateDaily(String user, Date date, RequestDateContent updateContent) {
		ResponseDTO reponseDto = new ResponseDTO();
		reponseDto.setStatus(Status.FAIL);
		Daily dailyDDBB = this.isDaily(user, date);
		if (dailyDDBB != null) {
			dailyDDBB.setDate(updateContent.getDate());
			dailyDDBB.setContent(updateContent.getContent());
			dailyDDBB = dailyRepo.save(dailyDDBB);
			reponseDto.setStatus(Status.OK);
		}
		return reponseDto;
	}

	private Daily isDaily(String user, Date date) {
		Daily daily = dailyRepo.findByUserAndDate(user, date);
		return daily;
	}

	@Override
	public ResponseDTO addDaily(Daily daily) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDTO updateDDBB() {
		ResponseDTO responseDto = new ResponseDTO();
		responseDto.setStatus(Status.FAIL);
		List<Daily> datas = dailyRepo.findAll();
		int total = datas.size();
		int counter = 0;
		for (Daily data : datas) {
			data = dailyRepo.save(data);
			counter =+ 1;
		}
		if (counter == total) {
			responseDto.setStatus(Status.OK);
		}
		return responseDto;
	}
}
