public class Pattern16
{
    public static void main(String[] args) {
        int lines=5;
        int starCount=1;
        int spaceCount=4;
        int mid=(lines+1)/2;
        for (int i=1;i<=lines;i++)
        {
            for (int j=1;j<=starCount;j++)
            {
                System.out.print("*");
            }
            for (int k=1;k<=spaceCount;k++)
            {
                System.out.print(" ");
            }
            for (int l=1;l<=starCount;l++)
            {
                System.out.print("*");
            }
            System.out.println();
            if(i<mid)
            {
                spaceCount=spaceCount-2;
                starCount++;
            }
            else
            {
                spaceCount=spaceCount+2;
                starCount--;
            }
        }
    }
}
