package com.example.demo.Controller;

import com.example.demo.Model.Movies;
import com.example.demo.Model.Result;
import com.example.demo.service.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MoviesController {

    @Autowired
    private IMoviesService moviesService;

    @GetMapping("/movies")
    public Result findAll() {
        return Result.success(moviesService.findAll());
    }



    @PostMapping("/insert")
    public Result insertMovie( @RequestBody Movies movies) {
        moviesService.insert(movies);
        return Result.success();
    }

    @PostMapping("/update")
    public Result updateMovie(@RequestBody Movies movies) {
        moviesService.update(movies);
        return Result.success();
    }

    @GetMapping("/movies/{name}")
    public Result findMovie(@PathVariable("name") String name) {
        return Result.success(moviesService.findName(name));
    }

    @GetMapping("/delete/{name}")
    public Result deleteMovie(@PathVariable("name") String name) {
        moviesService.delete(name);
        return Result.success();
    }
}
