package com.training.services;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

import com.training.entity.*;

public class InvoiceService {

	
	private List<Invoice> invoiceList;

	public InvoiceService() {
		super();
		// TODO Auto-generated constructor stub
		this.invoiceList=Arrays.asList(new Invoice(101,"ram",400)
				,new Invoice(102,"sam",500)
				,new Invoice(103,"raj",100)
				,new Invoice(104,"hemant",1400)
				,new Invoice(105,"raj",300));
	}

	public InvoiceService(List<Invoice> invoiceList) {
		super();
		this.invoiceList = invoiceList;
	}
	
//	public List<Invoice> filterByName(String name)
//	{
//		List<Invoice> invList=null;
//		invList=invoiceList.stream().filter( (eachInvoice)-> eachInvoice.getCustomerName().equals(name) )
//				.collect(toList());
//		return invList;
//	}
	
	public Map<Integer,Double> fetchInvoiceDetailsByName(String name)
	{
		Map<Integer,Double> mapList=null;
		mapList=this.invoiceList.stream().filter(item->item.getCustomerName().equals(name))
				.collect(Collectors.toMap(Invoice::getInvoiceId,Invoice::getAmount));
		return mapList;
	}
	
	public Optional<List<Invoice>> filterByName(String name)
	{
		List<Invoice> invList=null;
		
		invList=this.invoiceList.stream().filter((each)->each.getCustomerName().equals(name)).collect(Collectors.toList());
	
		if(invList.size()==0)
		{
			return Optional.ofNullable(null);
		}
		else
		{
			return Optional.ofNullable(invList);
		}
	
	}
	
//	public double findMaxAmount()
//	{
//		double maxAmount=0.0;
//		
//		Comparator<Invoice>
//		maxAmount=this.invoiceList.stream().max(Comparator.comparingDouble(Invoice::getAmount)).get();
//	}
//	
//	public double countInvoices(String name)
//	{
//		
//	}
	
}

