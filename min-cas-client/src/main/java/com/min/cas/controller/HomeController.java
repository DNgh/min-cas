package com.min.cas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping({"/","/home"})
    public ModelAndView home(){
    	ModelAndView modelAndView =new ModelAndView("home");
//        modelAndView.addObject("hello", "access index success");
        return modelAndView;
    }
	
	@RequestMapping("/loginPage")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
	@RequestMapping("/admin")
	public ModelAndView admin() {
		ModelAndView modelAndView = new ModelAndView("adminPage");
		return modelAndView;
	}
	
	@RequestMapping("/accessDenied")
	public ModelAndView accessDenied() {
		ModelAndView modelAndView = new ModelAndView("403");
		return modelAndView;
	}
	
	@RequestMapping("/logout")
    public String logout(HttpSession session){
		session.invalidate();
        return "redirect:https://sso.server.com:8443/min-cas-server/logout";
    }
}
