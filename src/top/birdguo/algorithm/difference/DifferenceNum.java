package top.birdguo.algorithm.difference;

public class DifferenceNum {

    public static Long diference(Long num) {

        Long result = 0L;
        for (int i = 1; i < num; i++) {
            result += i * ((num-i) * (i + 1 + num) / 2);
        }

        return result * 2;
    }

    public static double diference2(Long num) {

        Long a = 0L;
        for (int i = 1; i <= num; i++) {
            a += i * i;
        }

        double pow = Math.pow((1 + num) * num / 2, 2);

        return (pow-a);

    }

    public static void main(String[] args) {

        System.out.println(diference(100L));

//        System.out.println(Math.pow(((1 + 100) * 100 / 2),2));
//
//        System.out.println(diference2(100L));
    }

}
