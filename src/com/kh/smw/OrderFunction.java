package com.kh.smw;

import java.util.Random;
import java.util.Scanner;

public class OrderFunction {
	Order[] orders;

	public OrderFunction() {
		orders = new Order[5];
	}

	public int OrderMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======배달민국======");
		System.out.println("1. 배달음식 고르기");
		System.out.println("2. 배달 내역 확인");
		System.out.println("3. 배달 예상시간");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void choiceMenu() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < orders.length; i++) {
			System.out.println("====== 음식 선택 ======");
			System.out.println("먹고 싶은 음식 : ");
			String orders = sc.next();
			System.out.println("브랜드 선택 : ");
			String brand = sc.next();
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			// orders[i] = new order();

		}

	}

	public void checkMenu() {
		for (int i = 0; i < orders.length; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("====== 배달 내역 확인 =====");
			System.out.println("주문하신 음식은" + orders);
			System.out.println("브랜드는    이고");
			System.out.println("메뉴는   이고");
			System.out.println("선택 : ");
		}
	}

	public int deliveryTime() {
		System.out.println("======배달 예상시간======");
		int[] lottos = new int[1];
		for (int i = 0; i < lottos.length; i++) {
			// order[i] = rand.nextInt(31) + 30;
			for (int e = 0; e < i; e++) {
				if (lottos[i] == lottos[e]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lottos.length - 1; i++) {
			for (int j = 0; j < (lottos.length - 1) - i; j++) {
				if (lottos[j] > lottos[j + 1]) {
					int temp = lottos[j + 1];
					lottos[j + 1] = lottos[j];
					lottos[j] = temp;

				}
			}
		}
		for (int i = 0; i < lottos.length; i++) {
			System.out.print("배달 예상 시간은" + " " + lottos[i] + " " + "분 입니다");
		}
		return 0;
	}
}
