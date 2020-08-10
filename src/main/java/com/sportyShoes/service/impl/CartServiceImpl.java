//package com.sportyShoes.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.sportyShoes.model.Cart;
//import com.sportyShoes.repository.CartRepository;
//import com.sportyShoes.service.CartService;
//
//@Service
//@Transactional
//public class CartServiceImpl implements CartService{
//
//	@Autowired
//	private CartRepository cartrepository;
//
//	@Override
//	public Cart createCart(Cart cart) {
//		return cartrepository.save(cart);
//	}
//
//}
