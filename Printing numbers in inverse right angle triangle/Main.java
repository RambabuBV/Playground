import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
	    int i,j;
      int val = n;
      for(i=1;i<=n;i++)
      {
        for(j=val;j>=1;j--)
        {
          System.out.print(j);
        }
       System.out.print("\n");
        val--;
      }
	}
}