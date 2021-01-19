package com.albertolopes.crud.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class MovieDTO {

    private Long id;

    private String title;

    private String director;

    private String year;

    private String duration;

    private List<CastDTO> cast;

}
