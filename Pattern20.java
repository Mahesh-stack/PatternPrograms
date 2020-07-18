public class Pattern20 {
    public static void main(String[] args) {
        int lines=5;
        int starCount=1;
        int spaceCount=4;

        for (int i=1;i<=lines;i++)
        {
            for (int j=1;j<=spaceCount;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=starCount;k++)
            {
                if(k==1||k==starCount||i==lines)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            spaceCount--;
            starCount=starCount+2;

        }
    }
}
