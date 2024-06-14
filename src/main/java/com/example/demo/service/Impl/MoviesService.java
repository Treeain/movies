package com.example.demo.service.Impl;

import com.example.demo.Mapper.MoviesMapper;
import com.example.demo.Model.Movies;
import com.example.demo.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService implements IMoviesService {

    @Autowired
    private MoviesMapper moviesMapper;



    public List<Movies> findAll() {
        return moviesMapper.findAll();
    }

    public void insert(Movies movies) {
        moviesMapper.insertMovie(movies);
    }

    public List<Movies> findName(String name) {
        return moviesMapper.findName(name);
    }

    @Override
    public void delete(String name) {
        moviesMapper.delete(name);
    }

    @Override
    public void update(Movies movies) {
        moviesMapper.update(movies);
    }
}