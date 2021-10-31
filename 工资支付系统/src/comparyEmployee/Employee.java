package comparyEmployee;

public abstract class Employee {
	
		public int number;  		//工号
		public String name; 		//姓名
		public int birthYear; 
		public int birthMonth; 		//出生年月
		public static int salary;    //工资
		public abstract int salary();
		
}
