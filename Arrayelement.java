import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;
public class Arrayelement{
    public static int findlastoccurance(int arr[],int target){
        int low = 0,high = arr.length - 1;
        int result = -1;
        while(low<=high){
           int mid = low + high-low/2;
           
           if(arr[mid]==target){
            low=mid + 1;
            result = mid;
           }
           else if(arr[mid]>target)
           {
             high=mid - 1;
           }
           else{
            low = mid + 1;
           }

        }
        return result;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements present in an array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int result = findlastoccurance(arr,target);

        if(result == -1)
        {
            System.out.println("element not found in the given Array");
        }
        else{
            System.out.println("last occurance of the searching element is:" + result);
        }

        
    }
}