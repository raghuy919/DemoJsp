package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.domain.Product;
import com.demo.service.ProductService;

@Controller
public class AppController {
	@Autowired
	private ProductService service;

	@RequestMapping("/")
	public String viewHomepage(Model model) {
		List<Product> listpProducts = service.listAll();
		model.addAttribute("ListProduct", listpProducts);
		return "index";

	}

	@RequestMapping("/new")
	public String showNewProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";

	}

	@PostMapping("/save")

	public String saveProductForm(@ModelAttribute Product product) {
		service.save(product);
		return "redirect:/";
	}

	@RequestMapping("/edit/{id}")
	public String showEditProductForm(@PathVariable(name = "id") Long id,Model m) {
		Product product = service.get(id);
		m.addAttribute("product", product);
		return "edit_product";
	}

	@GetMapping(value = "/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") Long id) {
		service.delete(id);
		System.out.println();
		return "redirect:/";
	}
}
