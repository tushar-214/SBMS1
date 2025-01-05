package com.example.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Mobile;

@Repository
public interface MobileRepository extends CrudRepository<Mobile, Integer>{

	//void findByPriceGreaterThan(Integer price);

	@Query(value = "SELECT mobile_name,price FROM mobile", nativeQuery = true)
	List<String> showMobileNames();

	 @Query(value = "SELECT * FROM mobile WHERE price >= :price", nativeQuery = true)
	    List<Mobile> findMobilesByPrice(@Param("price") int price);
	
}
