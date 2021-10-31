package comparyEmployee;

//主类

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayrollSystem {
	public static int choice;
	//选择菜单
	public static int choice()
	{
		try {
			choice=new Scanner(System.in).nextInt();
			if(choice<0||choice>4)	//只有四种计算薪酬的方法
			{
				System.out.println("超出范围，请输入整数0-4");
				return choice();
			}
			else if(choice==0)
				System.exit(0);//退出程序
			else
				return choice;
		
		}
		catch(InputMismatchException e)
		{
			System.out.println("请输入整数");
			return choice();
		}
		return -1;
	}
		
		//获取工号
		public static int get_number()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("请输入工号:");
			try {
				int number=sc.nextInt();
				if(number<=0)
				{
					System.out.println("请输入正整数");
					return get_number();
				}
				return number;
			}
			catch(InputMismatchException e)
			{
				System.out.println("请输入整数");
				return get_number();
			}
		
		}


		//获取姓名
		public static String get_name() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入姓名：");
			String name = sc.next();
			Pattern pattern = Pattern.compile(".*\\d+.*");
			if (pattern.matcher(name).matches())
			{
				System.out.println("不能输入数字");
				return get_name();
			}
			return name;
		}
		 //获取出生年份
	    public static int get_birthYear() 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("请输入出生年份：");
	        try {
	            int birthYear = sc.nextInt();
	            if (birthYear < 1900 || birthYear > 2021)
	            {
	                System.out.println("输入有误，请重新输入！");
	                return get_birthYear();
	            }
	            return birthYear;
	        }
	        catch (InputMismatchException e)
	        {
	            System.out.println("请输入数字！");
	            return get_birthYear();
	        }
	    }
	  //获取出生月份
	    public static int get_birthMonth() 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("请输入出生月份：");
	        try {
	            int birthMonth = sc.nextInt();
	            if (birthMonth < 1 || birthMonth > 12)
	            {
	                System.out.println("输入有误，请重新输入！");
	                return get_birthMonth();
	            }
	            return birthMonth;
	        }
	        catch (InputMismatchException e)
	        {
	            System.out.println("请输入数字");
	            return get_birthMonth();
	        }
	    }
	    
	    //输入工人信息并计算薪酬
	    public static void main(String[] args) {
	        Employee []Data = new Employee[4];
	        Data[0] = new SalariedEmployee();
	        Data[1] = new HourlyEmployee();
	        Data[2] = new CommissionEmployee();
	        Data[3] = new BasePlusCommissionEmployee();

	        System.out.println("请输入员工类型：1.领固定月薪 2.计时取酬 3.按销售额提成 4.带底薪并按销售额提成 0.退出");
	        choice = choice();
	        switch (choice)
	        {
	            case 1:
	            {
	                Data[0].number = get_number();
	                Data[0].name = get_name();
	                Data[0].birthYear = get_birthYear();
	                Data[0].birthMonth = get_birthMonth();
	                System.out.println("处理结果：");
	                System.out.println("工号："+Data[0].number);
	                System.out.println("姓名："+Data[0].name);
	                System.out.println("出生年月："+Data[0].birthYear+"年"+Data[0].birthMonth+"月");
	                System.out.println("工资："+Data[0].salary());
	                break;
	            }
	            case 2:
	            {
	                Data[1].number = get_number();
	                Data[1].name = get_name();
	                Data[1].birthYear = get_birthYear();
	                Data[1].birthMonth = get_birthMonth();
	                int salary = Data[1].salary();
	                System.out.println("处理结果：");
	                System.out.println("工号："+Data[1].number);
	                System.out.println("姓名："+Data[1].name);
	                System.out.println("出生年月："+Data[1].birthYear+"年"+Data[1].birthMonth+"月");
	                System.out.println("工资："+salary);
	                break;
	            }
	            case 3:
	            {
	                Data[2].number = get_number();
	                Data[2].name = get_name();
	                Data[2].birthYear = get_birthYear();
	                Data[2].birthMonth = get_birthMonth();
	                int salary = Data[2].salary();
	                System.out.println("处理结果：");
	                System.out.println("工号："+Data[2].number);
	                System.out.println("姓名："+Data[2].name);
	                System.out.println("出生年月："+Data[2].birthYear+"年"+Data[2].birthMonth+"月");
	                System.out.println("工资："+salary);
	                break;
	            }
	            case 4:
	            {
	                Data[3].number = get_number();
	                Data[3].name = get_name();
	                Data[3].birthYear = get_birthYear();
	                Data[3].birthMonth = get_birthMonth();
	                int salary = Data[3].salary();
	                System.out.println("处理结果：");
	                System.out.println("工号："+Data[3].number);
	                System.out.println("姓名："+Data[3].name);
	                System.out.println("出生年月："+Data[3].birthYear+"年"+Data[3].birthMonth+"月");
	                System.out.println("工资："+salary);
	                break;
	            }
	            default:
	                System.out.println("error");
	        }
	    }	    
   
}	


