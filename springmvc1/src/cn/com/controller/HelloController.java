package cn.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse resp){
		ModelAndView mv =new ModelAndView();
		mv.addObject("msg", "this is my first jsp");
		mv.setViewName("login");
		return mv;
	}
}
