package Team1;
import java.util.Scanner;
public class OhWonjae {

	public static void main(String[] args) {
		boolean run = true;
		int MaxNumber = 100;
		int RecentNumber=100;
		int count=0;
		String[][] boardArray = new String[100][5];
		String space = "          ";
		int selectindex=0;
		Scanner scanner =new Scanner(System.in);
		String s = null;
		int number=0;
		while(run)
		{
			System.out.println("--------------------------------------------");

			System.out.println("1.목록 | 2.생성 | 3.읽기 | 4.수정 | 5.삭제 | 6.종료");

			System.out.println("--------------------------------------------");

			System.out.print("메뉴선택> ");
			
			s = scanner.nextLine();
			int menu = Integer.parseInt(s);
			switch(menu)
			{
			case 1:
				System.out.println("-----------------------------------------------------------------------------");
				
				System.out.println("번호" +space +  "제목" + space+"내용"+space+"글쓴이"+ space+"조회");

				System.out.println("-----------------------------------------------------------------------------");
				//글이 없을때
				if(count==0)
				{
					System.out.println("존재하는 글이 없습니다. 생성해 주세요.");
				}
				// 글이 있을때
				else
				{
					for(int i=RecentNumber;i< 100; i++)
					{
						System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
						
					}
				}
				break;

			case 2:
				// 목록출력
				System.out.println("-----------------------------------------------------------------------------");
				
				System.out.println("번호" +space +  "제목" + space+"내용"+space+"글쓴이"+ space+"조회");

				System.out.println("-----------------------------------------------------------------------------");
				//글이 없을때
				if(count==0)
				{
					System.out.println("존재하는 글이 없습니다. 생성해 주세요.");
				}
				// 글이 있을때
				else
				{
					for(int i=RecentNumber;i< 100; i++)
					{
						System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
						
					}
				}
				//게시판 꽉 찼으면
				if(count>=99)
				{
					System.out.println("게시판이 꽉 찼습니다. 일부 게시물을 삭제해 주세요.");
				}
				// 게시판 자리 있으면 생성
				else
				{
					// 번호선택
					for(int i=99; i>=0; i--)
					{
						if(boardArray[i][0]==null)
						{
							selectindex = i;
							break;
						}
					}
					
					
					RecentNumber--;
					boardArray[selectindex][0] =  ""+(MaxNumber - RecentNumber);
					// 제목
					System.out.print("제목: ");
					s = scanner.nextLine();
					boardArray[selectindex][1] =  ""+s;
					
					// 내용
					System.out.print("내용: ");
					s = scanner.nextLine();
					boardArray[selectindex][2] =  ""+s;
					
					// 글쓴이
					System.out.print("글쓴이: ");
					s = scanner.nextLine();
					boardArray[selectindex][3] =  ""+s;
					
					// 조회수
					boardArray[selectindex][4] =  ""+0;
					
					//카운트 추가
					count++;
				}		
			
				break;

			case 3:
				//번호확인
				System.out.print("번호 :");
				s = scanner.nextLine();
				number = Integer.parseInt(s);
				// 번호선택
				selectindex = -1;
				for(int i=99; i>=0; i--)
				{
					if(boardArray[i][0]!=null&&boardArray[i][0].equals(""+number))
					{
						selectindex = i;
						break;
					}
				}
				// 잘못된 넘버 
				if(selectindex==-1 ||boardArray[selectindex][0]==null )
				{
					System.out.println("잘못된 숫자이거나 해당 번호의 게시물이 존재하지 않습니다.");
				}
				// 제대로된 넘버면
				else
				{
					// 조회수 증가
					int views = Integer.parseInt(boardArray[selectindex][4]);
					views++;
					boardArray[selectindex][4] = ""+views;
						System.out.println("번호 : " + boardArray[selectindex][1]);
						System.out.println("제목 : " + boardArray[selectindex][2]);
						System.out.println("내용 : " + boardArray[selectindex][3]);
						System.out.println("조회수 : " + boardArray[selectindex][4]);
				}
				break;

			case 4:
				// 목록출력
				System.out.println("-----------------------------------------------------------------------------");
				
				System.out.println("번호" +space +  "제목" + space+"내용"+space+"글쓴이"+ space+"조회");

				System.out.println("-----------------------------------------------------------------------------");
				//글이 없을때
				if(count==0)
				{
					System.out.println("존재하는 글이 없습니다. 생성해 주세요.");
				}
				// 글이 있을때
				else
				{
					for(int i=RecentNumber;i< 100; i++)
					{
						System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
						
					}
					// 번호확인
					System.out.print("번호 :");
					s = scanner.nextLine();
					number = Integer.parseInt(s);
					// 번호선택
					selectindex=-1;
					for(int i=99; i>=0; i--)
					{
						if(boardArray[i][0]!=null&&boardArray[i][0].equals(""+number))
						{
							selectindex = i;
							break;
						}
					}
					// 잘못된 넘버 
					if(selectindex==-1 ||boardArray[selectindex][0]==null )
					{
						System.out.println("잘못된 숫자이거나 해당 번호의 게시물이 존재하지 않습니다.");
					}
					// 제대로된 넘버면
					else
					{
						System.out.print("기존제목: ");
						String pretitle = boardArray[selectindex][1];
						System.out.println(pretitle);
						System.out.print("수정제목: ");
						s = scanner.nextLine();
						System.out.println(s);
						// 바로 엔터 누른거 아니면 해당내용으로 수정
						if(s.equals(""))
						{
							boardArray[selectindex][1] = pretitle;
						}
						else
						{
							boardArray[selectindex][1] = s;
						}
						
						System.out.print("기존내용: ");
						String precontent = boardArray[selectindex][2];
						System.out.println(precontent);
						System.out.print("수정내용: ");
						s = scanner.nextLine();
						// 바로 엔터 누른거 아니면 해당내용으로 수정
						if(s.equals(""))
						{
							boardArray[selectindex][2] = precontent;
						}
						else
						{
							boardArray[selectindex][2] = s;
						}
				}
				
				}
				
				
			
				break;
			case 5:
				// 목록출력
				System.out.println("-----------------------------------------------------------------------------");
				
				System.out.println("번호" +space +  "제목" + space+"내용"+space+"글쓴이"+ space+"조회");

				System.out.println("-----------------------------------------------------------------------------");
				//글이 없을때
				if(count==0)
				{
					System.out.println("존재하는 글이 없습니다. 생성해 주세요.");
				}
				// 글이 있을때
				else
				{
					for(int i=RecentNumber;i< 100; i++)
					{
						System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
						
					}
					// 번호확인
					System.out.print("번호 :");
					s = scanner.nextLine();
					number = Integer.parseInt(s);
					// 번호선택
					selectindex=-1;
					for(int i=99; i>=0; i--)
					{
						if(boardArray[i][0]!=null&&boardArray[i][0].equals(""+number))
						{
							selectindex = i;
							break;
						}
					}
					// 잘못된 넘버 
					if(selectindex==-1 ||boardArray[selectindex][0]==null )
					{
						System.out.println("잘못된 숫자이거나 해당 번호의 게시물이 존재하지 않습니다.");
					}
					// 제대로된 넘버면
					else
					{
						// 삭제
						for(int i=0; i<boardArray[0].length; i++)
						{
							boardArray[selectindex][i] = null;
						}
						count--;
					}
				}
				
			
				break;
			case 6:
				System.out.println("종료합니다");
				return;
			}
		}

	}

}
