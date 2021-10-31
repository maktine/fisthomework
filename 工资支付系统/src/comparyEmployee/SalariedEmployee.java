package comparyEmployee;

import java.util.Calendar;
//按月拿工资
public class SalariedEmployee extends Employee implements GetSalaryPerMonth {
	
	public static int RedEnvelope = 100; //生日红包
	public int salary() {
		// TODO 自动生成的方法存根
		
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; //获取当前月份
        if (month == birthMonth)//如果当月是员工生日则给一个生日红包
            salary = SalaryPerMonth + RedEnvelope;
        else
            salary = SalaryPerMonth;
        return salary;

	}

}
