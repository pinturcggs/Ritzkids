package com.rcyc.ritzkids.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rcyc.ritzkids.RygNotFoundException;
import com.rcyc.ritzkids.bean.ReqLanguage;
import com.rcyc.ritzkids.bean.RygLanguage;
import com.rcyc.ritzkids.service.RygService;

@RestController
@RequestMapping("/api")
public class RygController {

	 @Autowired
	 private RygService rygservice;

	/*
	 * @GetMapping("/permissiondetails") public Optional<RygPermission>
	 * getPermission(@RequestBody ReqPermission permission) {
	 * Optional<RygPermission> permissiondetails; System.out.println("guardianId:" +
	 * permission.getPermissionId()); try {
	 * 
	 * permissiondetails =
	 * rygservice.getRygPermission(permission.getPermissionId()); } catch
	 * (RygNotFoundException e) {
	 * 
	 * throw new RygNotFoundException("Value is coming Null");
	 * 
	 * } return permissiondetails;
	 * 
	 * }
	 */
		
	/*
	 * 
	 * 
	 * @GetMapping("/checkincheckoutbean")
	 * 
	 * public Optional<RygCheckinCheckoutBean> getCheckinCheckoutBean(@RequestBody
	 * ReqCheckinCheckout checkInChekout) { Optional<RygCheckinCheckoutBean>
	 * checkincheckoutbeans; System.out.println("checkinCheckoutId:" +
	 * checkInChekout.getCheckinCheckoutId()); try {
	 * 
	 * checkincheckoutbeans=rygservice.getCheckinCheckoutBean(checkInChekout.
	 * getCheckinCheckoutId()); }catch(RygNotFoundException e) {
	 * 
	 * throw new RygNotFoundException("Value is coming Null");
	 * 
	 * } return checkincheckoutbeans;
	 * 
	 * }
	 */

	@GetMapping("/languagedetails")
	public RygLanguage getGuradianDetails(@RequestBody ReqLanguage language) {
		RygLanguage languaged;
		System.out.println("guardianId:" + language.getLanguageId());
		try {

			languaged = rygservice.getLanguageDetails(language.getLanguageId());
		} catch (RygNotFoundException e) {

			throw new RygNotFoundException("Value is coming Null");

		}
		return languaged;

	}

	
}

