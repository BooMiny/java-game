package array;

import java.util.Scanner;

public class ga {
	static void game(Scanner Input)
	{
		int el = (int)Math.random()*3;
		String stt;
		if(el==1){
			stt = "石头";
		}else if(el==2){
			stt = "剪刀";
		}else{
			stt = "布";
		}
		System.out.println("请输入你得选择----石头----剪刀-----布");
		String sdd = Input.next();
		if(stt==sdd){
			System.out.println("平局");
		}else if((stt=="石头"&&sdd=="剪刀")||(stt=="剪刀"&&sdd=="布")||(stt=="布"&&sdd=="石头"))
		{
			System.out.println("你输了");
		}
		else{
			System.out.println("你赢了");
		}
	}
}
