package com.raj.toxic.service.impl;

import com.raj.toxic.service.PracticeDSAlgo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PracticeDSAlgoImpl implements PracticeDSAlgo {

    private static final Logger log = LoggerFactory.getLogger(PracticeDSAlgoImpl.class);

    /**
     *
     */
    @Override
    public void execute() {
        log.info("Algorithm Sort Started");

        int[] input = {34, 23, 67, 36, 12};

        bubbleSort(input);
        log.info("Algorithm Sort Completed");
    }

    /**
     * @param input
     */
    @Override
    public void bubbleSort(int[] input) {
        log.info("Input Values: {}", Arrays.toString(input));
        int length = input.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        log.info("Sorted Input Values: {}", Arrays.toString(input));

    }
}
