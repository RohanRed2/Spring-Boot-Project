package mobile.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mobile.model.Mobile;
import mobile.model.MobileStatus;
import mobile.service.MobileService;

@RestController
public class MobileController {
	
	
	@Autowired
	private MobileService mobileService;
	
	
	
	@PostMapping("/am")
	public MobileStatus addMobile(@RequestBody Mobile m)
	{
		MobileStatus mobileStatus =new 
				MobileStatus(0,"failed adding",new Mobile(0,"A",-1,-1,-1));
		return mobileService.addMobile(m);
		
		
	}
	
	
	@PutMapping("/um")
	public MobileStatus updateMobile(@RequestBody Mobile m)
	{
		MobileStatus mobileStatus =new 
				MobileStatus(0,"failed update",new Mobile(0,"A",-1,-1,-1));
		return mobileService.updateMobile(m);
		
		
	}
	
	@DeleteMapping("/dm/{imeiNo}")
	public MobileStatus removeMobile(@PathVariable int imeiNo)
	{
		MobileStatus mobileStatus =new 
				MobileStatus(0,"mobile not removed",new Mobile(0,"A",-1,-1,-1));
		return mobileService.removeMobile(imeiNo);
		
		
	}
	
	@GetMapping("/allmobiles")
	public List<Mobile> getAllMobiles()
	{
		List<Mobile> mobiles =new ArrayList<Mobile>();
		mobiles.add(new Mobile(1,"abc",2,3,4));
		mobiles.add(new Mobile(2,"def",5,6,7));
		return mobileService.getAllMobiles();
		
	}
	
	@GetMapping("/gm/{imeiNo}")
	public Mobile getMobile(@PathVariable int imeiNo)
	{
		return mobileService.getMobile(imeiNo);
		
	}

}
