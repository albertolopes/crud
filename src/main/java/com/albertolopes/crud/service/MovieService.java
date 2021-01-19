package com.albertolopes.crud.service;

import com.albertolopes.crud.entity.Movie;
import com.albertolopes.crud.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieService {

    private final MovieRepository repository;

    public Movie create(Movie movie) {
        return repository.save(movie);
    }

    public Movie update(Movie movie) {
        return repository.save(movie);
    }

    public List<Movie> findAll() {
        return repository.findAll();
    }

    public Movie findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
