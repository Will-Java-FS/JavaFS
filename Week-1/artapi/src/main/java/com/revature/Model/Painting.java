package com.revature.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Painting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String genre;
    @Column
    private int year_made;

    @ManyToOne(fetch=FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "artist_fk")
    private Artist artist;
}
