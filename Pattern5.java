public class Pattern5 {
    public static void main(String[] args) {
        int lines=5;
        int starCount=9;

        for (int i=1;i<=lines;i++)
        {
            for (int j=1;j<=starCount;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            starCount=starCount-2;

        }
    }
}