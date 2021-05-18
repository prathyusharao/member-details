package com.member.details.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.member.details.model.MemberDetails;
import com.member.details.service.MemberDetailsService;

@RestController
public class MemberDetailsController {

	@Autowired
	private MemberDetailsService productService;
	
	//get all the registered details
	@GetMapping("/products")
	public ResponseEntity<List<MemberDetails>> getAllProduct(){
		return ResponseEntity.ok().body(productService.getAllProduct());
	}
	
	@GetMapping("/products/id")
	public ResponseEntity<MemberDetails> getProductById(@PathVariable long id){
		return ResponseEntity.ok().body(productService.getProductById(id));
	}
	
	//insert the member details
	@PostMapping("/products")
	public MemberDetails createProduct(@Valid @RequestBody MemberDetails product){
		return this.productService.createProduct(product);
	}
	
	//update the required details
	@PutMapping("/products/{id}")
	public ResponseEntity<MemberDetails> updateProduct(@PathVariable long id, @RequestBody MemberDetails product){
		product.setId(id);
		return ResponseEntity.ok().body(this.productService.updateProduct(product));
	}

	@DeleteMapping("/products/{id}")
	public HttpStatus deleteProduct(@PathVariable long id){
		this.productService.deleteProduct(id);
		return HttpStatus.OK;
	}
}
