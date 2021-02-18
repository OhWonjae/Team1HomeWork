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
			System.out.println("1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("메뉴선택> ");



			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) { // 1을 읽었을 경우		

				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("번호         제목                내용              글쓴이            조회수");
				System.out.println("----------------------------------------------------------------------------------");


				for(int i = 100-sentenceNum + 1 ; i < 100 ; i++) {

					System.out.println(" " + boardArray[i][0] + "         " + boardArray[i][1] + "                   " + boardArray[i][2] + "                     " + boardArray[i][3] + "        " +  boardArray[i][4] );
				}

			} else if (selectNo == 2) { // 2. 생성(Create)
				
				
				boardArray[100-sentenceNum][0] = "" + (sentenceNum);
				System.out.print("제목: ");
				boardArray[100-sentenceNum][1] = scanner.nextLine();
				System.out.print("내용: ");
				boardArray[100-sentenceNum][2] = scanner.nextLine();
				System.out.print("글쓴이: ");
				boardArray[100-sentenceNum][3] = scanner.nextLine();

				boardArray[100-sentenceNum][4] = "" + 0;

				sentenceNum++;




			} else if (selectNo == 3) { // 3. 읽기(Read)

				System.out.print("번호선택> ");

				choiceNum = Integer.parseInt(scanner.nextLine());

				System.out.println("번호: "  + boardArray[100-choiceNum][0]);	
				System.out.println("제목: "  + boardArray[100-choiceNum][1]);
				System.out.println("내용: "  + boardArray[100-choiceNum][2]);
				System.out.println("글쓴이: "  + boardArray[100-choiceNum][3]);

				int a = 1;
				
				// System.out.println("조회수: " + );

				a++;

				//Integer.scanner.nextInt();

			} else if (selectNo == 4) { // 4. 수정(Update)
				System.out.print("번호선택> ");

				choiceNum = Integer.parseInt(scanner.nextLine());

				System.out.println("기존제목: " + boardArray[sentenceNum][1]);
				String pretitle = boardArray[sentenceNum][1];

				System.out.println("수정제목: "); 
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
				System.out.println("기존제목: " + boardArray[sentenceNum][2]);
				String precontent = boardArray[sentenceNum][2];

				System.out.println("수정제목: "); 
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

			} else if (selectNo == 5) { // 5. 삭제(Delete)
				System.out.print("번호선택> ");
				selectNo = Integer.parseInt(scanner.nextLine());
				for(int i=selectNo; i < selectNo + 1; i++) {
					// boardArray[selectNum][4] = "" ;
					boardArray[i][0] = null;	
					boardArray[i][1] = null;
					boardArray[i][2] = null;
					boardArray[i][3] = null;
					boardArray[i][4] = null;
				}

			} else if (selectNo == 6) { // 6. 종료
				run = false;
			}

		}

		System.out.println("프로그램 종료");
	}

}
