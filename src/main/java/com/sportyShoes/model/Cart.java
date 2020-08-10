//package com.sportyShoes.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Table
//@Getter
//@Setter
//@NoArgsConstructor
//public class Cart {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "cartId", updatable = false, nullable = true)
//	private int cartId;
//	private String cartName;
//	
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name = "cart_product" , joinColumns ={ @JoinColumn(name = "cartId") } , inverseJoinColumns = { @JoinColumn(name = "productId") })
//	private List<Product> products = new ArrayList<>();
//
//}
