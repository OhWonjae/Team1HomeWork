package Team1;
import java.util.Scanner;
public class OhWonjae {

	public static void main(String[] args) {
		boolean run = true;
		// ��ü �Խ��� ����
		int MaxNumber = 100;
		// �Խù� �ֻ�� �ε��� ��ġ
		int RecentNumber=100;
		// �Խù� id
		int id=1;
		// �Խù� ����
		int count=0;
		// �Խù� Array
		String[][] boardArray = new String[100][5];
		// ui ����
		String space = "          ";
		// ������ �ε���
		int selectindex=0;
		Scanner scanner =new Scanner(System.in);
		String s = null;
		int number=0;
		while(run)
		{
			System.out.println("--------------------------------------------");

			System.out.println("1.��� | 2.���� | 3.�б� | 4.���� | 5.���� | 6.����");

			System.out.println("--------------------------------------------");

			System.out.print("�޴�����> ");
			
			s = scanner.nextLine();
			int menu = Integer.parseInt(s);
			switch(menu)
			{
			case 1:
				System.out.println("-----------------------------------------------------------------------------");
				
				System.out.println("��ȣ" +space +  "����" + space+"����"+space+"�۾���"+ space+"��ȸ");

				System.out.println("-----------------------------------------------------------------------------");
				//���� ������
				if(count==0)
				{
					System.out.println("�����ϴ� ���� �����ϴ�. ������ �ּ���.");
				}
				// ���� ������
				else
				{
					for(int i=RecentNumber;i< 100; i++)
					{
						System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
						
					}
				}
				break;

			case 2:
				// ������
				System.out.println("-----------------------------------------------------------------------------");
				
				System.out.println("��ȣ" +space +  "����" + space+"����"+space+"�۾���"+ space+"��ȸ");

				System.out.println("-----------------------------------------------------------------------------");
				//���� ������
				if(count==0)
				{
					System.out.println("�����ϴ� ���� �����ϴ�. ������ �ּ���.");
				}
				// ���� ������
				else
				{
					for(int i=RecentNumber;i< 100; i++)
					{
						System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
						
					}
				}
				//�Խ��� �� á����
				if(count>=99)
				{
					System.out.println("�Խ����� �� á���ϴ�. �Ϻ� �Խù��� ������ �ּ���.");
				}
				// �Խ��� �ڸ� ������ ����
				else
				{
					// ��ȣ����
					for(int i=99; i>=0; i--)
					{
						if(boardArray[i][0]==null)
						{
							selectindex = i;
							break;
						}
					}
					if(selectindex<RecentNumber)
					{
						RecentNumber--;
					}
					
					
					boardArray[selectindex][0] =  ""+id;
					// ����
					System.out.print("����: ");
					s = scanner.nextLine();
					boardArray[selectindex][1] =  ""+s;
					
					// ����
					System.out.print("����: ");
					s = scanner.nextLine();
					boardArray[selectindex][2] =  ""+s;
					
					// �۾���
					System.out.print("�۾���: ");
					s = scanner.nextLine();
					boardArray[selectindex][3] =  ""+s;
					
					// ��ȸ��
					boardArray[selectindex][4] =  ""+0;
					
					//ī��Ʈ �߰�
					count++;
					//id�߰�
					id++;
				}		
			
				break;

			case 3:
				//��ȣȮ��
				System.out.print("��ȣ :");
				s = scanner.nextLine();
				number = Integer.parseInt(s);
				// ��ȣ����
				selectindex = -1;
				for(int i=99; i>=0; i--)
				{
					if(boardArray[i][0]!=null&&boardArray[i][0].equals(""+number))
					{
						selectindex = i;
						break;
					}
				}
				// �߸��� �ѹ� 
				if(selectindex==-1 ||boardArray[selectindex][0]==null )
				{
					System.out.println("�߸��� �����̰ų� �ش� ��ȣ�� �Խù��� �������� �ʽ��ϴ�.");
				}
				// ����ε� �ѹ���
				else
				{
					// ��ȸ�� ����
					int views = Integer.parseInt(boardArray[selectindex][4]);
					views++;
					boardArray[selectindex][4] = ""+views;
						System.out.println("��ȣ : " + boardArray[selectindex][1]);
						System.out.println("���� : " + boardArray[selectindex][2]);
						System.out.println("���� : " + boardArray[selectindex][3]);
						System.out.println("��ȸ�� : " + boardArray[selectindex][4]);
				}
				break;

			case 4:
				// ������
				System.out.println("-----------------------------------------------------------------------------");
				
				System.out.println("��ȣ" +space +  "����" + space+"����"+space+"�۾���"+ space+"��ȸ");

				System.out.println("-----------------------------------------------------------------------------");
				//���� ������
				if(count==0)
				{
					System.out.println("�����ϴ� ���� �����ϴ�. ������ �ּ���.");
				}
				// ���� ������
				else
				{
					for(int i=RecentNumber;i< 100; i++)
					{
						System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
						
					}
					// ��ȣȮ��
					System.out.print("��ȣ :");
					s = scanner.nextLine();
					number = Integer.parseInt(s);
					// ��ȣ����
					selectindex=-1;
					for(int i=99; i>=0; i--)
					{
						if(boardArray[i][0]!=null&&boardArray[i][0].equals(""+number))
						{
							selectindex = i;
							break;
						}
					}
					// �߸��� �ѹ� 
					if(selectindex==-1 ||boardArray[selectindex][0]==null )
					{
						System.out.println("�߸��� �����̰ų� �ش� ��ȣ�� �Խù��� �������� �ʽ��ϴ�.");
					}
					// ����ε� �ѹ���
					else
					{
						System.out.print("��������: ");
						String pretitle = boardArray[selectindex][1];
						System.out.println(pretitle);
						System.out.print("��������: ");
						s = scanner.nextLine();
						System.out.println(s);
						// �ٷ� ���� ������ �ƴϸ� �ش系������ ����
						if(s.equals(""))
						{
							boardArray[selectindex][1] = pretitle;
						}
						else
						{
							boardArray[selectindex][1] = s;
						}
						
						System.out.print("��������: ");
						String precontent = boardArray[selectindex][2];
						System.out.println(precontent);
						System.out.print("��������: ");
						s = scanner.nextLine();
						// �ٷ� ���� ������ �ƴϸ� �ش系������ ����
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
				// ������
				System.out.println("-----------------------------------------------------------------------------");
				
				System.out.println("��ȣ" +space +  "����" + space+"����"+space+"�۾���"+ space+"��ȸ");

				System.out.println("-----------------------------------------------------------------------------");
				//���� ������
				if(count==0)
				{
					System.out.println("�����ϴ� ���� �����ϴ�. ������ �ּ���.");
				}
				// ���� ������
				else
				{
					for(int i=RecentNumber;i< 100; i++)
					{
						System.out.println(boardArray[i][0] +space +boardArray[i][1] + space+boardArray[i][2]+space+boardArray[i][3]+ space+boardArray[i][4]);
						
					}
					// ��ȣȮ��
					System.out.print("��ȣ :");
					s = scanner.nextLine();
					number = Integer.parseInt(s);
					// ��ȣ����
					selectindex=-1;
					for(int i=99; i>=0; i--)
					{
						if(boardArray[i][0]!=null&&boardArray[i][0].equals(""+number))
						{
							selectindex = i;
							break;
						}
					}
					// �� ������ �����ϸ� �ֻ�� �ѹ��� ������Ʈ
					if(selectindex==RecentNumber)
					{
						RecentNumber++;
					}
					// �߸��� �ѹ� 
					if(selectindex==-1 ||boardArray[selectindex][0]==null )
					{
						System.out.println("�߸��� �����̰ų� �ش� ��ȣ�� �Խù��� �������� �ʽ��ϴ�.");
					}
					// ����ε� �ѹ���
					else
					{
						// ����
						for(int i=0; i<boardArray[0].length; i++)
						{
							boardArray[selectindex][i] = null;
						}
						count--;
					}
				}
				
			
				break;
			case 6:
				System.out.println("�����մϴ�");
				return;
			}
		}

	}

}
