package br.edu.ifpb.sgb.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifpb.sgb.model.Product;

@Controller
public class ProductController {
	
	
	@RequestMapping("/produto/novo")
	public String novo(Product product) {
		return "product/create-product";
	}
	
	@RequestMapping(value = "/produto/novo", method = RequestMethod.POST)
	public String createItemEstoque(@Valid Product product, BindingResult result, Model model, RedirectAttributes redirect){
		
		if (result.hasErrors()) {
			return novo(product);
		}
		
		redirect.addFlashAttribute("message", "Item cadastrado com sucesso.");
		return "redirect:/itemestoque/novo";
	}
	
	
	@RequestMapping(value = "/cliente/novo")
	public String novoCliente(){
		return "customer/create-customer";

	}
	
	@RequestMapping(value = "/user/novo")
	public String novoUser(){
		return "user/create-user";

	}
	


}


