package dop;
import dop.workers.*;
import dop.workerbase.*;
import dop.excpt.*;

public class Main{
	public static void main(String[] args){
		try{
			WorkerBase base = new WorkerBase();
			
			Buh b1 = new Buh("Bob", 1, 500);
			b1.mbonus(15);
			Prog p1 = new Prog("Peter", 2, 1000, 3, 0.2f);
			p1.isBonus(true);
			Solder s1 = new Solder("Steven", 3 , "SUAI");
			s1.SolderWork(10,4, 0.1f);
			
			base.add(b1);
			base.add(p1);
			base.add(s1);

			System.out.println(base);
			System.out.println("All Salary:" + base.calcTotalSalary());

			base.erase(2);
			System.out.println(base);
			System.out.println("All Salary:" + base.calcTotalSalary());
		}
		catch(IdException error){
			error.getMassage();
			error.printStackTrace();
		}
	}
}