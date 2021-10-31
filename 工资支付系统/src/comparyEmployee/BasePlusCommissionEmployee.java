package comparyEmployee;

//��н+���
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasePlusCommissionEmployee extends Employee implements GetBaseSalary, GetSale {

	 public static int RedEnvelope = 100;
	@Override
	public int salary() {
		// TODO �Զ����ɵķ������
		 try {
	            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
	            int AmountOfSale;
	            System.out.print("������������������");
	            AmountOfSale = new Scanner(System.in).nextInt();
	            if (AmountOfSale < 0)
	            {
	                System.out.println("��������������");
	                return salary();
	            }
	            else
	            {
	                salary = BaseSalary + AmountOfSale * SalaryPerSale;
	                if (month == birthMonth)//�����Ա���������һ�����պ��
	                    salary += RedEnvelope;
	                return salary;
	            }
	        }
	        catch (InputMismatchException e)
	        {
	            System.out.println("������������");
	            return salary();
	        }

	}

}
