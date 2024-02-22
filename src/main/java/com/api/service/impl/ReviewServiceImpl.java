//package com.api.service.impl;
//
//import com.api.entitites.Movie;
//import com.api.entitites.Review;
//import com.api.entitites.User;
//import com.api.exceptions.ResourceNotFoundException;
//import com.api.payloads.request.ReviewDtoRequest;
//import com.api.payloads.response.ReviewDtoResponse;
//import com.api.repository.MovieRepository;
//import com.api.repository.ReviewRepository;
//import com.api.repository.UserRepository;
//import com.api.service.ReviewService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class ReviewServiceImpl implements ReviewService {
//    @Autowired
//    private ModelMapper modelMapper;
//    @Autowired
//    private ReviewRepository reviewRepository;
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private MovieRepository movieRepository;
//    @Override
//    public ReviewDtoResponse addReview(ReviewDtoRequest reviewDtoRequest) {
//         Review review = this.modelMapper.map(reviewDtoRequest, Review.class);
//        review.setTimeStamp(LocalDateTime.now());
//         Review savedReview = this.reviewRepository.save(review);
//        return this.modelMapper.map(savedReview, ReviewDtoResponse.class);
//    }
//    @Override
//    public ReviewDtoResponse postReview(ReviewDtoRequest reviewDtoRequest, String userId, String movieId)
//    {
//        User user = this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "UserId", userId));
//        Movie movie = this.movieRepository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("Movie", "MovieId", movieId));
//        Review review = this.modelMapper.map(reviewDtoRequest, Review.class);
//        review.setUser(user);
//        review.setMovie(movie);
//        review.setTimeStamp(LocalDateTime.now());
//        Review savedReview = this.reviewRepository.save(review);
//
//        return modelMapper.map(savedReview, ReviewDtoResponse.class);
//    }
//
//
//    @Override
//    public List<ReviewDtoResponse> getAllReviews() {
//         List<Review> allReviews = this.reviewRepository.findAll();
//        return allReviews.stream().map((review)->modelMapper.map(review, ReviewDtoResponse.class)).collect(Collectors.toList());
//    }
//
//    @Override
//    public ReviewDtoRequest getReviewByMovieId(String movieId) {
//         Review review = this.reviewRepository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("movie", "movieId", movieId));
//        return this.modelMapper.map(review, ReviewDtoRequest.class);
//    }
//}
