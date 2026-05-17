package org.example.uberreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking extends BaseModel{
    @OneToOne(cascade = CascadeType.ALL)
    private Review review; // Defining a oneToone relationship between booking and review

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Long totalDistance;

    public enum BookingStatus {
        SCHEDULED,
        CANCELLED,
        CAB_ARRIVED,
        ASSIGNING_DRIVER,
        COMPLETED
    }
}
