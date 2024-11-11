package Accenture_cheatsheet_codingRound;

// The function accepts an integer array ‘arrʼ of size ‘nʼ as its argument.
// Each element of ‘arrʼ represents the number of chocolates distributed to a person.
// The function needs to return the minimum number of chocolates that need to be distributed
// to each person so that the difference between the chocolates of any two people is minimized.

//Input:n: 5     , arr: 10 4 12 3 1   , Output: 3

import static java.time.LocalTime.MAX;

public class Chocolate_problem {
    public static int choco_distributed(int arr[]){
        int min_diff=100;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]-arr[i+1]<min_diff || arr[i+1]-arr[i]<min_diff) {
                min_diff = arr[i];
            }
        }
        System.out.println(min_diff);
        return min_diff;
    }

    public static void main(String[] args) {
        int arr[]={10,4,12,3,1};
        Chocolate_problem.choco_distributed(arr);
    }
}
