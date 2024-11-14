package Accenture_cheatsheet_codingRound;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Find the Missing Number in an Array Given an array of consecutive integers with one missing element,
// write a function to find the missing number.

public class Missing_element_inArray {

    public static void missing_ele(int arr[]){
        Missing_element_inArray.sort(arr);
        int missing_element=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=missing_element){
                System.out.println("The element missing in the array is "+missing_element+" at index "+ i);
            }
            missing_element++;
        }
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements to be inserted in array: ");
        int number_of_elements= Integer.parseInt(br.readLine());
        int arr[] = new int[number_of_elements];
        for(int i=0;i<number_of_elements;i++){
            System.out.println("Enter the element for "+ i + " index: ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        Missing_element_inArray.missing_ele(arr);
        return arr;
    }

    public static void main(String[] args) throws IOException {
        Missing_element_inArray.input();
    }
}




















