package com.ngx20080110.test;

public class TestTryCatchFinal {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
		}
		catch(Exception ex) {
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
	
	public static void badMethod() {
		throw new Error();
	}
	
	public static void badMethod2() throws Exception {
		throw new Exception("TEST");
	}

}
