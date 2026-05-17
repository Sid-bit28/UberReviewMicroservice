package org.example.uberreviewservice.service;

import org.example.uberreviewservice.models.Booking;
import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repository.BookingRepository;
import org.example.uberreviewservice.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Review newReview = Review.builder()
                .content("Amazing service from the driver.")
                .rating(4.0)
                .build();

        Booking bookingReview = Booking.builder()
                        .review(newReview)
                        .startTime(LocalDateTime.now())
                        .endTime(LocalDateTime.now())
                        .build();

        reviewRepository.save(newReview);
        bookingRepository.save(bookingReview);
        List<Review> Reviews =  reviewRepository.findAll();
        for(Review review: Reviews) {
            System.out.println(review.getContent());
        }
    }
}
