package SearchingMethods;

import java.util.Scanner;

public class Searching_Algo {

    public static int linear_s(int arr[],int target){
        int index=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return index;
    }

    public static int binary_s(int arr[], int target){
        int start=0;
        int end=arr.length-1;

        int mid=(start+end)/2;

        while(start<=end){

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                mid= -1;
            }
            mid=(start+end)/2;
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size_of_array= sc.nextInt();
        int arr[]=new int[size_of_array];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the Element at "+i+" index: ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the element to be searched: ");
        int target=sc.nextInt();
        //Algorithm for binary search
        System.out.println("Linear Search:");
        int ans= Searching_Algo.linear_s(arr,target);
        System.out.println("\n"+ans);

        System.out.println("Binary Search: ");
        int ans2= Searching_Algo.binary_s(arr,target);
        System.out.println(" \n"+ans2);
    }

}
