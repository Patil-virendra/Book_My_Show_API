package com.api.controllers;

import com.api.payloads.request.ShowTimeDtoRequest;
import com.api.payloads.response.ShowTimeDtoResponse;
import com.api.service.ShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/showtime")
public class ShowTimeController {
    @Autowired
    private ShowTimeService showTimeService;

    @PostMapping("/{movieId}/{hallId}")
    public ResponseEntity<ShowTimeDtoResponse> addNewShowTime(@RequestBody ShowTimeDtoRequest showTimeDtoRequest, @PathVariable String movieId, @PathVariable String hallId)
    {
        ShowTimeDtoResponse showTimeDtoResponse = this.showTimeService.addNewShowTime(showTimeDtoRequest, movieId, hallId);

        return new ResponseEntity<>(showTimeDtoResponse, HttpStatus.CREATED);
    }

    @PostMapping("/newshowtime")
    public ResponseEntity<ShowTimeDtoResponse> newShowTime(@RequestBody ShowTimeDtoRequest showTimeDto){
         ShowTimeDtoResponse showTimeDtoResponse = this.showTimeService.AddShowTime(showTimeDto);
        return new ResponseEntity<>(showTimeDtoResponse, HttpStatus.CREATED);
    }
    @GetMapping("/showtime")
    public ResponseEntity<List<ShowTimeDtoResponse>> getShowTime(){
         List<ShowTimeDtoResponse> showTimeDtls = this.showTimeService.GetShowTimeDetails();
         return new ResponseEntity<>(showTimeDtls,HttpStatus.OK);
    }
}
