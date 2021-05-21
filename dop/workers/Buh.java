package dop.workers;
import dop.workerbase.*;

public class Buh extends Worker{
	private int baseSalary;
	private int bonus;
	public Buh(String name, int id, int baseSalary){
		super(name,id);
		this.baseSalary = baseSalary;
	}
	public final void mbonus(int bonus){
		this.bonus = bonus;
	}
	public final float getSalary(){
		return (float)(this.baseSalary + bonus);
	}
}