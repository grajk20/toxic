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

    @Override
    public String runPlayground(int valueTwo, int valueThree){

//=======================Arrays - extra===================================================
        int[] newA = new int[4];






//=======================Arrays===================================================
//        int[][] multiDimensional = new int [3][4];
       /* int[][][] threeDimensionalArray = new int [3][4][5];

        int[][] multiDimensional = new int [3][];
        multiDimensional[0] = new int[3];
        multiDimensional[1] = new int[5];
        multiDimensional[2] = new int[4];
        int sum = 0;

        for (int i = 0; i < multiDimensional.length; i++) {
            for (int j = 0; j<multiDimensional[i].length; j++){
                int random = (int) (Math.random() * 100);
                multiDimensional[i][j] = random;
            }
        }

        for(int[] i : multiDimensional){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j<4; j++){
////                log.info("Array Value at index {}{} is {}", i, j, multiDimensional[i][j]);
//                System.out.print(multiDimensional[i][j] + " ");
//                sum += multiDimensional[i][j];
//            }
//            System.out.println();
//        }

        return "Sum of all elements in Array is ";

//=======================Arrays===================================================
/*        int[]  a1= {1, 2, 3, 6, 9};
        int sum = 0;
        for (int i = 0; i < a1.length; i++) {
            log.info("Array Value at index {} is {}", i, a1[i]);
            sum += a1[i];
        }

        return "Sum of all elements in Array is "+sum;

*/
//==========================================================================
//        for(int i = valueTwo; i < valueThree; i++){
//            log.info("Value Three: {}", i);
//        }
//
//


//==========================================================================
//        Calculator calculator = new Calculator();
//        int result = calculator.add(valueTwo, valueThree);
//        return "Sum of 2 numbers is : "+result;
//        int k = 0;
//        while (true) {
//            log.info("Value of k : {}", k);
//            k++;
//        }

//==========================================================================
        /*
        Ternary Operator & Switch Statements
         */
        /*
        String result  = valueThree > valueTwo ? "Go To Work" : "Go Home" ;
        log.info(" x is greatest: {}", result);

        switch (valueThree) {
            case 1:
                log.info(" It matches One");
                break;
            case 3:
                log.info(" It matches Two");
                break;
            default:
                log.info(" It matches None");
        }
         */
    }
}
