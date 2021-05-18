package com.member.details.service;

import java.util.List;

import com.member.details.model.MemberDetails;

public interface MemberDetailsService {
	MemberDetails createProduct(MemberDetails product);

	MemberDetails updateProduct(MemberDetails product);

	List<MemberDetails> getAllProduct();

	MemberDetails getProductById(long productId);

	void deleteProduct(long id);
}
