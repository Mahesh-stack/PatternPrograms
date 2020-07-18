public class Pattern40 {
    public static void main(String[] args) {
        int lines=5;
        int starCount=5;

        for (int i=1;i<=lines;i++)
        {
            for (int j=1;j<=starCount;j++)
            {
                if(j==3||i==5)
                {
                    System.out.print("*");
                }
                else
                    {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
