package com.rcyc.ritzkids.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rcyc.ritzkids.bean.RygLanguage;

@Repository
public interface RygRepository extends JpaRepository<RygLanguage, Long>{

	Optional<RygLanguage> findById(String string);
	
	

	//Optional<GuradianDetailsBean> findByGuardianId(String guardianId);
	
	//Optional<GuradianDetailsBean> save(Optional<GuradianDetailsBean> guardiandetails);
	
	/*
	 * Optional<RygPermission> findByPermissionId(String permissionId);
	 * 
	 * Optional<RygPermission> findByPermissionId(int i);
	 * 
	 * Optional<RygCheckinCheckoutBean> findByCheckinCheckoutId(String
	 * permissionId);
	 * 
	 * Optional<RygPermission> findByCheckinCheckoutId(int i);
	 */

//	Optional<RygCheckinCheckoutBean> save(Optional<RygCheckinCheckoutBean> chekincheckoutsbeandetails);

	


	//Optional<RygCheckinCheckoutBean> save(Optional<RygCheckinCheckoutBean> String);
	
	
}








