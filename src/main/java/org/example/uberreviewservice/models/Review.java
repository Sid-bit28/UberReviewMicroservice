package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Review extends BaseModel {
    @Column(nullable = false)
    private String content;

    private double rating;
}


