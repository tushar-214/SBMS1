package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Mobile;
import com.example.repo.MobileRepository;

@Service
public class MobileImp implements mobileService {
	@Autowired
	MobileRepository mobileRepository;

	@Override

	public String addMobile(Mobile mb) {
		mobileRepository.save(mb);
		return "Data is inserted successfully";
	}

	@Override
	public List<Mobile> getMobileData() {
		List<Mobile> listdata = (List<Mobile>) mobileRepository.findAll();
		return listdata;
	}

	@Override
	public Mobile getMobileById(Integer id) {
		return mobileRepository.findById(id).orElse(null);
	}

	@Override
	public String deleteByid(Integer id) {
		mobileRepository.deleteById(id);
		return "Data Deleted Successfully";
	}

	@Override
	public String updatedbyId(Integer id, Mobile mb) {
		if (mobileRepository.existsById(id)) {
			mb.setMid(id);
			mobileRepository.save(mb);
		} else {
			return "data is not updated because id not exist";
		}
		return "data is updated successfuly";
	}

	@Override
	public List<String> showMobileNames() {
		List<String> mobiledat = mobileRepository.showMobileNames();
		return mobiledat;
	}

	@Override
	public List<Mobile> findMobilesByPrice(int price) {
		List<Mobile> mobilePrice = mobileRepository.findMobilesByPrice(price);
		return mobilePrice;
	}

}
