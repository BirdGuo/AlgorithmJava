package top.birdguo.algorithm.problem4;

public class Problem4 {

    public static void palindrome(int maxNum) {

        int resultTmp = 0;
        int count = 0;

        int forCount = 0;

        for (int i = maxNum; i >= 100; i--) {
            for (int j = maxNum; j >= i; j--) {
                forCount++;
                int num = i * j;

//                System.out.println("numStr=====11===" + num + "    j=" + j + "    i" + i);
                String numStr = String.valueOf(num);
                if (numStr.length() == 5) {
                    String first = numStr.substring(0, 2);
                    String end = numStr.substring(3);
                    StringBuffer sb = new StringBuffer(end);
                    end = sb.reverse().toString();
                    if (first.equals(end)) {
                        System.out.println("numStr=====11===" + num + "    j=" + j + "    i" + i);
//                        return;
                        count++;
                        if (resultTmp < num) {
                            resultTmp = num;
                        }

                        break;
                    }

                } else {
                    String first = numStr.substring(0, 3);
                    String end = numStr.substring(3);
//                    System.out.println("numStr=====22===" + num + "    first=" + first + "    end" + end);
                    StringBuffer sb = new StringBuffer(end);
                    end = sb.reverse().toString();
                    if (first.equals(end)) {
                        System.out.println("numStr=====22===" + num + "    j=" + j + "    i" + i);
//                        return;
                        count++;
                        if (resultTmp < num) {
                            resultTmp = num;
                        }
                        break;
                    }
                }

            }
        }

        System.out.println("final result = " + resultTmp + "    count=" + count+"    forCount"+forCount);
    }

    public static void main(String[] args) {


//        final result = 906609    count=628
       // final result = 906609    count=356    forCount293035
//        final result = 906609    count=628    forCount528753
        palindrome(999);

    }

}
