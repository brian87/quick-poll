package com.apress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.apress.repository.PollRepository;

@RestController
public class PollController {
        @Autowired
        private PollRepository pollRepository;
}

