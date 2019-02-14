import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int sum=0;
      while(n!=0)
      {
        int r = n%10;
        sum=sum+(r*r*r);
        n=n/10;
      }
        if(sum==temp) 
          System.out.print("Armstrong Number");
        else
          System.out.print("Not a Armstrong Number");
      }
	}