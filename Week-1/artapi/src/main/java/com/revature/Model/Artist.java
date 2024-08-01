package com.revature.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String nationality;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="artist_fk")
    @JsonManagedReference
    private List<Painting> paintings;
}
