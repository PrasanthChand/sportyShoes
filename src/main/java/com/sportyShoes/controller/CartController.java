//package com.sportyShoes.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sportyShoes.model.Cart;
//import com.sportyShoes.model.Product;
//import com.sportyShoes.service.CartService;
//
//@RestController
//@CrossOrigin
//@RequestMapping("/")
//public class CartController {
//		
//	@Autowired
//	private CartService cartservice;
//
//	@PostMapping("/cart")
//	public Cart createCart(@RequestBody Product product) {
//		return cartservice.createCart(product);
//	}
//}
