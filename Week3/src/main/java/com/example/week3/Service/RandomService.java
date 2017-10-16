package com.example.week3.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RandomService {
    public String GetArrayRandom(){
        int length = 1000;
        int[] array = new int[length];
        int i=0;
        while (i<1000){
            array[i] = i*10+(int)(Math.random()*10);
            i++;
        }
        return   Arrays.toString(array);
    }
}
