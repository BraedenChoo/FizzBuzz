public class Reduce {
    public static void main(String[] args) {
        int start = 100;
        int steps = 0;
        while (start > 0) {
            steps++;
            if (start % 2 == 0) {
                start = start / 2;
            } else {
                start -= 1;
            }
        }
        System.out.println(steps);
    }
}
