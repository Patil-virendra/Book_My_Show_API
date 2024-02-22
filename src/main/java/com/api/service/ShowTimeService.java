package com.api.service;

import com.api.payloads.request.ShowTimeDtoRequest;
import com.api.payloads.response.ShowTimeDtoResponse;

import java.util.List;

public interface ShowTimeService {

    ShowTimeDtoResponse AddShowTime(ShowTimeDtoRequest showTimeDtoRequest);
    List<ShowTimeDtoResponse> GetShowTimeDetails( );
    ShowTimeDtoResponse addNewShowTime(ShowTimeDtoRequest showTimeDtoRequest, String movieId, String hallId);

}
