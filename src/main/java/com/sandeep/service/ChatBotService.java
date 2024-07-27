package com.sandeep.service;

import com.sandeep.model.CoinDTO;
import com.sandeep.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
