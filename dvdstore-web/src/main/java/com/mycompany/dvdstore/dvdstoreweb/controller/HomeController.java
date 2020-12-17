package com.mycompany.dvdstore.dvdstoreweb.controller;

import com.mycompany.dvdstore.entity.MovieForm;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dvdstore")
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;

    @GetMapping("/home")
    public String displayHome(Model model) {
        model.addAttribute("movies", movieService.getMovieList());
        return "dvdstore-home";
    }

    @GetMapping("/add-movie-form")
    public String displayMovieForm(@ModelAttribute MovieForm movieForm) {
        return "add-movie-form";
    }


    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
