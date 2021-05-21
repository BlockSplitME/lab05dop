package dop.workers;
import dop.workerbase.*;

public class Prog extends Worker{
	private int baseSalary;
	private int level;
	private float qual;
	private boolean bonus;
	
	public Prog(String name, int id, int baseSalary, int level, float qual){
		super(name,id);
		this.baseSalary = baseSalary;
		this.level = level;
		this.qual = qual;
	}
	public final void isBonus(boolean bonus){
		this.bonus = bonus;
	}
	public final float getSalary(){
		if(bonus == true) return (float)(baseSalary + (level*1000) + 500);
		return (float)(baseSalary + (level*1000));
	}
}