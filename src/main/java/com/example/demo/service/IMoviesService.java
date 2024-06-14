package com.example.demo.service;

import com.example.demo.Model.Movies;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMoviesService {


    List<Movies> findAll();

    void insert(Movies movies);

    List<Movies> findName(String name);

    void delete(String name);
    void update(Movies movies);
}
