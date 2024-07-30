package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Division;
import com.example.demo.repository.DivisionRepository;
import com.example.demo.service.DivisionService;

@Service
public class DivisionServiceImpl implements DivisionService {
  @Autowired
  private DivisionRepository divisionRepository;

  @Override
  public List<Division> get() {
    return divisionRepository.findAll();
  }

  @Override
  public Division get(Integer id) {
    return divisionRepository.findById(id).orElse(null);
  }

  @Override 
  public Boolean save(Division entity) {
    divisionRepository.save(entity);
    return divisionRepository.findById(entity.getId()).isPresent();
  }

  @Override
  public Boolean delete(Integer id) {
    divisionRepository.deleteById(id);
    return divisionRepository.findById(id).isEmpty();
  }

  
}
