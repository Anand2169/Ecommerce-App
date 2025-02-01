package com.ecommerce.services;

import java.util.List;

import com.ecommerce.entites.Address;
import com.ecommerce.payloads.AddressDTO;

public interface AddressService {
	
	AddressDTO createAddress(AddressDTO addressDTO);
	
	List<AddressDTO> getAddresses();
	
	AddressDTO getAddress(Long addressId);
	
	AddressDTO updateAddress(Long addressId, Address address);
	
	String deleteAddress(Long addressId);
}
