package com.revature.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
/**
 * The @Entity annotation informs Spring Data to map this object to a database table as part of a paradigm known as
 * 'object-relational-mapping'.
 *
 * The @Data annotation is provided by Lombok (NOT Spring.) It provides automatic getters and setters,
 * The @AllArgsConstructor and @NoArgsConstructor annotations are provided by Lombok (NOT Spring.) They provide
 * automatic constructors.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
    /**
     * The @Id annotation informs Spring Data to mark this column as a primary key for the Artist table.
     * The @GeneratedValue annotation informs Spring Data to generate a new unique value for the primary key whenever
     * a new Artist object is persisted.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String nationality;
    /**
     * The @OneToMany annotation informs Spring Data to keep track of a multiplicity relationship of One Artist entity
     * to many Painting entities (One Artist has painted Many Paintings). The Paintings of a particular Artist are
     * represented by a Collection (Set) of Java Objects / ORM entities: That means that if the developer wishes to
     * retrieve the Paintings of a particular Artist, retrieving the Collection of Paintings (eg artist1.getPaintings())
     * will retrieve all Paintings referring to the Artist from the Database.
     *
     * The @JsonManagedReference annotation prevents Painting's Artist field from resulting in an infinite JSON
     * (eg a painting's artist's painting's artist...) A Painting's Artist will not be part of the Painting JSON.
     * You can swap Painting's JsonBackReference with Artist's JsonManagedEntity if you need the Artist to be in the
     * Painting's JSON.
     */

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="artist_fk")
    @JsonManagedReference
    private List<Painting> paintings;
}
