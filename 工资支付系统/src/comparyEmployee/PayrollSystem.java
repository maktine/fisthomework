package comparyEmployee;

//����

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayrollSystem {
	public static int choice;
	//ѡ��˵�
	public static int choice()
	{
		try {
			choice=new Scanner(System.in).nextInt();
			if(choice<0||choice>4)	//ֻ�����ּ���н��ķ���
			{
				System.out.println("������Χ������������0-4");
				return choice();
			}
			else if(choice==0)
				System.exit(0);//�˳�����
			else
				return choice;
		
		}
		catch(InputMismatchException e)
		{
			System.out.println("����������");
			return choice();
		}
		return -1;
	}
		
		//��ȡ����
		public static int get_number()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("�����빤��:");
			try {
				int number=sc.nextInt();
				if(number<=0)
				{
					System.out.println("������������");
					return get_number();
				}
				return number;
			}
			catch(InputMismatchException e)
			{
				System.out.println("����������");
				return get_number();
			}
		
		}


		//��ȡ����
		public static String get_name() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("������������");
			String name = sc.next();
			Pattern pattern = Pattern.compile(".*\\d+.*");
			if (pattern.matcher(name).matches())
			{
				System.out.println("������������");
				return get_name();
			}
			return name;
		}
		 //��ȡ�������
	    public static int get_birthYear() 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("�����������ݣ�");
	        try {
	            int birthYear = sc.nextInt();
	            if (birthYear < 1900 || birthYear > 2021)
	            {
	                System.out.println("�����������������룡");
	                return get_birthYear();
	            }
	            return birthYear;
	        }
	        catch (InputMismatchException e)
	        {
	            System.out.println("���������֣�");
	            return get_birthYear();
	        }
	    }
	  //��ȡ�����·�
	    public static int get_birthMonth() 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("����������·ݣ�");
	        try {
	            int birthMonth = sc.nextInt();
	            if (birthMonth < 1 || birthMonth > 12)
	            {
	                System.out.println("�����������������룡");
	                return get_birthMonth();
	            }
	            return birthMonth;
	        }
	        catch (InputMismatchException e)
	        {
	            System.out.println("����������");
	            return get_birthMonth();
	        }
	    }
	    
	    //���빤����Ϣ������н��
	    public static void main(String[] args) {
	        Employee []Data = new Employee[4];
	        Data[0] = new SalariedEmployee();
	        Data[1] = new HourlyEmployee();
	        Data[2] = new CommissionEmployee();
	        Data[3] = new BasePlusCommissionEmployee();

	        System.out.println("������Ա�����ͣ�1.��̶���н 2.��ʱȡ�� 3.�����۶���� 4.����н�������۶���� 0.�˳�");
	        choice = choice();
	        switch (choice)
	        {
	            case 1:
	            {
	                Data[0].number = get_number();
	                Data[0].name = get_name();
	                Data[0].birthYear = get_birthYear();
	                Data[0].birthMonth = get_birthMonth();
	                System.out.println("��������");
	                System.out.println("���ţ�"+Data[0].number);
	                System.out.println("������"+Data[0].name);
	                System.out.println("�������£�"+Data[0].birthYear+"��"+Data[0].birthMonth+"��");
	                System.out.println("���ʣ�"+Data[0].salary());
	                break;
	            }
	            case 2:
	            {
	                Data[1].number = get_number();
	                Data[1].name = get_name();
	                Data[1].birthYear = get_birthYear();
	                Data[1].birthMonth = get_birthMonth();
	                int salary = Data[1].salary();
	                System.out.println("��������");
	                System.out.println("���ţ�"+Data[1].number);
	                System.out.println("������"+Data[1].name);
	                System.out.println("�������£�"+Data[1].birthYear+"��"+Data[1].birthMonth+"��");
	                System.out.println("���ʣ�"+salary);
	                break;
	            }
	            case 3:
	            {
	                Data[2].number = get_number();
	                Data[2].name = get_name();
	                Data[2].birthYear = get_birthYear();
	                Data[2].birthMonth = get_birthMonth();
	                int salary = Data[2].salary();
	                System.out.println("��������");
	                System.out.println("���ţ�"+Data[2].number);
	                System.out.println("������"+Data[2].name);
	                System.out.println("�������£�"+Data[2].birthYear+"��"+Data[2].birthMonth+"��");
	                System.out.println("���ʣ�"+salary);
	                break;
	            }
	            case 4:
	            {
	                Data[3].number = get_number();
	                Data[3].name = get_name();
	                Data[3].birthYear = get_birthYear();
	                Data[3].birthMonth = get_birthMonth();
	                int salary = Data[3].salary();
	                System.out.println("��������");
	                System.out.println("���ţ�"+Data[3].number);
	                System.out.println("������"+Data[3].name);
	                System.out.println("�������£�"+Data[3].birthYear+"��"+Data[3].birthMonth+"��");
	                System.out.println("���ʣ�"+salary);
	                break;
	            }
	            default:
	                System.out.println("error");
	        }
	    }	    
   
}	


