package dop.workers;
import dop.workerbase.*;

public class Solder extends Worker{
	private int num;
	private float percent;
	private int price;
	private String org;
	public Solder(String name, int id, String org){
		super(name,id);
		this.org = org;
	}
	public final void SolderWork(int num, int price, float percent){
		this.num = num;
		this.price = price;
		this.percent = percent;
	}
	public final float getSalary(){
		return ((float)num * ((float)price*percent));
	}
}