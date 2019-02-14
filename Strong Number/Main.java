import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int sum=0;
      while(n>0)
      {
        int i,f=1;
        int r = n%10;
        for(i=1;i<=r;i++)
        {
          f=f*i;
        }
        sum=sum+f;
        n=n/10;
      }
        if(sum==temp) 
          System.out.print("Yes");
        else
          System.out.print("No");
      }
	}