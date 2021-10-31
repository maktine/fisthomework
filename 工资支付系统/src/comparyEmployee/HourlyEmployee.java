package comparyEmployee;

//����ʱ�ù���
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HourlyEmployee extends Employee implements GetWorkHour {

	public static double RedEnvelope=100;  //���պ��
	public static int StandarWorkTime=180;  //ÿ���µı�׼��ʱΪ180
	
	@Override
	public int salary() {
		// TODO �Զ����ɵķ������
		try {
			int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int WorkHour;
            System.out.print("���������Ĺ�ʱ��");
            WorkHour = new Scanner(System.in).nextInt();
            if (WorkHour < 0) //�淶����
            {
                System.out.println("��������������");
                return salary();
            }
            else
            { //���㹤��
                if (WorkHour>StandarWorkTime)//�����ʱ���ڶ��ʱ���������ʱ�Ĳ����������
                    salary = SalaryPerHour * StandarWorkTime + OvertimeSalaryPerHour * (WorkHour - 160);
                else
                    salary = SalaryPerHour * WorkHour;
                if (month == birthMonth)//���������Ա���������һ�����պ��
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
	

