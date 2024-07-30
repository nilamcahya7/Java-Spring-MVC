package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Transaction;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
  @Autowired
  private TransactionRepository transactionRepository;

  @Override
  public List<Transaction> get() {
    return transactionRepository.findAll();
  }

  @Override
  public Transaction get(Integer id) {
    return transactionRepository.findById(id).orElse(null);
  }

  @Override
  public Boolean save(Transaction entity) {
    transactionRepository.save(entity);
    return transactionRepository.findById(entity.getId()).isPresent();
  }

  @Override
  public Boolean delete(Integer id) {
    transactionRepository.deleteById(id);
    return transactionRepository.findById(id).isEmpty();
  }
}
