package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Mobile;

public interface mobileService {
	public String addMobile(Mobile mb);
    public List<Mobile> getMobileData();
    public Mobile getMobileById(Integer id);
    public String deleteByid(Integer id);
    public String updatedbyId(Integer id,Mobile mb);
}
