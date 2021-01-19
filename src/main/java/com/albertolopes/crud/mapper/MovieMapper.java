package com.albertolopes.crud.mapper;

import com.albertolopes.crud.dto.MovieDTO;
import com.albertolopes.crud.entity.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MovieMapper extends BaseMapper<Movie, MovieDTO>{
}
