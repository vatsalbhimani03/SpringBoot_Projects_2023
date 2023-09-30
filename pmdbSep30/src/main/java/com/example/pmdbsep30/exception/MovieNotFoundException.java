package com.example.pmdbsep30.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException() {
        super("NO MOVIE FOUND FOR SUPPLIED ID");
    }
}
