package com.member.details.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "ProductDB")
public class MemberDetails {
	
	@Override
	public String toString() {
		return "MemberDetails [id=" + id + ", name=" + name + ", address=" + address + ", state=" + state + ", country="
				+ country + ", phoneno=" + phoneno + ", emailid=" + emailid + ", pan=" + pan + "]";
	}
	@Id
	private long id;
	
	//@NotNull(message = "First name is required")
	//@Pattern(regexp="[a-zA-Z]+\\.?",
   // message="name is invalid")
	@NotNull
	@Size(min=2,message="First name should atleast 2 characters")
	private String name;
	private String address;
	private String state;
	private String country;
	
	@NotEmpty(message = "Phone number is required")
    @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
             message="Mobile number is invalid")
	private String phoneno;
	
	@NotEmpty(message = "Email is required")
    @Pattern(regexp="^(.+)@(.+)$",
    message="email is invalid")
    @Email
	private String emailid;
	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@NotEmpty(message = "Pan is required")
    @Pattern(regexp="[A-Z]{5}[0-9]{4}[A-Z]{1}",
             message="pan is invalid")
    private String pan;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
