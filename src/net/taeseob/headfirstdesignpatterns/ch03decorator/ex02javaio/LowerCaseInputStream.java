package net.taeseob.headfirstdesignpatterns.ch03decorator.ex02javaio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
	// 모든 InputStream의 추상 데코레이터인 FilterInputStream을 확장한다.

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	// InputTest 클래스에서는 안 쓰는 부분
//	@Override
//	public int read(byte b[]) throws IOException {
//        return read(b, 0, b.length);
//    }
//	
//	@Override
//	public int read(byte[] b, int offset, int len) throws IOException {
//		int result = super.read(b, offset, len);
//		for (int i = offset; i < offset + result; i++) {
//			b[i] = (byte)Character.toLowerCase((char)b[i]);
//		}
//		return result;
//	}

}
