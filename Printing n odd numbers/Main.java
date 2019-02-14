import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i;
      {
      for(i=1;i<=n;i=i+1)
      {
        int res = 2*i-1;
        System.out.println(res);
      }
      }
	}
}