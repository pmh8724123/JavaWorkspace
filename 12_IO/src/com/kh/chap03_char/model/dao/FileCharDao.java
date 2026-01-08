package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	public void FileSave() {
		// FileWriter : 파일로 데이터를 2byte단위로 출력하는 스트림
		FileWriter fw = null; // try랑 finally 둘 다 쓰려고

		try {
			fw = new FileWriter("b_char.txts", true);

			fw.write("재밌는 io시간..\n");
			fw.write("잘 즐기고 계신가요..\n");
			fw.write(' ');

			char[] arr = { 'a', 'p', 'p', 'l', 'e' };
			fw.write(arr);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public void FileRead() {

		FileReader fr = null;

		try {
			fr = new FileReader("b_char.txt");

			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.print((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
