package Team1;

import java.util.Scanner;

public class KimMyungHwi {

	public static void main(String[] args) {

		String space = " ";
		boolean run =true;
		boolean auto=false;
		int constNum =100;
		int num=100;
		int count=100;
		int choiceNum;
		String [][] boardArray = new String[100][5];

		Scanner scanner = new Scanner(System.in);

		while(run) {
			if(auto) {
				choiceNum=1;
				auto=false;
			}else {

				System.out.println("--------------------------");
				System.out.println("1.��� | 2.����(Create) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.����");
				System.out.println("--------------------------");
				System.out.print("�޴�����> ");
				choiceNum =Integer.parseInt(scanner.nextLine());
			}
			//���
			if(choiceNum==1) {
				System.out.println("--------------------------");
				System.out.println();
				System.out.println("��ȣ" +space +  "����" + space+"����"+space+"�۾���"+ space+"��ȸ��");
				System.out.println();
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null)
						continue;
					System.out.println(boardArray[i][0]+space+boardArray[i][1]+space+boardArray[i][2]+space+boardArray[i][3]+space+boardArray[i][4]);
				}
				/*for(int i=1;i<boardArray.length;i++) {
					if(boardArray[i-1][0]==null)
						continue;
					if(Integer.parseInt(boardArray[i-1][0])>(Integer.parseInt(boardArray[i][0]))) {

						System.out.println(boardArray[i-1][0]+space+boardArray[i-1][1]+space+boardArray[i-1][2]+space+boardArray[i-1][3]+space+boardArray[i-1][4]);
					}else {
						
						System.out.println(boardArray[100-i][0]+space+boardArray[100-i][1]+space+boardArray[100-i][2]+space+boardArray[100-i][3]+space+boardArray[100-i][4]);
					}
				}*/
			}else if(choiceNum==2) {


				count--;
				for(int i=boardArray.length-1;i>=0;i--) {

					if(boardArray[i][0]==null) {
						//��ȣ

						boardArray[i][0]=""+(boardArray.length-count);
						//����
						System.out.print("���� : ");
						String title = scanner.nextLine();
						boardArray[i][1]=title;

						//����
						System.out.print("���� : ");
						String contents = scanner.nextLine();
						boardArray[i][2]=contents;

						//�۾���
						System.out.print("�۾��� : ");
						String author = scanner.nextLine();
						boardArray[i][3]=author;

						//��ȸ��
						boardArray[i][4]="0";
						auto=true;
						break;

					}else {
						continue;
					}

				}


			}


			else if(choiceNum==3) {
				System.out.print("��ȣ : ");
				String findNum = scanner.nextLine();
				int findIntNum = Integer.parseInt(findNum);
				System.out.println("���� : "+ boardArray[constNum-findIntNum][1]);
				System.out.println("���� : "+ boardArray[constNum-findIntNum][2]);
				System.out.println("�۾��� : "+ boardArray[constNum-findIntNum][3]);
				boardArray[constNum-findIntNum][4]=String.valueOf(Integer.parseInt(boardArray[constNum-findIntNum][4])+1);
				System.out.println("��ȸ�� : "+ boardArray[constNum-findIntNum][4]);
			}


			else if(choiceNum==4) {
				System.out.print("��ȣ : ");
				String findNum = scanner.nextLine();
				int findIntNum = Integer.parseInt(findNum);
				System.out.println("�������� : "+ boardArray[constNum-findIntNum][1]);
				System.out.print("�������� : ");
				String fix=scanner.nextLine();
				if(!fix.equals("")) {
					boardArray[constNum-findIntNum][1]=fix;
				}
				System.out.println("�������� : "+ boardArray[constNum-findIntNum][2]);
				System.out.println("�������� : ");
				String contentsFix = scanner.nextLine();
				if(!contentsFix.equals("")) {
					boardArray[constNum-findIntNum][2]=contentsFix;
					auto=true;
				}else {
					auto=true;
				}
			}else if(choiceNum==5) {
				System.out.print("��ȣ : ");
				String removeNum = scanner.nextLine();
				int removeIntNum = Integer.parseInt(removeNum);
				for(int i=0; i<5; i++) {
					boardArray[constNum-removeIntNum][i]=null;
				}
				auto=true;
			}

		}
	}
}



