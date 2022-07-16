import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int sumeven=0,sumodd=0;
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                sumeven = sumeven+arr[i];
            }
            else
            {
                sumodd = sumodd+arr[i];
            }
        }
        System.out.println("Even: "+sumeven);
        System.out.println("Odd: "+sumodd);
    }
}


Output:
5
1 2 3 4 5
Even: 6
Odd: 9
