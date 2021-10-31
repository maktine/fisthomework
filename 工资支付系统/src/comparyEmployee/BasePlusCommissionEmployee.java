package comparyEmployee;

//底薪+提成
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasePlusCommissionEmployee extends Employee implements GetBaseSalary, GetSale {

	 public static int RedEnvelope = 100;
	@Override
	public int salary() {
		// TODO 自动生成的方法存根
		 try {
	            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
	            int AmountOfSale;
	            System.out.print("请输入您的销售量：");
	            AmountOfSale = new Scanner(System.in).nextInt();
	            if (AmountOfSale < 0)
	            {
	                System.out.println("请输入正整数！");
	                return salary();
	            }
	            else
	            {
	                salary = BaseSalary + AmountOfSale * SalaryPerSale;
	                if (month == birthMonth)//如果是员工生日则给一个生日红包
	                    salary += RedEnvelope;
	                return salary;
	            }
	        }
	        catch (InputMismatchException e)
	        {
	            System.out.println("请输入整数！");
	            return salary();
	        }

	}

}
