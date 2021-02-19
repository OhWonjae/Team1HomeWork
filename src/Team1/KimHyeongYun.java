package Team1;

import java.util.Scanner;

import com.sun.jdi.Value;

public class KimHyeongYun {

	public static void main(String[] args) {
		boolean run = true;
		int sentenceNum = 1;
		int readChoiceNum = 0;
	
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {

			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("메뉴선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());
//			
//			if(scanner.nextLine() == "") {
//				continue;
//			}
			
			if(selectNo == 1) { // 1을 읽었을 경우		

				System.out.println("-----------------------------------------------");
				System.out.println("번호       제목       내용       글쓴이       조회수 ");
				System.out.println("-----------------------------------------------");


				for(int i = 100-sentenceNum + 1 ; i < 100 ; i++) {

					System.out.println(" " + boardArray[i][0] + "       " + boardArray[i][1] + "       " + boardArray[i][2] + "       " + boardArray[i][3] + "           " +  boardArray[i][4] );
				}

			} else if (selectNo == 2) { // 2. 생성(Create)
				
				boardArray[100-sentenceNum][0] = "" + sentenceNum;
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

				readChoiceNum = Integer.parseInt(scanner.nextLine());

				
				int views = Integer.parseInt(boardArray[100-readChoiceNum][4]);
				views++;
				boardArray[100-readChoiceNum][4] = ""+views;
					
				System.out.println("번호: "  + boardArray[100-readChoiceNum][0]);	
				System.out.println("제목: "  + boardArray[100-readChoiceNum][1]);
				System.out.println("내용: "  + boardArray[100-readChoiceNum][2]);
				System.out.println("글쓴이: "  + boardArray[100-readChoiceNum][3]);
				System.out.println("조회수: "  + boardArray[100-readChoiceNum][4]);
				
				
				
				// System.out.println("조회수: " + );

				
			} else if (selectNo == 4) { // 4. 수정(Update)
				System.out.print("번호선택> ");

				readChoiceNum = Integer.parseInt(scanner.nextLine());

				System.out.println("기존제목: " + boardArray[100-readChoiceNum][1]);
				String preTitle = boardArray[100-readChoiceNum][1];
				
				System.out.println("수정제목: "); 
				String newTitle = scanner.nextLine();
				
				if(newTitle.equals("")) {
					boardArray[100-readChoiceNum][1] = preTitle;
				} else {
					boardArray[100-readChoiceNum][1] = newTitle;
				}
				
				
				
				System.out.println("기존내용: " + boardArray[100-readChoiceNum][2]);
				String preContent = boardArray[100-readChoiceNum][2];

				System.out.println("수정내용: "); 
				String newContent= scanner.nextLine();

				if(newContent.equals("")) {
					boardArray[100-readChoiceNum][2] = preContent;
				} else {
					boardArray[100-readChoiceNum][2] = newContent;
				}

			} else if (selectNo == 5) { // 5. 삭제(Delete)
				System.out.print("번호선택> ");
				readChoiceNum = Integer.parseInt(scanner.nextLine());
				
				boardArray[100-readChoiceNum][0] = null;	
				boardArray[100-readChoiceNum][1] = null;
				boardArray[100-readChoiceNum][2] = null;
				boardArray[100-readChoiceNum][3] = null;
				boardArray[100-readChoiceNum][4] = null;
				

			} else if (selectNo == 6) { // 6. 종료
				run = false;
			}

		}
		
		System.out.println("프로그램 종료");
//		int[] scores1 = {90, 85, 95};
//		int[] scores2 = null;
//		int[] scores2 = null;
//		add(scores2); // call by reference
//		add(scores1);
//		add(new int[] {100, 200, 300}); // 이거 왜 안되는 이유? 그래서 new int[] 이거를 넣어줘야함.
//	}
//	
//	// method 선언
//	public static void add(int[] arr) { // add method라 부름
//		System.out.println("값:" + Arrays.toString(arr)); // Arrays.toString(arr)대신 arr을 출력하면 번지가 나옴. 완전 이상한 값이 나옴.
//	}
	}

}
