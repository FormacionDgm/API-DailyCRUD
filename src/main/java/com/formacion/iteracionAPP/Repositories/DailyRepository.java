package com.formacion.iteracionAPP.Repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.formacion.iteracionAPP.Entities.Daily;

public interface DailyRepository extends JpaRepository<Daily, DailyIdentify> {

	@Transactional(readOnly = true)
	Optional<Daily> findByDailyIdentifyUserAndDailyIdentifyDate(String user, Date date);
	
	@Transactional()
	<S extends Daily> S save(S daily);
}
