package com.example.demo.Mapper;

import com.example.demo.Model.Movies;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MoviesMapper {

  @Select("select  * from movies")
    List<Movies> findAll();


    @Delete("Delete  from movies where  movies_name =#{name}")
    int delete(String name);

  @Insert("INSERT INTO movies (detail_url, movies_name, rating, plot_summary) VALUES (#{movies.detail_url}, #{movies.movies_name}, #{movies.rating}, #{movies.plot_summary}) ")
  void insertMovie(@Param("movies") Movies movies);

    @Select("select  * from movies where  movies_name=#{name}")
    List<Movies> findName(String name);

  @Update("UPDATE movies SET detail_url=#{movies.detail_url}, movies_name=#{movies.movies_name}, rating=#{movies.rating}, plot_summary=#{movies.plot_summary} WHERE id=#{movies.id}")
  void update(@Param("movies") Movies movies);


}


