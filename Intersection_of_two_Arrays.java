package Accenture_cheatsheet_codingRound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Find the Intersection of Two Arrays Write a function that finds the elements
//present in both a given pair of arrays

public class Intersection_of_two_Arrays {
     public static int[] arrayOfSameElements = new int[10];
    public static int[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements to be inserted in array: ");
        int number_of_elements= Integer.parseInt(br.readLine());
        int arr[] = new int[number_of_elements];
        for(int i=0;i<number_of_elements;i++){
            System.out.println("Enter the element for "+ i + " index: ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        return arr;
    }

    public static int[] intersection_func(int[] arr,int arr2[]) {
        int k=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j< arr2.length;j++){
                    if(arr[i]==arr2[j]){
                        arrayOfSameElements[k]=arr[i];
                        k++;
                    }
                }
            }
            return arrayOfSameElements;
    }

    public static void duplicates(int arrayOfSameElements[]){
        for(int i=0;i< arrayOfSameElements.length-1;i++){
            for(int j=0;j< arrayOfSameElements.length-1;j++){
                if(arrayOfSameElements[i]==arrayOfSameElements[j]){
                    arrayOfSameElements[j]=arrayOfSameElements[j+1];
                }
                if(arrayOfSameElements[j]==0 && (j+1)!=arrayOfSameElements.length){
                    arrayOfSameElements[j]=arrayOfSameElements[j+1];
                }
            }
        }
    }
    public static void print(int arrayOfSameElements[]){
        for(int i=0;i< arrayOfSameElements.length;i++){
            if(arrayOfSameElements[i] !=0) {
                System.out.print("The common elements in both the arrays are: "+arrayOfSameElements[i] + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int arr[]=Intersection_of_two_Arrays.input();
        int arr2[]=Intersection_of_two_Arrays.input();
        Intersection_of_two_Arrays.intersection_func(arr,arr2);
        Intersection_of_two_Arrays.duplicates(arrayOfSameElements);
        Intersection_of_two_Arrays.print(arrayOfSameElements);

    }
}
