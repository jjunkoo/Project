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
			System.out.println("������ �����մϴ�.");
			user[0] = ran.nextInt(11);
			user[1] = ran.nextInt(11);
			com[0] = ran.nextInt(11);
			com[0] = ran.nextInt(11);
			a = user[0]+user[1];
			b = com[0] + com[1];
			System.out.print(user[0]+" ");
			System.out.println(user[1]);
			if (user[0]==user[1]) {
				System.out.println(user[0]+"����Դϴ�.");
				d = 1;
			}
			else {
				System.out.println("�� ������ ����"+a+"�Դϴ�.");
				d = 0;
				}
			if (com[0]==com[1]) {
				e = 1;
			}
			else {
				e = 0;
				}
			System.out.println("������ �����մϴ�.(�ּ� ���� �ݾ��� 2���Դϴ�.)");
			System.out.println("���� �����ϰ� �ִ� �ݾ���"+mon1+"���Դϴ�");
			int c = s.nextInt();
			while (c>mon1 | c<2) {
				System.out.println("�ٽú������ֽʽÿ�");
				int f = s.nextInt();
				c = f;
			}
			System.out.println(c + "�� ��ŭ ������ �ϼ̽��ϴ�");
			System.out.println("������ �и� �����մϴ�.");
			System.out.print(com[0]+" ");
			System.out.println(com[1]);
			if (d==1 & e==1) {
				if (a>b) {
					mon1=mon1+c;
					System.out.println("���ӿ��� �̰���ϴ�.");
				}
				else if (a==b)
					System.out.println("�����ϴ�.");
				else 
					mon1=mon1-c;
					System.out.println("���ӿ��� �����ϴ�.");
			}
			else if (d==1 & e==0) {
				System.out.println("���ӿ��� �̰���ϴ�.");
				mon1=mon1+c;
			}
			else if (d==0 & e==1) {
				System.out.println("���ӿ��� �����ϴ�.");
				mon1=mon1-c;
			}
			else {
				if (a>b) {
					System.out.println("���ӿ��� �̰���ϴ�.");
					mon1=mon1+c;
				}
				else if (a==b) {
					System.out.println("�����ϴ�.");
				}
				else {
					System.out.println("���ӿ��� �����ϴ�.");
					mon1=mon1-c;
				}
			}
			
		}
		if (mon1==0) {
			System.out.println("�й��Ͽ����ϴ�. �����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("�¸��Ͽ����ϴ�. �����ϼ̽��ϴ�.");
		}
		s.close();
	}
}
