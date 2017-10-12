import sun.applet.Main;

import java.util.Arrays;

public class ArrayRandom {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        int length = 1000;
        int[] array = new int[length];
        int i=0;
        while (i<1000){
            array[i] = i*10+(int)(Math.random()*10);
            i++;
        }


        long endTime = System.nanoTime();
        System.out.println("运行时间:"+(endTime-startTime)+"ns");
        System.out.println("运行结果:"+Arrays.toString(array));
    }

}