package com.mycompany.dvdstore.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieForm {
    @NotBlank(message = "Veuillez entrer un titre")
    @Size(max=20, message="Entrez un titre de 20 caractères au plus")
    private String title;
    @NotBlank(message = "Veuillez choisir un genre")
    private String genre;
    private long id;
    @Size(max=255, message = "Entrez une description de 255 caractères au plus")
    private String description;
    @NotBlank
    @Size(max=20)
    private String firstName;
    @Size(max=20)
    private String lastName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
