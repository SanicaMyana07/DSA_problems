package Accenture_cheatsheet_codingRound;

// The function accepts a character array ‘arrʼ of size ‘nʼ as its argument.
// Each element of ‘arrʼ represents the status of a parking slot, where ‘Sʼ represents an
// empty slot and ‘Xʼ represents an occupied slot.
// The function needs to return the maximum number of cars that can be parked in the parking lot.
// It is assumed that two cars cannot occupy the same slot and cars can only park in consecutive empty slot.

public class Parking_slot {

    public static int max_cars(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]=='S' && arr[i+1]=='S'){
                System.out.println("The car can be parked at slot: "+i);
                arr[i]='X';
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={'S', 'X', 'S', 'S', 'X', 'S', 'S', 'S'};
        int count=Parking_slot.max_cars(arr);
        System.out.println("The number of parking slots available are: "+ count);
    }
}
