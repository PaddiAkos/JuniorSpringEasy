package com.JuniorEasy.demo.Spring.service.impl.impl;


import com.JuniorEasy.demo.Spring.Dto.CalculatedNumber;
import com.JuniorEasy.demo.Spring.model.Model;
import com.JuniorEasy.demo.Spring.repostiroy.NumberRepository;
import com.JuniorEasy.demo.Spring.service.impl.NumberService2;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
public class NumberService implements NumberService2 {


    private final NumberRepository numberRepository;

    public NumberService(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }

    String text = "geometric mean of two numbers";


    public double calculateGeometricMean(double a, double b) {


        return Math.sqrt(a * b);
    }
    @Override
    public List<CalculatedNumber> findAll() {

        List<Model> numbers = numberRepository.findAll();

        return numbers.stream()
                .map(model ->
                {
                    CalculatedNumber calculatedNumber = new CalculatedNumber();
                    calculatedNumber.setCalculatedNumber(calculateGeometricMean(model.getNumber1(), model.getNumber2()));
                    calculatedNumber.setNumber1(model.getNumber1());
                    calculatedNumber.setNumber2(model.getNumber2());
                    calculatedNumber.setText(text);


                    return calculatedNumber;
                })
                .collect(Collectors.toList());
    }

    @Override
    public void UpdateNumbers(Model model, Long modelID) {


        Model model1 = findbyId(modelID);
        model1.setNumber2(model.getNumber2());
        model1.setNumber1(model.getNumber1());


    }

    @Override
    public Model findbyId(Long ModelId) {
        return numberRepository.findById(ModelId)
                .orElseThrow();
    }
}