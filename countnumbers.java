import java.util.*;
import java.io.*;
public class countnumbers
{
    public static int countNumbers(int arr[],int target)
    {
       int low=0,high=arr.length-1;
       int result=-1;
       
       while(low<=high)
       { 
        // int mid = low + high - low/2;
        // if(arr[mid]==1){
        //     result = mid;
        //     low=mid + 1;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[mid]==target){
                    System.out.println(arr[mid]);
                }
                return arr[mid];
            }

        }
        
    
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements in an Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The number of one's in the given Array is:" + arr[mid]);
        int target =sc.nextInt();
        int result = countNumbers(arr,target);
        if(result==-1)
        {
           System.out.println("wrong input or program");
        }
        else{
            System.out.println("The number of one's in the given Array is:" );
        }
    }
}