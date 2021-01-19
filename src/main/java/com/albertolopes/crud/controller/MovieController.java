package com.albertolopes.crud.controller;

import com.albertolopes.crud.dto.MovieDTO;
import com.albertolopes.crud.mapper.MovieMapper;
import com.albertolopes.crud.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
@Api("Api rest movie")
@AllArgsConstructor
public class MovieController {

    private final MovieService service;
    private final MovieMapper mapper;

    @PostMapping
    ("Create a new movie")
    public ResponseEntity<MovieDTO> create(@RequestBody MovieDTO dto){
        return ResponseEntity.ok(mapper.toDto(service.create(mapper.toEntity(dto))));
    }

    @PutMapping
    @ApiOperation("Update a movie")
    public ResponseEntity<MovieDTO> update(@RequestBody MovieDTO dto){
        return ResponseEntity.ok(mapper.toDto(service.update(mapper.toEntity(dto))));
    }

    @GetMapping
    @ApiOperation("Find all movies")
    public ResponseEntity<List<MovieDTO>> findAll(){
        return ResponseEntity.ok(mapper.toDto(service.findAll()));
    }

    @GetMapping("/{id}")
    @ApiOperation("Find a movie by ID")
    public ResponseEntity<MovieDTO> findById(@RequestParam Long id){
        return ResponseEntity.ok(mapper.toDto(service.findById(id)));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete a movie by ID")
    public ResponseEntity<Void> deleteById(@RequestParam Long id){
         service.deleteById(id);
         return ResponseEntity.noContent().build();
    }
}
