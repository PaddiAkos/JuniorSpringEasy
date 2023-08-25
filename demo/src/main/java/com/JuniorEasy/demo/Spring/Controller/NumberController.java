package com.JuniorEasy.demo.Spring.Controller;

import com.JuniorEasy.demo.Spring.Dto.CalculatedNumber;
import com.JuniorEasy.demo.Spring.model.Model;
import com.JuniorEasy.demo.Spring.repostiroy.NumberRepository;
import com.JuniorEasy.demo.Spring.service.impl.NumberService2;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/f1/users")
@RequiredArgsConstructor
public class NumberController {
    private final NumberService2 numberRepository;



    @GetMapping("/cgm")
    public ResponseEntity<List<CalculatedNumber>> getcall() {
        return ResponseEntity.ok(numberRepository.findAll());
    }



    @PutMapping("/{ModelId}")
    public ResponseEntity<Void> updateUser(@RequestBody Model userDto, @PathVariable(name = "ModelId") Long ModelId) {
        numberRepository.UpdateNumbers(userDto, ModelId);
        return ResponseEntity.ok().build();
}
}