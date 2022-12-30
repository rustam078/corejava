package com.fullcreative.trycatchfinally;

public class TryWithReturn {
	public static void main(String[] args) {

		System.out.println(retn());

	}

	@SuppressWarnings("finally")
	public static int retn() {
		try {
			System.out.println(10 / 0);
			return 10;

		} catch (Exception e) {
			return 20;
		} finally {
			return 30;
		}
	}

}
