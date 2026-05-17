package org.example.uberreviewservice.service;

import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Review newReview = Review.builder()
                .content("Amazing service from the driver.")
                .rating(4.0)
                .build();

        reviewRepository.save(newReview);
        List<Review> Reviews =  reviewRepository.findAll();
        for(Review review: Reviews) {
            System.out.println(review.getContent());
        }
    }
}
