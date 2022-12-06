package com.kh.smw;

import java.util.Random;
import java.util.Scanner;

public class OrderFunction {
	Order [] orders;

	public OrderFunction() {
		orders = new Order[1];
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
			String food = sc.next();
			System.out.println("브랜드 선택 : ");
			String brand = sc.next();
			System.out.println("메뉴 선택 : ");
			String menu = sc.next();
			orders[i] = new Order();
			orders[i].setOrders(food);
			orders[i].setBrand(brand);
			orders[i].setMenu(menu);

		}

	}

	public void checkMenu() {
		for(int i = 0; i < orders.length; i++) {
			System.out.println("====== 배달 내역 확인 =====");
			System.out.println("주문하신 음식은" + orders[i].getOrders() + "입니다.");
			System.out.println( "브랜드는" + orders[i].getBrand() + "입니다");
			System.out.println( "메뉴는" + orders[i].getMenu() + "입니다");
		}
	}

	public int deliveryTime() {
		Random rand = new Random();
		System.out.println("====== 배달 예상시간 ======");
		int [] delivery = new int[1];
		for (int i = 0; i < delivery.length; i++) {
			delivery[i] = rand.nextInt(31) + 30;
			for (int e = 0; e < i; e++) {
				if (delivery[i] == delivery[e]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < delivery.length - 1; i++) {
			for (int j = 0; j < (delivery.length - 1) - i; j++) {
				if (delivery[j] > delivery[j + 1]) {
					int temp = delivery[j + 1];
					delivery[j + 1] = delivery[j];
					delivery[j] = temp;

				}
			}
		}
		for (int i = 0; i < delivery.length; i++) {
			System.out.print("배달 예상 시간은" + " " + delivery[i] + " " + "분 입니다");
		}
		return 0;
	}
}
