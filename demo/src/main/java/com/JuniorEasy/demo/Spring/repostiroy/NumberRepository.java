package com.JuniorEasy.demo.Spring.repostiroy;

import com.JuniorEasy.demo.Spring.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository extends JpaRepository<Model, Long> {

}
