public class expressionCompare {

    public static void main(String[] args) {
        int n, y1, y2, num = 6;

        System.out.printf("%-6s%-6s%-6s%n", "N", "Y1", "Y2");
        for (int i = 0; i <= 100; i +=10)
        {
            y1 = 100 * i + 10;
            y2 = 5 * i * i + 2;
            System.out.printf("%-6d%-6d%-6d%n", i, y1, y2);
        }
    }
}
