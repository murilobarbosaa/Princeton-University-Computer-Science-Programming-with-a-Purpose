public class RandomWalker {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int x = 0;
        int y = 0;

        System.out.printf("(%d, %d)\n", x, y);

        while (Math.abs(x) + Math.abs(y) < r) {
            int direction = (int) ( Math.random()* 4);
            
            if (direction == 0) x++;
            else if (direction == 1) x--;
            else if (direction == 2) y++;
            else y--;

            System.out.printf("(%d, %d)\n", x, y);
            steps++;
        }
        System.out.printf("steps = %d\n", steps);
    }
}