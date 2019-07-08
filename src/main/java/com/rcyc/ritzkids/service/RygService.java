package com.rcyc.ritzkids.service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.rcyc.ritzkids.RygNotFoundException;
import com.rcyc.ritzkids.bean.RygLanguage;




@Service
public class RygService {
	
    @Autowired
	private com.rcyc.ritzkids.repository.RygRepository repositoryR;
    public RygLanguage getLanguageDetails(Long languageId) {
   	  Optional<RygLanguage> ryglanguagedetails =
   	  repositoryR.findById(languageId);
   	  
   	  return ryglanguagedetails.get(); 
   	  }
	

    
	/*
	 * public Bean updateBean(Bean bean) throws RygNotFoundException { String
	 * userName = bean.getUserName(); Date createdAt= bean.getCreatedAt(); String
	 * updatedAt = bean.getUpdatedAt(); int createdBy = bean.getCreatedBy(); int
	 * updatedBy = bean.getUpdatedBy(); int isActivebean=bean.getIsActive();
	 * 
	 * if(userName!= null ) { System.out.println("User name will be display"); throw
	 * new RygNotFoundException("Value is coming Null"); } System.out.println("No");
	 * return null;//repositoryR.save(bean);
	 * 
	 * 
	 * }
	 */
	
	/*
	 * public BeanRole updateEquipment(BeanRole beanrole) { String name =
	 * beanrole.getName(); String description= beanrole.getDescription(); int
	 * created_by = beanrole.getCreated_by(); String updated_at =
	 * beanrole.getUpdated_at(); int created_by1 = beanrole.getUpdated_by(); int
	 * updated_by = beanrole.getUpdated_by(); int
	 * is_activebean=beanrole.getIs_active();
	 * 
	 * return null;//repositoryR.save(beanrole); }
	 */

	/*
	 * public Optional<RygPermission> getRygPermission(String permissionId) {
	 * Optional<RygPermission> rygpermissionbean =
	 * repositoryR.findByPermissionId(permissionId);
	 * 
	 * return rygpermissionbean;
	 * 
	 * }
	 */
	 
	/*
	 * 
	 * 
	 * public Optional<RygCheckinCheckoutBean> getCheckinCheckoutBean(String
	 * checkincheckoutId) { Optional<RygCheckinCheckoutBean>
	 * chekincheckoutsbeandetails =
	 * repositoryR.findByCheckinCheckoutId(checkincheckoutId);
	 * 
	 * // return repositoryR.save(chekincheckoutsbeandetails); } return
	 * chekincheckoutsbeandetails;
	 * 
	 * }
	 */

	/*
	 * public GuradianDetailsBean getGuardianDetails(Long guardianId) {
	 * Optional<GuradianDetailsBean> guardiandetails =
	 * repositoryR.findById(guardianId);
	 * 
	 * return guardiandetails.get(); }
	 * 
	 */


}



