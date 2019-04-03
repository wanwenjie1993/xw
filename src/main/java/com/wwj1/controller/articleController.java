package com.wwj1.controller;

import com.wwj1.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@EnableAutoConfiguration
public class articleController {
	private static Logger log =LoggerFactory.getLogger(articleController.class);
	@Resource
	private  ArticleService atcService;

	@RequestMapping({"/atc","/article"})
	public String article(Model model){
		log.info("hello:"+this.atcService.selectList().get(0).getArticleid());
		model.addAttribute("articleList",this.atcService.selectList());
		model.addAttribute("xxx","nimab");

		return "article";
	}


}
