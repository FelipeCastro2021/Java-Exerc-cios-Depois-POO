package com.chatgpt.Exercicios.ExceptionNumber.test;

import java.util.Scanner;

public class ExceptionNumberTest01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int number1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int number2 = scan.nextInt();
		
		scan.close();
		
		try {
			System.out.println(divisao(number1, number2));
		} catch(RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param a - 
	 * @param b - Não pode ser zero
	 * @return
	 * @throws IllegalArgumentException b não pode ser zero
	 * */
	public static double divisao(int a, int b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("O valor do segundo parâmetro não pode ser zero");
		}
		
		return (double) a / b;
	}
}
