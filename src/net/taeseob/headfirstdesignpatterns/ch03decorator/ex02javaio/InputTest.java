package net.taeseob.headfirstdesignpatterns.ch03decorator.ex02javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		int c;
		try {
			InputStream is =
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream(InputTest.class.getResource("").getPath() + "test.txt")));
			/*
			 * 추상 구성요소 InputStream을 확장한 것들 :
			 * FileInputStream, ByteArrayInputStream, FilterInputStream 등
			 * 
			 * 이 중에서 FilterInputStream은 추상 데코레이터. InputStream 속성을 갖는다.
			 * 이걸 확장한 구상 데코레이터 :
			 * BufferedInputStream, DataInputStream, LineNumberInputStream 등
			 * LowerCaseInputStream도 FilterInputStream을 확장 한 것.
			 */
			while ((c = is.read()) >= 0) {
				System.out.print((char)c);
			}
			is.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
