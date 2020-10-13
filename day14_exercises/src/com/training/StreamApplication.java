package com.training;

import java.util.List;
import java.util.Optional;

import com.training.entity.Invoice;
import com.training.services.InvoiceService;

public class StreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InvoiceService service=new InvoiceService();
		
		service.filterByName("hemant").ifPresent(list->list.forEach(System.out::println));
		
		Optional<List<Invoice>> list=service.filterByName("raj");
		
		if(list.isPresent())
		{
			list.get().forEach(System.out::println);
		}
		else
		{
			System.out.println("not present");
		}
		
		Optional<List<Invoice>> list2=service.filterByName("umang");
		
		list2.orElseThrow(()->new RuntimeException("null value"));
	}

}
