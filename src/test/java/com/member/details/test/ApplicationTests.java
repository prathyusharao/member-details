/*package com.member.details.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.member.details.MemberDetailsApplication;
import com.member.details.controller.MemberDetailsController;
import com.member.details.model.MemberDetails;
import com.member.details.repository.MemberDetailsRepository;
import com.member.details.service.MemberDetailsService;


@RunWith(SpringRunner.class)

@SpringBootTest
public class ApplicationTests {

@InjectMocks 
private MemberDetailsController memberDetailsController;

@Autowired 
private MemberDetailsService memberDetailsService;

@MockBean
private MemberDetailsRepository memberDetailsRepository;

@Before 
public void init()
{
	  MockitoAnnotations.initMocks(this);
	  }

@Test 
public void main()
{
	MemberDetailsApplication.main(new String[] {});
	  }

@Test
public void createProductTest() 
{
	MemberDetails product = new
			MemberDetails(1,"prathyu","prathyu@gmail.com","8889997771","AAAAA4444W");
when(memberDetailsRepository.save(product)).thenReturn(product);
assertEquals(product, memberDetailsService.createProduct(product));

}
}*/
