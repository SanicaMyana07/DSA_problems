package Accenture_cheatsheet_codingRound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Find the Maximum Element in an Array Write a function that finds the
// maximum element in a given array of integers.

public class Max_element_inArray {
    public static void max_ele(int arr[]){
        int max=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element of the given array is: "+ max);
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
        Max_element_inArray.max_ele(arr);
        return arr;
    }

    public static void main(String[] args) throws IOException {
        Max_element_inArray.input();
        }
    }
