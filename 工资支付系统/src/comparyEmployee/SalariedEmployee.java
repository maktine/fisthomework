package comparyEmployee;

import java.util.Calendar;
//�����ù���
public class SalariedEmployee extends Employee implements GetSalaryPerMonth {
	
	public static int RedEnvelope = 100; //���պ��
	public int salary() {
		// TODO �Զ����ɵķ������
		
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; //��ȡ��ǰ�·�
        if (month == birthMonth)//���������Ա���������һ�����պ��
            salary = SalaryPerMonth + RedEnvelope;
        else
            salary = SalaryPerMonth;
        return salary;

	}

}
