package Team1;
import java.util.Scanner;
public class JeongYeWon {
	
		public static void main(String[] args) {

			boolean run = true;
			String[][] boardArray = new String[100][5];

			Scanner scanner = new Scanner(System.in);
			int menunum = 0; //목록 번호
			int count=1;
			int see=0; // 읽을 때 사용하는 번호

			while(run) {
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("1.	목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5.삭제(Delete) | 6.종료");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.print("메뉴선택: ");

				int menu = Integer.parseInt(scanner.nextLine());

				if(menu == 1) { //목록 출력
					System.out.println("---------------------------------------------------------------------------------------------------");
					System.out.println("번호           제목                    내용                    글쓴이      조회수");
					System.out.println("---------------------------------------------------------------------------------------------------");
					for(int i=boardArray.length-1;i>=0;i--) {
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}
				}
				else if(menu == 2) { //목록 생성
					menunum++;
					System.out.print("제목: ");
					boardArray[menunum][1]=scanner.nextLine();
					System.out.print("내용: ");
					boardArray[menunum][2]=scanner.nextLine();
					System.out.print("글쓴이: ");
					boardArray[menunum][3]=scanner.nextLine();

					boardArray[menunum][0]=String.valueOf(count);
					count++;
					boardArray[menunum][4]="0";

					System.out.println("---------------------------------------------------------------------------------------------------");
					System.out.println("번호           제목                    내용                    글쓴이      조회수");
					System.out.println("---------------------------------------------------------------------------------------------------");

					for(int i=boardArray.length-1;i>=0;i--)  {
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						
							}
						}
	    

				}
				else if(menu == 3) { //읽기
					System.out.print("번호: ");
					String s = scanner.nextLine();
					see = Integer.parseInt(s);

					//조회수 증가

					int view =	Integer.parseInt(boardArray[see][4]);
					view ++;
					boardArray[see][4] = String.valueOf(view);



					System.out.println("제목: "+boardArray[see][1]);
					System.out.println("내용: "+boardArray[see][2]);
					System.out.println("글쓴이: "+boardArray[see][3]);		
					System.out.println("조회수: "+boardArray[see][4]);

				}

				else if( menu == 4) { //수정
					
					System.out.print("번호: ");
					String s = scanner.nextLine();
					see = Integer.parseInt(s);
					
					String preTitle = boardArray[see][1];
					String preContent = boardArray[see][2];

					System.out.println("기존 제목: "+boardArray[see][1]);
					System.out.print("수정 제목: ");
					String title = scanner.nextLine();
					if(title.equals("")) {
						boardArray[see][1] = preTitle;
					}
					else {
						boardArray[see][1] = title;
					}

					System.out.println("기존 내용: "+boardArray[see][2]);
					System.out.print("수정 내용: ");
					String content = scanner.nextLine();
					
					if(content.equals("")) {
						boardArray[see][2] = preContent;
					}
					else {
						boardArray[see][2] = content;
					}


					for(int i=boardArray.length-1;i>=0;i--)  {
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}

				}
				else if( menu == 5) { //삭제
					System.out.print("번호: ");
					String s = scanner.nextLine();
					see = Integer.parseInt(s);

					for(int j=0;j<5;j++) {
						boardArray[see][j] = null;

					}
					for(int i=boardArray.length-1;i>=0;i--) {
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}
				}
				else if( menu == 6) { //종료
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
	}
