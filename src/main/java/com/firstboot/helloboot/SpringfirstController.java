package com.firstboot.helloboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SpringfirstController {
	
	@RequestMapping("/test")
	public String gerMessage()
	{
		String welnote ="Welcome to spring boot Application";
		return welnote;
	}

}
