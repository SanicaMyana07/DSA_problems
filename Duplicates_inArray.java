package Accenture_cheatsheet_codingRound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Duplicates_inArray {
    public static int[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements to be inserted in array: ");
        int number_of_elements= Integer.parseInt(br.readLine());
        int arr[] = new int[number_of_elements];
        for(int i=0;i<number_of_elements;i++){
            System.out.println("Enter the element for "+ i + " index: ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        Duplicates_inArray.duplicates(arr);
        return arr;
    }

    public static void duplicates(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length-1;j++){
                if(arr[i]==arr[j]){
                    arr[j]=arr[j+1];
                    arr[j+1]=0;
                }

            }
        }
    }

    public static void main(String[] args) throws IOException {
        int arr[]=Duplicates_inArray.input();
        Duplicates_inArray.duplicates(arr);
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0) {
                System.out.print(arr[i] + " ");
            }
        }

    }

}
