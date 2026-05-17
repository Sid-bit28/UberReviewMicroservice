package org.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Passenger {
    private String name;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings;
}
