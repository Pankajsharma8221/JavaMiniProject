package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
