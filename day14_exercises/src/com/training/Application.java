package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

import com.training.entity.LifeInsurance;
import com.training.entity.MyGenerics;
import com.training.entity.VehicleInsurance;
import com.training.services.InsuranceService;

public class Application {

	public static void main(String[] args)
	{
		MyGenerics<Integer> rollNumber=new MyGenerics<Integer>();
		
		rollNumber.setObject(new Integer(200));
		
		rollNumber.setObj(new Double(100.0));
		
		Integer number=rollNumber.getObject();
		
		System.out.println(number);
		
		List <LifeInsurance> lifeList=Arrays.asList(new LifeInsurance(1000,23),new LifeInsurance(1001,24));
				
		List <VehicleInsurance> vehicleList=new ArrayList<>();
		
		vehicleList.add(new VehicleInsurance(200,"abc"));
		vehicleList.add(new VehicleInsurance(201,"xyz"));
		
		InsuranceService.insuranceProducer(lifeList);
		InsuranceService.insuranceProducer(vehicleList);
		
		InsuranceService.insuranceConsumer(vehicleList);
		
		vehicleList.forEach(System.out::println);
	}
	
}
