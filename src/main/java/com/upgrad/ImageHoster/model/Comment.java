package com.upgrad.ImageHoster.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Comment")
public class Comment {

    // These annotations auto-increments the id column for us whenever
    // a new Tag is stored into the database
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String description;

    // this annotation completes the many-to-one declaration created
    // in the Image class
    @ManyToOne(fetch = FetchType.LAZY)
    private Image image;


    public Comment() {}

    public Comment(String description) {
        this.description = description;
    }


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getDescription() { return description; }

    public void setId(String description) { this.description = description; }

    public Image getImage() { return image; }

    public void setImage(Image image) { this.image = image; }

}
