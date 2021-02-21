package Team1;

import java.util.Scanner;

public class KimMyungHwi {

	public static void main(String[] args) {

		String space = " ";
		boolean run =true;
		boolean auto=false;
		int test=100;
		int count=100;
		int choiceNum;
		//boolean flag=false;
		//int removeCount=0;
		int saveRemoveNum=0;
		String [][] boardArray = new String[100][5];
		//int [] removeArray = new int[100];

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
				//int num=boardArray.length-count;
				System.out.println("--------------------------");
				System.out.println();
				System.out.println("번호" +space +  "제목" + space+"내용"+space+"글쓴이"+ space+"조회수");
				System.out.println();
				for(int i=boardArray.length-1;i>=0;i--) {
					if(boardArray[i][0]==null)
						continue;
					System.out.println(boardArray[i][0]+space+boardArray[i][1]+space+boardArray[i][2]+space+boardArray[i][3]+space+boardArray[i][4]);
				}
				/*for(int i=100-test-1;i>=0;i--) {
					if(boardArray[i][0]==null||saveRemoveNum==num) {
						for(int j =0;j<removeCount;j++) {
							if(removeArray[j]==num) {
								num--;

							}			

						}
						continue;

					}else if(boardArray[i][0].equals(String.valueOf(num))) {
						System.out.println(boardArray[i][0]+space+boardArray[i][1]+space+boardArray[i][2]+space+boardArray[i][3]+space+boardArray[i][4]);
						num--;
						i=100-test;
					}else if(num!=0&&i==0){
						i=100-test;
						num--;
					}

				}*/


			}else if(choiceNum==2) {

				count--;
				/*test--;
				if(flag) {
					test++;
				}*/

				for(int i=0;i<=boardArray.length;i++) {

					if(boardArray[i][0]==null) {
						//번호

						boardArray[i][0]=""+(boardArray.length-count);
						//제목
						System.out.print("제목 : ");
						String title = scanner.nextLine();
						boardArray[i][1]=title;

						//내용
						System.out.print("내용 : ");
						String contents = scanner.nextLine();
						boardArray[i][2]=contents;

						//글쓴이
						System.out.print("글쓴이 : ");
						String author = scanner.nextLine();
						boardArray[i][3]=author;

						//조회수
						boardArray[i][4]="0";
						auto=true;
						break;

					}else {
						continue;
					}

				}

				//flag=false;
			}


			else if(choiceNum==3) {
				System.out.print("번호 : ");
				String findNum = scanner.nextLine();
				int findIntNum = Integer.parseInt(findNum);
				int readIndex=-1;
				for(int i=0; i<boardArray.length;i++) {
					if(boardArray[i][0]!=null&&boardArray[i][0].equals(String.valueOf(findIntNum))) {
						readIndex=i;
					}
				}
				if(readIndex==-1) {
					System.out.println("없는 게시판 번호입니다.");
				}else {
					System.out.println("제목 : "+ boardArray[readIndex][1]);
					System.out.println("내용 : "+ boardArray[readIndex][2]);
					System.out.println("글쓴이 : "+ boardArray[readIndex][3]);
					boardArray[readIndex][4]=String.valueOf(Integer.parseInt(boardArray[readIndex][4])+1);
					System.out.println("조회수 : "+ boardArray[readIndex][4]);
				}
			}


			else if(choiceNum==4) {
				System.out.print("번호 : ");
				String findNum = scanner.nextLine();
				int findIntNum = Integer.parseInt(findNum);
				int changeIndex = -1;
				for(int i=0; i<boardArray.length;i++) {
					if(boardArray[i][0]!=null&&boardArray[i][0].equals(String.valueOf(findIntNum))) {
						changeIndex=i;
					}
				}
				if(changeIndex==-1) {
					System.out.println("없는 게시판 번호입니다.");
				}else {
					System.out.println("기존제목 : "+ boardArray[changeIndex][1]);
					System.out.print("수정제목 : ");
					String fix=scanner.nextLine();
					if(!fix.equals("")) {
						boardArray[changeIndex][1]=fix;
					}
					System.out.println("기존내용 : "+ boardArray[changeIndex][2]);
					System.out.println("수정내용 : ");
					String contentsFix = scanner.nextLine();
					if(!contentsFix.equals("")) {
						boardArray[changeIndex][2]=contentsFix;
						auto=true;
					}else {
						auto=true;
					}
				}
			}

			else if(choiceNum==5) {
				System.out.print("번호 : ");
				String removeNum = scanner.nextLine();
				int removeIntNum = Integer.parseInt(removeNum);
				saveRemoveNum=removeIntNum;
				//removeArray[removeCount]=saveRemoveNum;
				//removeCount++;

				int removeIndex=-1;
				for(int i=0; i<boardArray.length;i++) {
					if(boardArray[i][0]!=null&&boardArray[i][0].equals(String.valueOf(removeIntNum))) {
						removeIndex=i;
					}else {
						
					}
				}
				if(removeIndex==-1) {
					System.out.println("없는 게시판 번호입니다.");
				}else {

					for(int i=0; i<5; i++) {
						boardArray[removeIndex][i]=null;
					}
					auto=true;
					//flag=true;
				}
			}
			else if(choiceNum ==6) {
				System.out.println("종료합니다");
				run=false;
			}

		}
	}
}
