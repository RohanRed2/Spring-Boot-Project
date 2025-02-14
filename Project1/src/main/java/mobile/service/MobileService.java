package mobile.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import mobile.model.Mobile;
import mobile.model.MobileStatus;

@Service
public class MobileService {
	
	
	@Autowired
	private mobile.dao.MobileDAO mobileDao;
	
	
	public MobileStatus addMobile(Mobile m)
	{
		MobileStatus mobileStatus =new 
				MobileStatus(0,"failed adding",new Mobile(0,"A",-1,-1,-1));
		if(!mobileDao.existsById(m.getImeiNumber()))
		{
				mobileDao.save(m); //insert or updte
				mobileStatus.setStatusCode(1);
				mobileStatus.setMessage("added successfully");
		}
		
		
		return mobileStatus;
		
		
	}
	
	
	
	public MobileStatus updateMobile(Mobile m)
	{
		MobileStatus mobileStatus =new 
				MobileStatus(0,"failed update",new Mobile(0,"A",-1,-1,-1));
	
		if(mobileDao.existsById(m.getImeiNumber()))
		{
				mobileDao.save(m); //insert or updte
				mobileStatus.setStatusCode(1);
				mobileStatus.setMessage("udpated successfully");
		}
	
		
		return mobileStatus;
		
		
	}
	
	public MobileStatus removeMobile(int imeiNo)
	{
		MobileStatus mobileStatus =new 
				MobileStatus(0,"mobile not removed",new Mobile(0,"A",-1,-1,-1));
		if(mobileDao.existsById(imeiNo))
		{
				mobileDao.deleteById(imeiNo); //insert or updte
				mobileStatus.setStatusCode(1);
				mobileStatus.setMessage("removed successfully");
		}
	
		
		return mobileStatus;
		
		
	}
	
	public List<Mobile> getAllMobiles()
	{
				return mobileDao.findAll();
		
	}



    public Mobile getMobile(int imeiNo) {
        return mobileDao.findById(imeiNo).orElse(null);
    }
	
	
	
	

}
