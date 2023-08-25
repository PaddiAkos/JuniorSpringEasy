package com.JuniorEasy.demo.Spring.service.impl;

import com.JuniorEasy.demo.Spring.Dto.CalculatedNumber;
import com.JuniorEasy.demo.Spring.model.Model;

import java.util.List;

public interface NumberService2 {


    List<CalculatedNumber> findAll();


    void UpdateNumbers (Model model,Long modelID );


    Model findbyId(Long ModelId);

}
