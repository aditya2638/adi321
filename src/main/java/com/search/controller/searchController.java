package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class searchController {
    @RequestMapping("/search")
	public String viewSearchLeadForm() {
		return"search_lead";
	}
	
}
