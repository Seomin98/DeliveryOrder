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
			String orders = sc.next();
			System.out.println("�귣�� ���� : ");
			String brand = sc.next();
			System.out.println("�޴� ���� : ");
			int menu = sc.nextInt();
			// orders[i] = new order();

		}

	}

	public void checkMenu() {
		for (int i = 0; i < orders.length; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("====== ��� ���� Ȯ�� =====");
			System.out.println("�ֹ��Ͻ� ������" + orders);
			System.out.println("�귣���    �̰�");
			System.out.println("�޴���   �̰�");
			System.out.println("���� : ");
		}
	}

	public int deliveryTime() {
		System.out.println("======��� ����ð�======");
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
			System.out.print("��� ���� �ð���" + " " + lottos[i] + " " + "�� �Դϴ�");
		}
		return 0;
	}
}
