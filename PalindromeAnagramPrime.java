package com.algorithmprograms.bridgelabz;

public class PalindromeAnagramPrime {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Welcome to Palindromic Prime program");
		for (int i = 2; i <= 1000; i++) {

			int num = i, revNum = 0;
			while (num != 0) {
				int digit = num % 10;
				num /= 10;
				revNum = revNum * 10 + digit;
			}

			if (revNum == i) {
				boolean isPrime = true;
				for (int j = 2; j <= i / 2; j++) {

					if (i % j == 0) {
						isPrime = false;
						break;
					}

				}
				if (isPrime) {
					System.out.print(i + " ");

				}
			}
		}
	}
}
