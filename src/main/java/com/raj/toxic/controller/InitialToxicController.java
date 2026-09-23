package com.raj.toxic.controller;

import com.raj.toxic.service.PracticeDSAlgo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialToxicController {

    private static final Logger log = LoggerFactory.getLogger(InitialToxicController.class);

    private final PracticeDSAlgo practiceDSAlgo;

    public InitialToxicController(PracticeDSAlgo practiceDSAlgo) {
        this.practiceDSAlgo = practiceDSAlgo;
    }

    @GetMapping("/init")
    public String InitialToxicControllerInit() {

        log.info("Raj Gowda - Init Controller from logger");
        return "Raj Gowda : Init";
    }

    @GetMapping("/algorithm")
    public String AlgorithmPracticeHandler() {

        log.info("AlgorithmPracticeHandler: Start");

        practiceDSAlgo.execute();
        return "AlgorithmPracticeHandler: Completed";
    }
}
