package Team1;

import java.util.Scanner;

import com.sun.jdi.Value;

public class KimHyeongYun {

	public static void main(String[] args) {
		boolean run = true;
		int sentenceNum = 1;
		int readChoiceNum = 0;
		int count = 0;
		int blankIndex = 0;
	
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {

			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5.����(Delete) | 6.����");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("�޴�����> ");

			int selectNo = Integer.parseInt(scanner.nextLine());
//			
//			if(scanner.nextLine() == "") {
//				continue;
//			}
			
			if(selectNo == 1) { // 1�� �о��� ���		

				System.out.println("-----------------------------------------------");
				System.out.println("��ȣ       ����       ����       �۾���       ��ȸ�� ");
				System.out.println("-----------------------------------------------");


				for(int i = 100-sentenceNum + 1 ; i < 100 ; i++) {

					System.out.println(" " + boardArray[i][0] + "       " + boardArray[i][1] + "       " + boardArray[i][2] + "       " + boardArray[i][3] + "           " +  boardArray[i][4] );
				}

			} else if (selectNo == 2) { // 2. ����(Create)
				
				if(count >= 100) {
					System.out.println("�Խ����� �� á���ϴ�. �Ϻ� �Խù��� ������ �ּ���.");
				} else {
					for(int i=99; i>=0; i--){
						if(boardArray[i][0] == null)
						{
							blankIndex = i;
							break;
						}
					}
		
					
					boardArray[100-sentenceNum][0] = "" + sentenceNum;
					System.out.print("����: ");
					boardArray[100-sentenceNum][1] = scanner.nextLine();
					System.out.print("����: ");
					boardArray[100-sentenceNum][2] = scanner.nextLine();
					System.out.print("�۾���: ");
					boardArray[100-sentenceNum][3] = scanner.nextLine();
		
					boardArray[100-sentenceNum][4] = "" + 0;
		
					sentenceNum++;} 
				
				
					System.out.println();
					System.out.println("-----------------------------------------------");
					System.out.println("��ȣ       ����       ����       �۾���       ��ȸ�� ");
					System.out.println("-----------------------------------------------");
					
					for(int i = 100-sentenceNum + 1 ; i < 100 ; i++) {
	
						System.out.println(" " + boardArray[i][0] + "       " + boardArray[i][1] + "       " + boardArray[i][2] + "       " + boardArray[i][3] + "           " +  boardArray[i][4] );
					}
					
					System.out.println();
				
			}else if (selectNo == 3) { // 3. �б�(Read)

				System.out.print("��ȣ����> ");

				readChoiceNum = Integer.parseInt(scanner.nextLine());

				
				int views = Integer.parseInt(boardArray[100-readChoiceNum][4]);
				views++;
				boardArray[100-readChoiceNum][4] = "" + views;
					
				System.out.println("��ȣ: "  + boardArray[100-readChoiceNum][0]);	
				System.out.println("����: "  + boardArray[100-readChoiceNum][1]);
				System.out.println("����: "  + boardArray[100-readChoiceNum][2]);
				System.out.println("�۾���: "  + boardArray[100-readChoiceNum][3]);
				System.out.println("��ȸ��: "  + boardArray[100-readChoiceNum][4]);

				
			} else if (selectNo == 4) { // 4. ����(Update)
				System.out.print("��ȣ����> ");

				int choiceNum = Integer.parseInt(scanner.nextLine());

				System.out.println("��������: " + boardArray[100-choiceNum][1]);
				String preTitle = boardArray[100-choiceNum][1];
				
				System.out.print("��������: "); 
				String newTitle = scanner.nextLine();
				
				if(newTitle.equals("")) {
					boardArray[100-choiceNum][1] = preTitle;
				} else {
					boardArray[100-choiceNum][1] = newTitle;
				}
				
				
				
				System.out.println("��������: " + boardArray[100-choiceNum][2]);
				String preContent = boardArray[100-choiceNum][2];

				System.out.print("��������: "); 
				String newContent= scanner.nextLine();

				if(newContent.equals("")) {
					boardArray[100-choiceNum][2] = preContent;
				} else {
					boardArray[100-choiceNum][2] = newContent;
				}
				
				
				System.out.println();
				System.out.println("-----------------------------------------------");
				System.out.println("��ȣ       ����       ����       �۾���       ��ȸ�� ");
				System.out.println("-----------------------------------------------");
				
				for(int i = 100-sentenceNum + 1 ; i < 100 ; i++) {

					System.out.println(" " + boardArray[i][0] + "       " + boardArray[i][1] + "       " + boardArray[i][2] + "       " + boardArray[i][3] + "           " +  boardArray[i][4] );
				}
				
				System.out.println();
				
				

			} else if (selectNo == 5) { // 5. ����(Delete)
				System.out.print("��ȣ����> ");
				int choiceNum = Integer.parseInt(scanner.nextLine());
				
				boardArray[100-choiceNum][0] = null;	
				boardArray[100-choiceNum][1] = null;
				boardArray[100-choiceNum][2] = null;
				boardArray[100-choiceNum][3] = null;
				boardArray[100-choiceNum][4] = null;
				
				
				System.out.println();
				System.out.println("-----------------------------------------------");
				System.out.println("��ȣ       ����       ����       �۾���       ��ȸ�� ");
				System.out.println("-----------------------------------------------");
				
				for(int i = 100-sentenceNum + 1 ; i < 100 ; i++) {

					System.out.println(" " + boardArray[i][0] + "       " + boardArray[i][1] + "       " + boardArray[i][2] + "       " + boardArray[i][3] + "           " +  boardArray[i][4] );
				}
				
				System.out.println();
				
				
			} else if (selectNo == 6) { // 6. ����
				run = false;
			}

		}
		
		System.out.println("���α׷� ����");
//		
	}

}
