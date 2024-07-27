package com.sandeep.service;

import com.sandeep.model.Coin;
import com.sandeep.model.User;
import com.sandeep.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}