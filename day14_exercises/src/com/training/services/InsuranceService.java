package com.training.services;

import java.util.*;

import com.training.entity.Insurance;
import com.training.entity.LifeInsurance;
import com.training.entity.VehicleInsurance;

public class InsuranceService {

	public static void insuranceProducer(List<? extends Insurance> list)
	{
		
		
		for(Insurance eachItem: list)
		{
			System.out.println(eachItem.getPolicyNumber());
		}
	}
	
	public static void insuranceConsumer(List<? super VehicleInsurance> list)
	{
		list.add(new VehicleInsurance(45,"activa"));
		
//		for(Insurance eachItem: list)
//		{
//			System.out.println(eachItem.getPolicyNumber());
//		}
	}
	
}
