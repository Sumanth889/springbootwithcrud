package com.example.scheduler.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.scheduler.entity.Product;
import com.example.scheduler.service.ProductService;

import ch.qos.logback.classic.Logger;

@RestController
//@RequestMapping("schedule")
public class ProductController {

	@Autowired
	 ProductService productService;
	
	Logger log = (Logger) LoggerFactory.getLogger(ProductController.class);
	
//	@PostMapping("api")
	@Scheduled(cron = "0 0/1 * * * ?")
	public void save()
	{
		log.info("scheduler started");
		Product prod = new Product();
		prod.setApple("himachal");
		prod.setIndia("andhra");
		prod.setPrice(25);
		 productService.save(prod);
		 log.info("scheduler end");
	}
}
