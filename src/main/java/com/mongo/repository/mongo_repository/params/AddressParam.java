package com.mongo.repository.mongo_repository.params;

import lombok.Data;

@Data
public class AddressParam {
	
	private String address1;
	private String city;
	private String state;
	private String pincode;
	
}