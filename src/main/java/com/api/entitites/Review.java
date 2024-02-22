//package com.api.entitites;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//public class Review {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    private String reviewId;
//
////    @Column(name="USER_ID")
////    private String userID;
////
////    @Column(name="MOVIE_ID")
////    private String movieId;
//
//    private float rating;
//
//    private String comment;
//
//    private LocalDateTime timeStamp;
//
//    @ManyToOne
//    private User user;
//
//    @ManyToOne
//    private Movie movie;
//}
