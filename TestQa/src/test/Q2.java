package test;

import java.util.Scanner;

/*
 * 날짜 : 2020/05/01
 * 이름 : 김보경
 * 내용 : 자바 기본 입출력 연습문제
 */
public class Q2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("input 값 입력 : ");
		
		input  = sc.nextInt();
		int result = input * 3;
		
		System.out.println("(1+2)xinput = "+result);
		
		String name;
		System.out.print("name 값 입력 : ");
		
		name = sc.next();
		String hello = "안녕!"+name+"님 반갑습니다.";
		
		System.out.println(hello);

	}
}
