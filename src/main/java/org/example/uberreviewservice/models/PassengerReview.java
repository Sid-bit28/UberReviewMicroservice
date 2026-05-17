package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
public class PassengerReview extends Review{
    private String passengerReviewContent;
}
