package com.member.details.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.member.details.model.MemberDetails;

public interface MemberDetailsRepository extends MongoRepository < MemberDetails, Long > {

}
