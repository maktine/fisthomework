package comparyEmployee;

//按工时拿工资
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HourlyEmployee extends Employee implements GetWorkHour {

	public static double RedEnvelope=100;  //生日红包
	public static int StandarWorkTime=180;  //每个月的标准工时为180
	
	@Override
	public int salary() {
		// TODO 自动生成的方法存根
		try {
			int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int WorkHour;
            System.out.print("请输入您的工时：");
            WorkHour = new Scanner(System.in).nextInt();
            if (WorkHour < 0) //规范输入
            {
                System.out.println("请输入正整数！");
                return salary();
            }
            else
            { //计算工资
                if (WorkHour>StandarWorkTime)//如果工时大于额定工时则给超出工时的部分另外计算
                    salary = SalaryPerHour * StandarWorkTime + OvertimeSalaryPerHour * (WorkHour - 160);
                else
                    salary = SalaryPerHour * WorkHour;
                if (month == birthMonth)//如果当月是员工生日则给一个生日红包
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
	

