package com.movie.ddd.application.service.event.impl;

import com.movie.ddd.application.service.event.EventAppService;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {
    @Override
    public String hiTh(String who) {
        return "Thu Hoai " + who;
    }
}
