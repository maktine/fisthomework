package comparyEmployee;

//�����۶���ɹ���
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CommissionEmployee extends Employee implements GetSale {

	public static double RedEnvelope=100; //���պ��;
	@Override
	public int salary() {
		// TODO �Զ����ɵķ������
		try
		{
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;//
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
                salary = AmountOfSale * SalaryPerSale;
                if (month == birthMonth)
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
