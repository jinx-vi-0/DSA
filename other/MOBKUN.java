// codechef : staters66
// Just like MOB!

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t>0) {
		    int n = in.nextInt();
		    int m = in.nextInt();
		    int k = in.nextInt();
		    int x = in.nextInt();
		       int sum = k*n+m;
		       int temp = n*(k-1);
		       int rem = x % sum;
		       if(rem != 0 && (rem-temp) <=0)
		           System.out.println("no");
		       else
		            System.out.println("yes");
		    t--;
		}
	}
}
