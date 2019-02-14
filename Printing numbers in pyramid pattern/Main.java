import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
	    int i,j,k;
      int val=1;
      for(i=1;i<=n;i++)
      {
         for(k=1;k<=n-i;k++)
        {
          System.out.print(" ");
        }
         for(j=1;j<=i;j++)
        {
          System.out.print(val+" ");
           val = val+1;
        }
       System.out.print("\n");
      }
       
    }    
}