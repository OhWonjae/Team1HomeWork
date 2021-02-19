package Team1;
import java.util.Scanner;

public class JeongYeWon {

	public static void main(String[] args) {

		boolean run = true;
		String[][] boardArray = new String[100][5];

		Scanner scanner = new Scanner(System.in);
		int menunum = 0; //목록 번호
		int count=0;
		int see=0; // 읽을 때 사용하는 번호
		int reverse = 100;

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
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]!=null) {
						System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
					}
				}
			}
			else if(menu == 2) { //목록 생성
				menunum++;
				System.out.print("제목: ");
				boardArray[reverse-menunum][1]=scanner.nextLine();
				System.out.print("내용: ");
				boardArray[reverse-menunum][2]=scanner.nextLine();
				System.out.print("글쓴이: ");
				boardArray[reverse-menunum][3]=scanner.nextLine();

				boardArray[reverse-menunum][0]=String.valueOf(count);
				count++;
				boardArray[reverse-menunum][4]="0";

				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("번호           제목                    내용                    글쓴이      조회수");
				System.out.println("---------------------------------------------------------------------------------------------------");

				for(int i=0;i<boardArray.length;i++) {
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

				int view =	Integer.parseInt(boardArray[reverse-see-1][4]);
				view ++;
				boardArray[reverse-see-1][4] = String.valueOf(view);



				System.out.println("제목: "+boardArray[reverse-see-1][1]);
				System.out.println("내용: "+boardArray[reverse-see-1][2]);
				System.out.println("글쓴이: "+boardArray[reverse-see-1][3]);		
				System.out.println("조회수: "+boardArray[reverse-see-1][4]);

			}

			else if( menu == 4) { //수정
				System.out.print("번호: ");
				String s = scanner.nextLine();
				see = Integer.parseInt(s);

				System.out.println("기존 제목: "+boardArray[reverse-see-1][1]);
				System.out.print("수정 제목: ");
				boardArray[reverse-see-1][1]=scanner.nextLine();


				System.out.println("기존 내용: "+boardArray[reverse-see-1][2]);
				System.out.print("수정 내용: ");
				boardArray[reverse-see-1][2]=scanner.nextLine();

				for(int i=0;i<boardArray.length;i++) {
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
					boardArray[reverse-see-1][j] = null;

					for(int i=0;i<boardArray.length;i++) {
						if(boardArray[i][0]!=null) {
							System.out.println(boardArray[i][0]+"            "+boardArray[i][1]+"                  "+boardArray[i][2]+"                    "+boardArray[i][3]+"       "+boardArray[i][4]);
						}
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
