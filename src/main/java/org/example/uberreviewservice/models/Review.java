package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "booking_review")
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseModel {
    @Column(nullable = false)
    private String content;

    private double rating;
}


