public class Pattern13 {
    public static void main(String[] args) {
        int lines=5;
        int spaceCount=2;
        int starCount=1;
        int mid=(lines+1)/2;

        for (int i=1;i<=lines;i++)
        {
            for (int j=1;j<=spaceCount;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=starCount;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            if(i<mid)
            {
                spaceCount--;
                starCount++;
            }
            else
            {
                spaceCount++;
                starCount--;
            }
        }
    }
}
