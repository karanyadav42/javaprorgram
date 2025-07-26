public class Pattern{
    public static void main(String[] args) 
	{
        int n = 4;
        for(int row = 1; row <= n; row++)
	 {
            for(int col = 1; col <=2*n-1; col++) 
		{
                if (row == n || col-row<= n-1 )
                System.out.print("* ");
                }
            System.out.println();
        }
        
    }
}