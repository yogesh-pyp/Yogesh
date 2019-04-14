package controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.EmployeeService;

@Controller
public class EmloyeeController {

	@Autowired
	EmployeeService src;
	
	//pakhare
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	ModelAndView displayCsv() throws IOException
	{
		List list=src.readCsv();
		
		
		ModelAndView mav=new ModelAndView("view");
		mav.addObject("list", list);    //
		
		
		return mav;
	}
	
}
