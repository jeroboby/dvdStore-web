package com.mycompany.dvdstore.api;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieResource {
    @Autowired
    MovieServiceInterface movieService;

    @GetMapping()
    public List<Movie> list() {
       return movieService.getMovieList();
    }

    @GetMapping("/{id}")
    public Movie get(@PathVariable("id") long number) {
       return movieService.getMovieById(number);
    }

    @PostMapping
    public Movie add(@RequestBody Movie movie){
        return movieService.registerMovie(movie);
    }

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
