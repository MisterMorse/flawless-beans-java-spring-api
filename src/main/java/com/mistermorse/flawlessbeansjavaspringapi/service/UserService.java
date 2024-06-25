package com.mistermorse.flawlessbeansjavaspringapi.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean passwordsMatch(String provided, String stored) {
        return provided.equals(stored);
    }

}
