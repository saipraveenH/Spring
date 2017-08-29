package com.otsi.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String wishMessage = null;
		Date dt = new Date();
		@SuppressWarnings("deprecation")
		long year = dt.getYear()+1900;
		System.out.println(year+"hello");
		if (year < 1947) {
			wishMessage = "we are fighting hard for independence";
		} else if (year > 1947) {
			wishMessage = "Its been" + (year - 1947) + " years since we got independence";
		} else if (year == 1947) {
			wishMessage = "we got independence this year";
		}
		return new ModelAndView("wish", "msg", wishMessage);
	}

}
