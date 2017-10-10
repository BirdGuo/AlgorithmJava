package top.birdguo.algorithm.problem22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Problem22 {

	public static void main(String[] args) {

		System.out.println(countName());

	}

	/**
	 * 实际计算方法
	 * 
	 * @return
	 */
	public static Long countName() {

		Long result = 0L;

		// 从文件中读取名称
		String readTxtFile = readTxtFile("E:\\p022_names.txt");

		// 组成数组并排序
		String[] splitNames = splitNames(readTxtFile);

		for (int i = 0; i < splitNames.length; i++) {

			// 计算字母和
			int sumSplit = sumSplit(splitNames[i]);
			// 结果累加
			result += (sumSplit * (i + 1));

		}

		return result;

	}

	/**
	 * 计算名称字母值
	 * 
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static int sumSplit(String name) {

		// 字母集
		HashMap<String, Integer> alphabet = new HashMap<String, Integer>();
		alphabet.put("A", 1);
		alphabet.put("B", 2);
		alphabet.put("C", 3);
		alphabet.put("D", 4);
		alphabet.put("E", 5);
		alphabet.put("F", 6);
		alphabet.put("G", 7);
		alphabet.put("H", 8);
		alphabet.put("I", 9);
		alphabet.put("J", 10);
		alphabet.put("K", 11);
		alphabet.put("L", 12);
		alphabet.put("M", 13);
		alphabet.put("N", 14);
		alphabet.put("O", 15);
		alphabet.put("P", 16);
		alphabet.put("Q", 17);
		alphabet.put("R", 18);
		alphabet.put("S", 19);
		alphabet.put("T", 20);
		alphabet.put("U", 21);
		alphabet.put("V", 22);
		alphabet.put("W", 23);
		alphabet.put("X", 24);
		alphabet.put("Y", 25);
		alphabet.put("Z", 26);

		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			// 获取字母
			char charAt = name.charAt(i);
			// 获取字母值
			Integer integer = alphabet.get(String.valueOf(charAt));
			// 累加字母值
			sum += integer;
		}
		return sum;
	}

	/**
	 * 
	 * 将名称放入数组中
	 * 
	 * @param namesContent
	 *            读取到的内容
	 * @return
	 */
	public static String[] splitNames(String namesContent) {
		// 拆分
		String[] names = namesContent.split("\",\"");

		String nameFirst = names[0];
		// 去掉首个"
		nameFirst = nameFirst.replaceAll("\"", "");
		// 重新赋值
		names[0] = nameFirst;

		String nameLast = names[names.length - 1];
		// 去掉末个"
		nameLast = nameLast.replaceAll("\"", "");
		// 重新赋值
		names[names.length - 1] = nameLast;

		// 排序
		Arrays.sort(names);

		return names;

	}

	/**
	 * 读取文本文件内容
	 * 
	 * @param path
	 *            绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
	 * @return
	 */
	public static String readTxtFile(String path) {

		String content = "";
		try {
			/* 读入TXT文件 */
			File filename = new File(path); // 要读取以上路径的input。txt文件

			// 判断是否存在
			if (filename.exists() && filename.isFile()) {
				StringBuffer sb = new StringBuffer();
				// 读取到缓存中
				BufferedReader br = new BufferedReader(new FileReader(path));
				// 按行读取
				content = br.readLine();
				while (content != null) {
					// 拼接字符
					sb.append(content);
					content = br.readLine();
				}
				content = sb.toString();

			} else {
				System.out.println("not exit");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return content;

	}

}
