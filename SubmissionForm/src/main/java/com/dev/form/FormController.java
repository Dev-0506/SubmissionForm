package com.dev.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FormController {
	@GetMapping("/form")
	public String showForm()
	{
		System.out.println("Hello world");
		return "Index.jsp";
	}
	@GetMapping("/view")
	public String viewPage(@RequestParam("cid") String cid, @RequestParam("cname") String cname, @RequestParam("cemail") String cemail, ModelMap mm)           
	{
		mm.put("id", cid);
		mm.put("name", cname);
		mm.put("email", cemail);
		return "viewDet.jsp";
	}
}
