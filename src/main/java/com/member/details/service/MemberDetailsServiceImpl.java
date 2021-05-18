package com.member.details.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.member.details.exception.ResourceNotFoundException;
import com.member.details.model.MemberDetails;
import com.member.details.repository.MemberDetailsRepository;

@Service
@Transactional
public class MemberDetailsServiceImpl implements MemberDetailsService{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	private MemberDetailsRepository productRepository;
	
	
	@Override
	public MemberDetails createProduct(MemberDetails product) {
		return productRepository.save(product);
	}

	@Override
	public MemberDetails updateProduct(MemberDetails product) {
		Optional<MemberDetails> productDb = this.productRepository.findById(product.getId());
		
		if(productDb.isPresent()) {
			MemberDetails productUpdate = productDb.get();
			productUpdate.setId(product.getId());
			productUpdate.setName(product.getName());
			productUpdate.setAddress(product.getAddress());
			productUpdate.setState(product.getState());
			productUpdate.setCountry(product.getCountry());
			productUpdate.setPhoneno(product.getPhoneno());
			productUpdate.setEmailid(product.getEmailid());
			productUpdate.setPan(product.getPan());
			productRepository.save(productUpdate);
			return productUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + product.getId());
		}	
	}

	@Override
	public List<MemberDetails> getAllProduct() {
		
		logger.info("fetching all the registered details");
		
		return this.productRepository.findAll();
	}

	@Override
	public MemberDetails getProductById(long productId) {
		
		Optional<MemberDetails> productDb = this.productRepository.findById(productId);
		
		if(productDb.isPresent()) {
			return productDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + productId);
		}
	}

	@Override
	public void deleteProduct(long productId) {
		Optional<MemberDetails> productDb = this.productRepository.findById(productId);
		
		if(productDb.isPresent()) {
			this.productRepository.delete(productDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + productId);
		}
		
	}

}
