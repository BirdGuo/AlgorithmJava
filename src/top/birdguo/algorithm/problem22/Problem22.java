package top.birdguo.algorithm.problem22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem22 {

	public static void main(String[] args) {

		System.out.println(readTxtFile(""));

	}

	public static String readTxtFile(String path) {

		String content = "";
		try {
			/* 读入TXT文件 */
			String pathname = "E:\\p022_names.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
			File filename = new File(pathname); // 要读取以上路径的input。txt文件

			if (filename.exists() && filename.isFile()) {

				StringBuffer sb = new StringBuffer();
				BufferedReader br = new BufferedReader(new FileReader(pathname));
				content = br.readLine();
				while (content != null) {
					sb.append(content);
					content = br.readLine();
				}
				content = sb.toString();
				
				String[] split = content.split("\\",\\"");
				
				for (String string : split) {
					System.out.println(string);
				}
				
			}

			// // 建立一个输入流对象reader
			// InputStreamReader reader = new InputStreamReader(new
			// FileInputStream(filename),"UTF-8");
			// BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
			// content = br.readLine();
			// while (content != null) {
			// content = br.readLine(); // 一次读入一行数据
			// }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("=========1=======");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("=========2=======");
		}

		System.out.println(content);
		return content;

	}

}
