import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int  n = sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0; i<arr.length; i++){
	        for(int j=i+1; j<arr.length; j++)
	        {
    	        int temp=0;
	            if(arr[i]>arr[j])
	            {
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	        System.out.print(arr[i]+" ");
	    }
	}
}




import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int  n = sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	}
}

Output
5
1 2 5 4 3
1 2 3 4 5 
  
5
1 3 2 5 4
[1, 2, 3, 4, 5]
