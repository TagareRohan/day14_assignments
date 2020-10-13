package com.training.lambda;

import java.time.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.sql.Date;

import com.training.lambda.utils.Converter;
import com.training.lambda.utils.LambdaService;

public class Application {

	
	public static void main(String[] args)
	{
		LambdaService service=new LambdaService();
		
		//service.usingWithoutLambda();
		
		//service.usingLambda();
		
		Converter<Double,Double> dollorToRupee=(dollor)->{return dollor*70;};
		Converter<Double,Double> farenToCelcius=(temp)->{return (temp*5)/9;};
		
//		service.lambdaConvert(dollorToRupee, 2.3);
//		service.lambdaConvert(farenToCelcius, 30.0);
//		
		//service.usingJavaFunctionalInterfaces();
		
		Consumer<String> consume=(val)->{System.out.println(val);};
		
		//consume.accept("Ramesh");
		
		Consumer<Integer> consume2=(val)->{System.out.println(val);};
		
		List<Integer> age=Arrays.asList(50,20,10,70);
		
		//age.forEach(System.out::println);
		
		
		LocalDateTime currentTime=LocalDateTime.now();
		
		System.out.println(currentTime);
		
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(1998, 04, 30);
		
		Period dur=Period.between(birthday, today);
				
		System.out.println(dur.getYears());
		
		Date sqlDate=new Date(2020,9,14);
		
		LocalDate sqlToLocal=sqlDate.toLocalDate();
		
		System.out.println(sqlToLocal);
		
		LocalDate toSql=LocalDate.of(2020, 5, 30);
		
		Date frmLocal=Date.valueOf(toSql);
		
		System.out.println(frmLocal);
	}
}
