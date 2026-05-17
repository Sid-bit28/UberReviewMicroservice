package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
public class DriverReview extends Review{
    private String driverReviewContent;
}
