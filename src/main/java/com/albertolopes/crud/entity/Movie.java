package com.albertolopes.crud.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "TB_MOVIE")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID_MOVIE")
    private Long id;

    @Column(name= "TITLE")
    private String title;

    @Column(name= "DIRECTOR")
    private String director;

    @Column(name= "YEAR")
    private String year;

    @Column(name= "DURATION")
    private String duration;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TB_MOVIE_CAST",
            joinColumns = @JoinColumn(name = "ID_MOVIE"),
            inverseJoinColumns = @JoinColumn(name = "ID_CAST")
    )
    private List<Cast> cast;

}
