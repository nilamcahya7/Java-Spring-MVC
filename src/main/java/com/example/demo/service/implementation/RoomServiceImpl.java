package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Room;
import com.example.demo.repository.RoomRepository;
import com.example.demo.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
  @Autowired
  private RoomRepository roomRepository;

  @Override
  public List<Room> get() {
    return roomRepository.findAll();
  }

  @Override
  public Room get(Integer id) {
    return roomRepository.findById(id).orElse(null);
  }

  @Override
  public Boolean save(Room entity) {
    roomRepository.save(entity);
    return roomRepository.findById(entity.getId()).isPresent();
  }

  @Override
  public Boolean delete(Integer id) {
    roomRepository.deleteById(id);
    return roomRepository.findById(id).isEmpty();
  }
  
}
