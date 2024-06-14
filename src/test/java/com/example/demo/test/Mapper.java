package com.example.demo.test;

import com.example.demo.Mapper.MoviesMapper;
import com.example.demo.Model.Movies;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class MovieMapperTest {

    @Autowired
    private MoviesMapper movieMapper;
    private  Movies movies;


    @Test
    void testSelectAllMovies() {

        List<Movies> actualMovies = movieMapper.findAll();

        for (Movies movie:actualMovies
             ) {
            System.out.println(movie.getMovies_name());
        }}

    @Test
    void testInsertMovies(){
        //movieMapper.insertMovie("some_url","MovieName",5,"MovieSummary");

    }    @Test
    void testUpdateMovies(){
        movies.setDetail_url("123");
        movies.setMovies_name("131");
        movies.setPlot_summary("213");
        movies.setRating(2);

        movieMapper.update(movies);

    }

    @Test
    void testDeleteMovies(){
        System.out.println(movieMapper.delete("ÎÞÆÚÃÔÍ¾"));

    }

    }




