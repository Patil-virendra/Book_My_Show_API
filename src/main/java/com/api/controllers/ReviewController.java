//package com.api.controllers;
//
//import com.api.payloads.request.ReviewDtoRequest;
//import com.api.payloads.response.ReviewDtoResponse;
//import com.api.service.ReviewService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/review")
//public class ReviewController {
//    @Autowired
//    private ReviewService reviewService;
//    @PostMapping("/add")
//    public ResponseEntity<ReviewDtoResponse> addedReview(@RequestBody ReviewDtoRequest reviewDtoRequest){
//         ReviewDtoResponse reviewDtoResponse = this.reviewService.addReview(reviewDtoRequest);
//        return  new ResponseEntity<>(reviewDtoResponse, HttpStatus.CREATED);
//    }
//
//
//
//    @PostMapping("/{userId}/{movieId}")
//    public ResponseEntity<ReviewDtoResponse> postReview(@RequestBody ReviewDtoRequest reviewDtoRequest, @PathVariable String userId, @PathVariable String movieId)
//    {
//        ReviewDtoResponse reviewDtoResponse = this.reviewService.postReview(reviewDtoRequest, userId, movieId);
//
//        return new ResponseEntity<>(reviewDtoResponse, HttpStatus.CREATED);
//    }
//    @GetMapping("/allreview")
//    public ResponseEntity<List<ReviewDtoResponse>> getAllReview(){
//
//         List<ReviewDtoResponse> allReviews = this.reviewService.getAllReviews();
//         return new ResponseEntity<>(allReviews,HttpStatus.OK);
//    }
//
//    @GetMapping("/{movieId}")
//    public ResponseEntity<ReviewDtoRequest> getReviewByMovieId(@RequestBody ReviewDtoRequest reviewDto, @PathVariable String  movieId){
//        ReviewDtoRequest reviewByMovieId = this.reviewService.getReviewByMovieId(movieId);
//        return new ResponseEntity<>(reviewByMovieId,HttpStatus.OK);
//    }
//}
