package Team1;
import java.util.Scanner;
public class JeongYeWon {

	public static void main(String[] args) {

		boolean run = true;
		String[][] boardArray = new String[100][5]; 

		Scanner scanner = new Scanner(System.in);
		int count=1; // 목록에 번호를 카운트 해주기 위한 변수
		

		
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

			else if(menu == 3) {//읽기
				System.out.print("번호: ");
				String s = scanner.nextLine(); //읽고자 하는 번호 입력받기

				int readNum = -1; 
	
				for(int x=0; x<boardArray.length;x++) { //배열을 한바퀴 돌면서

					if(boardArray[x][0]!=null&&boardArray[x][0].equals(s)) { //null값일 때 제외 (예외처리) + 내가 입력한 번호와 목록이 일치하면
						readNum =x;	//입력한 번호와 일치한 인덱스 넘버를 readNum에 넣어주기
					}
				}
				


				if(readNum == -1){ // null값인 경우엔 readNum=-1
					System.out.println("없는 번호입니다.");
				} 

				//조회수 증가
				else {
					int view =	Integer.parseInt(boardArray[readNum][4]);	//내가 읽고싶은 목록번호가 del에 저장됐으니 이를 이용해서 조회수 증가
					view ++;
					boardArray[readNum][4] = String.valueOf(view);



					System.out.println("제목: "+boardArray[readNum][1]);
					System.out.println("내용: "+boardArray[readNum][2]);
					System.out.println("글쓴이: "+boardArray[readNum][3]);		
					System.out.println("조회수: "+boardArray[readNum][4]);
				}

			}


			else if( menu == 4) { //수정

				System.out.print("번호: ");
				String s = scanner.nextLine(); //번호를 입력받음
				int fixNum = -1;

				for(int x=0; x<boardArray.length;x++) { 
					if(boardArray[x][0]!=null&&boardArray[x][0].equals(s)){
						fixNum = x;
					}
				}

				if(fixNum == -1) { // 입력한 번호가 없는 경우 = null값이 들어있는 경우
					System.out.println("없는 번호입니다.");
				}

				else {		
					String preTitle = boardArray[fixNum][1]; // 수정하기 전 제목 preTitle이라는 변수에 넣어둠.
					String preContent = boardArray[fixNum][2]; // 수정하기 전 내용 preConten라는 변수에 넣어둠.

					System.out.println("기존 제목: "+boardArray[fixNum][1]);
					System.out.print("수정 제목: ");
					String title = scanner.nextLine();
					if(title.equals("")) { //만약에 엔터값 들어오면
						boardArray[fixNum][1] = preTitle; //원래 제목을 그대로 집어넣음
					}
					else {
						boardArray[fixNum][1] = title; //엔터값이 아니라면 새로 입력받은 값을 배열에 넣음
					}

					System.out.println("기존 내용: "+boardArray[fixNum][2]);
					System.out.print("수정 내용: ");
					String content = scanner.nextLine();

					if(content.equals("")) {
						boardArray[fixNum][2] = preContent;
					}
					else {
						boardArray[fixNum][2] = content;
					}


					for(int i=boardArray.length-1;i>=0;i--)  {
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}
				}

			}



			else if( menu == 5) { //삭제

				System.out.print("번호: ");
				String s = scanner.nextLine();
				int deleteNum = -1;

				for(int x=0; x<boardArray.length;x++) { 
					if(boardArray[x][0]!=null&&boardArray[x][0].equals(s)){
						deleteNum =x;
					}
				}

				if(deleteNum == -1) {
					System.out.println("없는 번호입니다.");
				}

				else {
					for(int j=0;j<5;j++) {

						boardArray[deleteNum][j] = null; // 입력받은 번호의 열을 for문을 통해 다 돌면서 null값 넣어줌.
					}



					for(int i=boardArray.length-1;i>=0;i--) { //출력문
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
					}

				}	

			}


			else if(menu == 6){ //종료
				run = false; // while문 빠져나오게 boolean변수를 false로 바꿈.
			}
			else {
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}
}

