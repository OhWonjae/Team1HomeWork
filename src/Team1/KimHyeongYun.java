package Team1;

import java.util.Scanner;

import com.sun.jdi.Value;

public class KimHyeongYun {

	public static void main(String[] args) {
		boolean run = true;
		int sentenceNum = 1;
		int choiceNum = 0;
		

		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		String s = null;

		while(run) {

			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5.����(Delete) | 6.����");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("�޴�����> ");



			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) { // 1�� �о��� ���		

				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("��ȣ         ����                ����              �۾���            ��ȸ��");
				System.out.println("----------------------------------------------------------------------------------");


				for(int i = 100-sentenceNum + 1 ; i < 100 ; i++) {

					System.out.println(" " + boardArray[i][0] + "         " + boardArray[i][1] + "                   " + boardArray[i][2] + "                     " + boardArray[i][3] + "        " +  boardArray[i][4] );
				}

			} else if (selectNo == 2) { // 2. ����(Create)
				
				
				boardArray[100-sentenceNum][0] = "" + (sentenceNum);
				System.out.print("����: ");
				boardArray[100-sentenceNum][1] = scanner.nextLine();
				System.out.print("����: ");
				boardArray[100-sentenceNum][2] = scanner.nextLine();
				System.out.print("�۾���: ");
				boardArray[100-sentenceNum][3] = scanner.nextLine();

				boardArray[100-sentenceNum][4] = "" + 0;

				sentenceNum++;




			} else if (selectNo == 3) { // 3. �б�(Read)

				System.out.print("��ȣ����> ");

				choiceNum = Integer.parseInt(scanner.nextLine());

				System.out.println("��ȣ: "  + boardArray[100-choiceNum][0]);	
				System.out.println("����: "  + boardArray[100-choiceNum][1]);
				System.out.println("����: "  + boardArray[100-choiceNum][2]);
				System.out.println("�۾���: "  + boardArray[100-choiceNum][3]);

				int a = 1;
				
				// System.out.println("��ȸ��: " + );

				a++;

				//Integer.scanner.nextInt();

			} else if (selectNo == 4) { // 4. ����(Update)
				System.out.print("��ȣ����> ");

				choiceNum = Integer.parseInt(scanner.nextLine());

				System.out.println("��������: " + boardArray[sentenceNum][1]);
				String pretitle = boardArray[sentenceNum][1];

				System.out.println("��������: "); 
				s = scanner.nextLine();
				boardArray[sentenceNum][1] = scanner.nextLine();

				if(s.equals(""))
				{
					boardArray[sentenceNum][1] = pretitle;
				}
				else
				{
					boardArray[sentenceNum][1] = s;

				}
				System.out.println("��������: " + boardArray[sentenceNum][2]);
				String precontent = boardArray[sentenceNum][2];

				System.out.println("��������: "); 
				s = scanner.nextLine();
				boardArray[sentenceNum][2] = scanner.nextLine();

				if(s.equals(""))
				{
					boardArray[sentenceNum][2] = precontent;
				}
				else
				{
					boardArray[sentenceNum][2] = s;
				}

			} else if (selectNo == 5) { // 5. ����(Delete)
				System.out.print("��ȣ����> ");
				selectNo = Integer.parseInt(scanner.nextLine());
				for(int i=selectNo; i < selectNo + 1; i++) {
					// boardArray[selectNum][4] = "" ;
					boardArray[i][0] = null;	
					boardArray[i][1] = null;
					boardArray[i][2] = null;
					boardArray[i][3] = null;
					boardArray[i][4] = null;
				}

			} else if (selectNo == 6) { // 6. ����
				run = false;
			}

		}

		System.out.println("���α׷� ����");
	}

}
