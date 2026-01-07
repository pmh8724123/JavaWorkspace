package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.A_StringPool;
import com.kh.chap02_string.controller.B_StringBuilderAndBuffer;
import com.kh.chap02_string.controller.C_StringTokenizer;
import com.kh.chap02_string.controller.D_StringMethod;

public class Run {
	public static void main(String[] args) {
		A_StringPool asp = new A_StringPool();
		// asp.method3();

		B_StringBuilderAndBuffer bs = new B_StringBuilderAndBuffer();
		// bs.method();

		C_StringTokenizer cs = new C_StringTokenizer();
		// cs.method();

		D_StringMethod ds = new D_StringMethod();
		ds.method();

	}
}
