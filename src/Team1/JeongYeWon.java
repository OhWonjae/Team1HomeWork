package Team1;
import java.util.Scanner;

public class JeongYeWon {

	public static void main(String[] args) {
		
		boolean run = true;
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		int menunum = 0; //��� ��ȣ
		int count=0;
		int see=0; // ���� �� ����ϴ� ��ȣ
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1.	��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5.����(Delete) | 6.����");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.print("�޴�����: ");
			
			int menu = Integer.parseInt(scanner.nextLine());
			
			if(menu == 1) { //��� ���
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("��ȣ           ����                    ����                    �۾���      ��ȸ��");
				System.out.println("---------------------------------------------------------------------------------------------------");
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]!=null) {
						System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
					}
				}
			}
			else if(menu == 2) { //��� ����
				System.out.print("����: ");
				boardArray[menunum][1]=scanner.nextLine();
				System.out.print("����: ");
				boardArray[menunum][2]=scanner.nextLine();
				System.out.print("�۾���: ");
				boardArray[menunum][3]=scanner.nextLine();
				
				boardArray[menunum][0]=String.valueOf(count);
				count++;
				boardArray[menunum][4]="0";
				
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("��ȣ           ����                    ����                    �۾���      ��ȸ��");
				System.out.println("---------------------------------------------------------------------------------------------------");
			
				for(int i=0;i<=menunum;i++) {
				
				System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
				}
				
			menunum++;
			
				
			}
			else if(menu == 3) { //�б�
				System.out.print("��ȣ: ");
				String s = scanner.nextLine();
				see = Integer.parseInt(s);
				System.out.println(boardArray[see][4]);
				
				//��ȸ�� ����
				
				int view =	Integer.parseInt(boardArray[see][4]);
				view ++;
				boardArray[see][4] = String.valueOf(view);
				
				
				
				System.out.println("����: "+boardArray[see][1]);
				System.out.println("����: "+boardArray[see][2]);
				System.out.println("�۾���: "+boardArray[see][3]);		
				System.out.println("��ȸ��: "+boardArray[see][4]);
			
			}
			
			else if( menu == 4) { //����
				System.out.print("��ȣ: ");
				String s = scanner.nextLine();
				see = Integer.parseInt(s);
				
				System.out.println("���� ����: "+boardArray[see][1]);
				System.out.print("���� ����: ");
				boardArray[see][1]=scanner.nextLine();
				
				
				System.out.println("���� ����: "+boardArray[see][2]);
				System.out.print("���� ����: ");
				boardArray[see][2]=scanner.nextLine();
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]!=null) {
						System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
					}
				}
				
			}
			else if( menu == 5) { //����
				System.out.print("��ȣ: ");
				String s = scanner.nextLine();
				see = Integer.parseInt(s);
				
				for(int j=0;j<5;j++) {
				boardArray[see][j] = null;
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]!=null) {
						System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
					}
				}
				}
			}
			else if( menu == 6) { //����
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
