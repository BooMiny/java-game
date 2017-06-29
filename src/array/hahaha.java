package array;

import java.util.Scanner;

public class hahaha {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int choice;
		int size = 10;
		String str[][] = new String[10][];
		for(int i=0;i<size;i++){
			str[i] = new String[3];
		}
		
		while(true){
			menu.men();
			System.out.println("请输入选择操作：1.注册-------2.登录---------");
			choice = input.nextInt();
			switch(choice){
			case 1:
				menu.regi(str, input);
				break;
			case 2:
				menu.login(str, input, size);
				break;
			default:
				System.out.println("错误，请重新选择");
				break;
			}
		}
	}
}
