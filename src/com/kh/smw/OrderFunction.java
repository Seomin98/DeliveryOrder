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
		System.out.println("======��޹α�======");
		System.out.println("1. ������� ����");
		System.out.println("2. ��� ���� Ȯ��");
		System.out.println("3. ��� ����ð�");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void choiceMenu() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < orders.length; i++) {
			System.out.println("====== ���� ���� ======");
			System.out.println("�԰� ���� ���� : ");
			String food = sc.next();
			System.out.println("�귣�� ���� : ");
			String brand = sc.next();
			System.out.println("�޴� ���� : ");
			String menu = sc.next();
			orders[i] = new Order();
			orders[i].setOrders(food);
			orders[i].setBrand(brand);
			orders[i].setMenu(menu);

		}

	}

	public void checkMenu() {
		for(int i = 0; i < orders.length; i++) {
			System.out.println("====== ��� ���� Ȯ�� =====");
			System.out.println("�ֹ��Ͻ� ������" + orders[i].getOrders() + "�Դϴ�.");
			System.out.println( "�귣���" + orders[i].getBrand() + "�Դϴ�");
			System.out.println( "�޴���" + orders[i].getMenu() + "�Դϴ�");
		}
	}

	public int deliveryTime() {
		Random rand = new Random();
		System.out.println("====== ��� ����ð� ======");
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
			System.out.print("��� ���� �ð���" + " " + delivery[i] + " " + "�� �Դϴ�");
		}
		return 0;
	}
}
