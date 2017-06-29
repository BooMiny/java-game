package array;

import java.util.Scanner;

public class menu {
	static void men(){
	System.out.println("********************石头剪刀布*********************");
	System.out.println("1.登录");
	System.out.println("2.注册");
	System.out.println("*************************************************");
	}
	static void regi(String Str[][],Scanner Input){
		int k = 0;
		System.out.println("开始注册！");
		System.out.println("请输入用户名");
		Str[k][0] = Input.next();
		System.out.println("请输入密码");
		Str[k][1] = Input.next();
		System.out.println("请再次输入密码");
		Str[k][2] = Input.next();
		if(Str[k][1].equals(Str[k][2])){
			System.out.println("注册成功！");
			k++;
		}else{
			System.out.println("注册失败！");
		}
	}
	static void login(String Str[][],Scanner Input,int Size)
	{
		int i;
		System.out.println("开始登录");
		String[] str2 = new String[2];
		System.out.println("请输入用户名");
		str2[0] = Input.next();
		System.out.println("请输入密码");
		str2[1] = Input.next();
		for(i=0;i<Size;i++){
			if(str2[0].equals(Str[i][0])&&str2[1].equals(Str[i][1])){
			    System.out.println("登录成功！");
			    ga.game(Input);
			    break;
			}
		}
		if(i>=10){
			System.out.println("登录失败，请检查用户名和密码是否有误");
		}
	}
}
