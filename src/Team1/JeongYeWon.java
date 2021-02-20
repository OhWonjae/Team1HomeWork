package Team1;
import java.util.Scanner;
public class JeongYeWon {
	
		public static void main(String[] args) {

			boolean run = true;
			String[][] boardArray = new String[100][5]; 

			Scanner scanner = new Scanner(System.in);
			int count=1; // 목록에 번호를 카운트 해주기 위한 변수 
			int see=0; // 사용자가 입력하는 번호를 읽을 때 사용 할 변수
			
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
					for(int i=boardArray.length-1;i>=0;i--) { // 배열을 내림차순으로 출력하기 위해서 맨 마지막 배열부터 출력
						if(boardArray[i][0]!=null) { //null값이 들어가 있는 곳은 제외하기 위한 if문
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}
				}
				else if(menu == 2) { //목록 생성
					
					for(int j=0; j<boardArray.length;j++) { // 삭제했을 경우에 null이 생긴 자리에 집어넣기 위해서 전체 배열을 돌면서 
						if(boardArray[j][0]==null) { // null이 있는 곳을 찾아서 입력된 값을 넣음.
							
							System.out.print("제목: ");
							boardArray[j][1]=scanner.nextLine();
							System.out.print("내용: ");
							boardArray[j][2]=scanner.nextLine();
							System.out.print("글쓴이: ");
							boardArray[j][3]=scanner.nextLine();
		
							boardArray[j][0]=String.valueOf(count); //번호를 넣어주기 위한 count를 넣음.
							count++; // 다음 번호에 넣어줄 count 증가시킴
							boardArray[j][4]="0"; // 기본 조회수 = 0
				
							System.out.println("---------------------------------------------------------------------------------------------------");
							System.out.println("번호           제목                    내용                    글쓴이      조회수");
							System.out.println("---------------------------------------------------------------------------------------------------");

							for(int i=boardArray.length-1;i>=0;i--)  {
								if(boardArray[i][0] != null) {
									System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
								}
							}
							
							break; // 값을 집어 넣었으면 for문 빠져나옴.
						}
					}
				
				}
				
				else if(menu == 3) { //읽기
					System.out.print("번호: ");
					String s = scanner.nextLine();
					see = Integer.parseInt(s);

					for(int x=0; x<boardArray.length;x++) {
						if(boardArray[x][0]!=null){
						int del = Integer.parseInt(boardArray[x][0]);
						if(del == see) {
							see = x;
							break;
							}
						}
					}
					
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
					String s = scanner.nextLine(); //번호를 입력받음
					see = Integer.parseInt(s); //String으로 입력받았기에 int값으로 변경
					
					for(int x=0; x<boardArray.length;x++) {
						if(boardArray[x][0]!=null){
						int del = Integer.parseInt(boardArray[x][0]);
						if(del == see) {
							see = x;
							break;
								}
							}
						}
					
					String preTitle = boardArray[see][1]; // 수정하기 전 제목 preTitle이라는 변수에 넣어둠.
					String preContent = boardArray[see][2]; // 수정하기 전 내용 preConten라는 변수에 넣어둠.

					System.out.println("기존 제목: "+boardArray[see][1]);
					System.out.print("수정 제목: ");
					String title = scanner.nextLine();
					if(title.equals("")) { //만약에 엔터값 들어오면
						boardArray[see][1] = preTitle; //원래 제목을 그대로 집어넣음
					}
					else {
						boardArray[see][1] = title; //엔터값이 아니라면 새로 입력받은 값을 배열에 넣음
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

					for(int x=0; x<boardArray.length;x++) {
						
						if(boardArray[x][0]!=null){
						
						int del = Integer.parseInt(boardArray[x][0]);
						
						if(del == see) {
							see = x;
							break;
							}
						}
		
					}
					for(int j=0;j<5;j++) {
						
						boardArray[see][j] = null; // 입력받은 번호의 열을 for문을 통해 다 돌면서 null값 넣어줌.
					}
		
						
					
					for(int i=boardArray.length-1;i>=0;i--) { //출력문
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}
					see = 0;
				}
				else if(menu == 6){ //종료
					run = false; // while문 빠져나오게 boolean변수를 false로 바꿈.
				}
			}
			System.out.println("프로그램 종료");
		}
	}
