public class Pattern21
{
    public static void main(String[] args) {
        int lines=5;
        int starCount=9;
        int spaceCount=0;

        for (int i=1;i<=lines;i++)
        {
            for (int j=1;j<=spaceCount;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=starCount;k++)
            {
                if(k==1||k==starCount||i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            spaceCount++;
            starCount=starCount-2;

        }
    }
}
