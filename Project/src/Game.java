import java.util.Scanner;
import java.util.Random;
public class Game {
	
	public static void main(String[] args) {
		int a, b, d, e;
		int mon1 = 50;
		int [] user = new int [2];
		int [] com = new int [2];
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		while(mon1>0 | mon1>100) {
			System.out.println("게임을 시작합니다.");
			user[0] = ran.nextInt(11);
			user[1] = ran.nextInt(11);
			com[0] = ran.nextInt(11);
			com[0] = ran.nextInt(11);
			a = user[0]+user[1];
			b = com[0] + com[1];
			System.out.print(user[0]+" ");
			System.out.println(user[1]);
			if (user[0]==user[1]) {
				System.out.println(user[0]+"페어입니다.");
				d = 1;
			}
			else {
				System.out.println("두 숫자의 합은"+a+"입니다.");
				d = 0;
				}
			if (com[0]==com[1]) {
				e = 1;
			}
			else {
				e = 0;
				}
			System.out.println("베팅을 시작합니다.(최소 베팅 금액은 2원입니다.)");
			System.out.println("현재 보유하고 있는 금액은"+mon1+"원입니다");
			int c = s.nextInt();
			while (c>mon1 | c<2) {
				System.out.println("다시베팅해주십시오");
				int f = s.nextInt();
				c = f;
			}
			System.out.println(c + "원 만큼 베팅을 하셨습니다");
			System.out.println("상대방의 패를 공개합니다.");
			System.out.print(com[0]+" ");
			System.out.println(com[1]);
			if (d==1 & e==1) {
				if (a>b) {
					mon1=mon1+c;
					System.out.println("게임에서 이겼습니다.");
				}
				else if (a==b)
					System.out.println("비겼습니다.");
				else 
					mon1=mon1-c;
					System.out.println("게임에서 졌습니다.");
			}
			else if (d==1 & e==0) {
				System.out.println("게임에서 이겼습니다.");
				mon1=mon1+c;
			}
			else if (d==0 & e==1) {
				System.out.println("게임에서 졌습니다.");
				mon1=mon1-c;
			}
			else {
				if (a>b) {
					System.out.println("게임에서 이겼습니다.");
					mon1=mon1+c;
				}
				else if (a==b) {
					System.out.println("비겼습니다.");
				}
				else {
					System.out.println("게임에서 졌습니다.");
					mon1=mon1-c;
				}
			}
			
		}
		if (mon1==0) {
			System.out.println("패배하였습니다. 수고하셨습니다.");
		}
		else {
			System.out.println("승리하였습니다. 수고하셨습니다.");
		}
		s.close();
	}
}
