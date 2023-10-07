package com.example.pmdbsep30.api;

import com.example.pmdbsep30.entity.Movie;
import com.example.pmdbsep30.entity.Review;
import com.example.pmdbsep30.exception.MovieNotFoundException;
import com.example.pmdbsep30.repo.MovieRepo;
import com.example.pmdbsep30.repo.ReviewRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MovieApi {
    private final MovieRepo movieRepo;
    private final ReviewRepo reviewRepo;

//    public MovieApi(MovieRepo movieRepo, ReviewRepo reviewRepo) {
//        this.movieRepo = movieRepo;
//        this.reviewRepo = reviewRepo;
//    }

    @GetMapping("/movie")
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> movies = movieRepo.findAll();
        System.out.println("Movies = "+ movies);
        return ResponseEntity.status(HttpStatus.OK).body(movies);

    }

    @PostMapping("/movie")
    public ResponseEntity<Movie> addMovie(@RequestHeader(name = "X_COUNTRY", required = false, defaultValue = "CANADA") String country, @RequestBody Movie movie){
        movie.setCreateDate(Instant.now());
        movie.setUpdateDate(Instant.now());
        Movie save = movieRepo.save(movie);
        return ResponseEntity.status(HttpStatus.CREATED).header("X_SERVED_BY", " PRAGRA "+ country).body(save);
    }

    @PostMapping("/movie/{id}/review")
    public ResponseEntity<Review> addReview(@PathVariable("id") long movieId, @RequestBody Review review) throws MovieNotFoundException {
        Optional<Movie> movieOptional= movieRepo.findById(movieId);
        Movie movie = movieOptional.orElseThrow(MovieNotFoundException::new);

        Review save = reviewRepo.save(review);
        movie.getReview().add(save);
        movieRepo.save(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }





}
