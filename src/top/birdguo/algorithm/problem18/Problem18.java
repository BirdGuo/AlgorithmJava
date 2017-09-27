package top.birdguo.algorithm.problem18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem18 {

	public static Long sort() {

		Integer[] a = { 75 };
		Integer[] b = { 95, 64 };
		Integer[] c = { 17, 47, 82 };
		Integer[] d = { 18, 35, 87, 10 };
		Integer[] e = { 20, 4, 82, 47, 65 };
		Integer[] f = { 19, 1, 23, 75, 3, 34 };
		Integer[] g = { 88, 2, 77, 73, 7, 63, 67 };
		Integer[] h = { 99, 65, 4, 28, 06, 16, 70, 92 };
		Integer[] i = { 41, 41, 26, 56, 83, 40, 80, 70, 33 };
		Integer[] j = { 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 };
		Integer[] k = { 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 };
		Integer[] l = { 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 };
		Integer[] m = { 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 };
		Integer[] n = { 63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 };
		Integer[] o = { 4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23 };

		ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
		arrayList.add(a);
		arrayList.add(b);
		arrayList.add(c);
		arrayList.add(d);
		arrayList.add(e);
		arrayList.add(f);
		arrayList.add(g);
		arrayList.add(h);
		arrayList.add(i);
		arrayList.add(j);
		arrayList.add(k);
		arrayList.add(l);
		arrayList.add(m);
		arrayList.add(n);
		arrayList.add(o);

		Long result = 0L;

		for (Integer[] integers : arrayList) {

			Arrays.sort(integers);

			result += integers[integers.length - 1];

		}

		return result;

	}

	public static void main(String[] args) {

		System.out.println(sort());

	}

}
