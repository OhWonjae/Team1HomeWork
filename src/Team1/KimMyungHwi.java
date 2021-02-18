package Team1;

import java.util.Scanner;

public class KimMyungHwi {

	public static void main(String[] args) {

		String space = " ";
		boolean run =true;
		boolean auto=false;
		int constNum =100;
		int num=100;
		int count=0;
		int choiceNum;
		String [][] boardArray = new String[100][5];

		Scanner scanner = new Scanner(System.in);

		while(run) {
			if(auto) {
				choiceNum=1;
				auto=false;
			}else {

				System.out.println("--------------------------");
				System.out.println("1.목록 | 2.생성(Create) | 3.읽기(Read) | 4.수정(Update) | 5.삭제(Delete) | 6.종료");
				System.out.println("--------------------------");
				System.out.print("메뉴선택> ");
				choiceNum =Integer.parseInt(scanner.nextLine());
			}
			//목록
			if(choiceNum==1) {
				System.out.println("--------------------------");
				System.out.println();
				System.out.println("번호" +space +  "제목" + space+"내용"+space+"글쓴이"+ space+"조회수");
				System.out.println();
				for(int i=0;i<boardArray.length;i++) {
					System.out.println(boardArray[i][0]+space+boardArray[i][1]+space+boardArray[i][2]+space+boardArray[i][3]+space+boardArray[i][4]);
				}
			}else if(choiceNum==2) {
				//번호
				num--;
				boardArray[num][0]=""+(boardArray.length-num);
				//제목
				System.out.print("제목 : ");
				String title = scanner.nextLine();
				boardArray[num][1]=title;

				//내용
				System.out.print("내용 : ");
				String contents = scanner.nextLine();
				boardArray[num][2]=contents;

				//글쓴이
				System.out.print("글쓴이 : ");
				String author = scanner.nextLine();
				boardArray[num][3]=author;

				//조회수
				boardArray[num][4]=""+count;

				auto=true;
			}else if(choiceNum==3) {
				count++;
				System.out.print("번호 : ");
				String findNum = scanner.nextLine();
				int findIntNum = Integer.parseInt(findNum);
				System.out.println("제목 : "+ boardArray[constNum-findIntNum][1]);
				System.out.println("내용 : "+ boardArray[constNum-findIntNum][2]);
				System.out.println("글쓴이 : "+ boardArray[constNum-findIntNum][3]);
				boardArray[num][4]=""+count;
				System.out.println("조회수 : "+ boardArray[constNum-findIntNum][4]);
			}else if(choiceNum==4) {
				System.out.print("번호 : ");
				String findNum = scanner.nextLine();
				int findIntNum = Integer.parseInt(findNum);
				System.out.println("기존제목 : "+ boardArray[constNum-findIntNum][1]);
				System.out.print("수정제목 : ");
				String fix=scanner.nextLine();
				if(!fix.equals("")) {
					boardArray[constNum-findIntNum][1]=fix;
				}
				System.out.println("기존내용 : "+ boardArray[constNum-findIntNum][2]);
				System.out.println("수정내용 : ");
				String contentsFix = scanner.nextLine();
				if(!contentsFix.equals("")) {
					boardArray[constNum-findIntNum][2]=contentsFix;
					auto=true;
				}else {
					auto=true;
				}
				
			}
		}
	}
}


