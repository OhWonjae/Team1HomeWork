package Team1;

import java.util.Scanner;

public class KimHyeongYun {

	public static void main(String[] args) {
		String[][] boardArray = new String[100][5];
		boolean run = true;
		int sentenceNum = 0;
		String title = null;
		String content = null;
		String writer = null;
		String readNum = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.print("메뉴선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());

			if(selectNo == 1) { // 1을 읽었을 경우		
				
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("번호         제목                      내용                        글쓴이        조회수");
					System.out.println("---------------------------------------------------------------------------------");
				for(int i=0; i < boardArray.length; i++) {
					
					System.out.println(sentenceNum + "         " + title + "                      " + content + "                        " + writer + "        " + readNum );
				}
				
				System.out.print("메뉴선택> ");
				sentenceNum = Integer.parseInt(scanner.nextLine());

			
			
			} else if (selectNo == 2) { // 2. 생성(Create)
				for(int i=0; i < boardArray[0].length-2; i++) {
					System.out.print("제목: ");
					title = scanner.nextLine();
					System.out.print("내용: ");
					content = scanner.nextLine();
					System.out.print("글쓴이: ");
					writer = scanner.nextLine();
					
					
					//scores[i] = Integer.parseInt(scanner.nextLine());
				}
				//Integer.scanner.nextInt();
			} else if (selectNo == 3) { // 3. 읽기(Read)
				for(int i=0; i < boardArray.length; i++) {
					System.out.println("scores[" + i + "]> " + boardArray[i]);	}
				//Integer.scanner.nextInt();
			} else if (selectNo == 4) { // 4. 수정(Update)
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i < boardArray.length; i++) {
					//sum += scores[i];
					//if(max < scores[i]) {
						//max = scores[i];
					//}
				}
				//avg = (double) sum / boardArray.length;
				//System.out.println("최고 점수:" + max);
				
				//System.out.println("평균 점수:" + avg);
				//Integer.scanner.nextInt();
				
			} else if (selectNo == 5) { // 5. 삭제(Delete)
				
				
			} else if (selectNo == 6) { // 6. 종료
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}
