package com.wwj1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@EnableAutoConfiguration
public class articleController {
	private static Logger log =LoggerFactory.getLogger(articleController.class);
	@RequestMapping({"/atc","/article"})
	public String article(){
		log.info("go to article");
		log.info("hello");
     return "article";
	}
}
