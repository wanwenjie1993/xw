package com.wwj1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@EnableAutoConfiguration
public class indexController{
	private static Logger log =LoggerFactory.getLogger(indexController.class);
	@RequestMapping({"/","/index"})
	public String index(){
		log.info("go to index");
     return "index";
	}


	/*@RequestMapping({"/","/index"})
	public String index2(){
		try {
			DruidPooledConnection con = dbp.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from b3_solo_article");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+
						rs.getString(4)+" "+rs.getString(5));
			}
			ps.close();
			con.close();
		}catch (Exception e){
			log.info(e.getMessage());
		}
		log.info("go to index");
		return "index";
	}*/
}
