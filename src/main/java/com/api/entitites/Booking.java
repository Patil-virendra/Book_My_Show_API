package com.api.entitites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bookingId;

//	private String moviePoster;
//
//	private String movieName;

    //private LocalTime showTime;//have entity   //what are you doing

    private String location; //from cinema hall

    private String theater;//from cinema hall

    private List<String> seats;//

    private double seatPrice;//

    private String food;//

    private double foodPrice;//

    private double totalPrice;//

    @OneToOne(mappedBy="booking")
    private Payment payment;


    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;


    @ManyToOne

    private Movie movies;



    @OneToOne(mappedBy = "booking",cascade = CascadeType.ALL)
    private ShowTime showTime;


    @ManyToOne
    private CinemaHall cinemaHall;


//    {
//        "_id": "64169d8d640a4dc817f19e4a",
//            "userName": "ketan",
//            "userEmail": "kkthakur9990@gmail.com",
//            "movieName": "Guardians of the galaxy",
//            "poster": "https://cdn.shopify.com/s/files/1/0057/3728/3618/products/0cc70cae1f62b215aee14211c78fe95e_cda1a52f-e010-476a-9cb8-cd4392848bf7_480x.progressive.jpg?v=1573584677",
//            "location": "Pune",
//            "theater": "City Pride ( Abhiruchi Mall )",
//            "bookedSeats": [
//        "G5",
//                "G6"
//    ],
//        "time": "08:15 AM",
//            "food": "",
//            "price": "220",
//            "totalPrice": "440",
//            "cardNo": "234543553665",
//            "cardHolder": "Harshwardhan",
//            "expDate": "01/24",
//            "__v": 0
//    },
//    {
//        "_id": "6416b4f9640a4dc817f19f79",
//            "userName": "vikram",
//            "userEmail": "vikram@gmail.com",
//            "movieName": "Avatar - The Way of Water",
//            "poster": "https://cdn.shopify.com/s/files/1/0057/3728/3618/products/313099306_466556672134552_8738886800381528729_n_480x.progressive.jpg?v=1669136451",
//            "location": "Pune",
//            "theater": "City Pride ( Abhiruchi Mall )",
//            "bookedSeats": [
//        "A9",
//                "A10"
//    ],
//        "time": "08:15 AM",
//            "food": "2 PopCorn Tub & 2 Coke",
//            "price": "800",
//            "totalPrice": "2020",
//            "cardNo": "3587432765432757",
//            "cardHolder": "Vikram",
//            "expDate": "05/25",
//            "__v": 0
//    },
//    {
//        "_id": "6417f78f52c4e0ccb342142f",
//            "userName": "Harsh",
//            "userEmail": "harsh@gmail.com",
//            "movieName": "Black Panther",
//            "poster": "https://cdn.shopify.com/s/files/1/0057/3728/3618/products/black-panther-wakanda-forever_bbma1guv_480x.progressive.jpg?v=1666882065",
//            "location": "Pune",
//            "theater": " Cinepolis ( Seasons Mall - Hadapsar )",
//            "bookedSeats": [
//        "B5",
//                "B6",
//                "C7",
//                "C8"
//    ],
//        "time": "09:00 AM",
//            "food": "Coke (600ml)",
//            "price": "500",
//            "totalPrice": "2160",
//            "cardNo": "8765121654651013",
//            "cardHolder": "Harshwardhan",
//            "expDate": "01/24",
//            "__v": 0
//    }
//]
}
