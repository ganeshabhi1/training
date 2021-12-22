package com.formhandlingexample.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product")
public class ProductController {
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Model model) {
		Product product =new Product();
		//product.setProductid("1000");
		//product.setProductname("HP Monitor");
		model.addAttribute("productModel", product);
		return "productform";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String insertProduct(@ModelAttribute ("productModel") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "productform";
		}
		else {
			//call some method
			return "home";
		}
	}
	
	

}
