package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.pojo.Payment;
import com.capgemini.service.GlobalService;

@Controller
public class GlobalPayController {
	@Autowired
	GlobalService service;
	@RequestMapping("/pay")
	public ModelAndView form(@RequestParam("transactionId")String transactionId,@RequestParam("ticketNo")String ticketNo,Payment payment)
	{
		
		System.out.println(payment.getTransactionId());
		System.out.println(payment.getTicketNo());
		service.method();
		return null;
		
	}

}
