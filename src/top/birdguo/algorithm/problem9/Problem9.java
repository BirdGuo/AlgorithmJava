package top.birdguo.algorithm.problem9;

public class Problem9 {

    private static Long pythagorean(Long num) {
        Long result = 0L;
        Long half = (num / 2);
        for (Long a = 1L; a < half; a++) {
            Long b = 0l;
            b = (500000L - 1000 * a) / (1000 - a);
            Long d = (500000L - 1000 * a) % (1000 - a);

            if (d == 0 && b > a) {
                System.out.println("b =====" + b + "    a=" + a + "    " + (1000 - a - b));
                result = a * b * (1000 - a - b);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Long pythagorean = pythagorean(1000L);

        System.out.println(pythagorean);
    }

}
