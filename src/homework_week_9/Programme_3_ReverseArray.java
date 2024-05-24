package homework_week_9;

import java.util.Arrays;

public class Programme_3_ReverseArray {
    //Write a Java program to reverse an array of integer values

    public static void main(String[] args) {


        int[] array= new int[]{23,45,34,54,67,78};
        System.out.println("Original array:"+ Arrays.toString(array));
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray();
        System.out.println("Reverse array:");
        obj.reverseAnArray(array);

    }


    public void reverseAnArray(int[] list){
        for (int i=0; i<(list.length)/2 ; i++) {
            int temp=list[i];
            list[i]=list[list.length -1 -1];
            list[list.length -1 -1] = temp;

        }
        System.out.println(Arrays.toString(list));

    }
}
