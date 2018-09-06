package com.formacion.iteracionAPP.Repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import com.formacion.iteracionAPP.Entities.Daily;

public interface DailyRepository extends JpaRepository<Daily, DailyIdentify> {

//	@Transactional
//	@Query("Select daily from Daily daily where user = ?1 and date = ?2 ")
//	Optional<Daily> findByEmbeddedId(String user, Date date);

	@Transactional
	Optional<Daily> findByDailyIdentifyUserAndDailyIdentifyDate(String user, Date date);
//	
//	@Transactional
//	<S extends Daily> S save(S daily);
//	
//	@Transactional(readOnly = true)
//	List<Daily> findByDailyIdentify(DailyIdentify dailyIdentify);
}
