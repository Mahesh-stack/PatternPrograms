public class Pattern22 {
    public static void main(String[] args) {
        int lines = 5;
        int starCount = 5;

        for (int i = 1; i <= lines; i++)
        {
            for (int k = 1; k <= starCount; k++)
            {
                if (k == 1 || k == starCount || i == 1 ||i==lines)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
