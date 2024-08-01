package com.revature.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

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
public class Painting {
    /**
     * The @Id annotation informs Spring Data to mark this column as a primary key for the Painting table.
     * The @GeneratedValue annotation informs Spring Data to generate a new unique value for the primary key whenever
     * a new Painting object is persisted.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String genre;
    @Column
    private int year_made;
    /**
     * The @ManyToOne annotation informs Spring Data to keep track of a multiplicity relationship of Many Painting
     * entities to One Artist entity (many paintings were painted by one artist). The Artist of a particular painting
     * is represented as a Java object / ORM entity: that means that if the developer wishes to retrieve the Artist of
     * a particular Painting, retrieving the object (eg painting1.getArtist()) will fetch the Artist Object from the
     * database.
     *
     * The @JsonBackReference annotation prevents this field from being part of the Object's JSON. This prevents the
     * field from resulting in an infinite JSON (eg a painting's artist's painting's artist...) You can swap
     * Painting's JsonBackReference with Artist's JsonManagedEntity if you need the Artist to be in the Painting's JSON.
     *
     * The @JoinColumn annotation will define the name of the foreign key column referring to the Artist table.
    */
    @ManyToOne(fetch=FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "artist_fk")
    private Artist artist;
}
