package dop.workerbase;
import dop.workers.*;

public abstract class Worker{
	protected String name;
	protected int id;
	public Worker(String name, int id){
		this.name = name;
		this.id = id;
	}
	public int getid(){
		return this.id;
	}

	public abstract float getSalary();
	public String toString(){ 
		StringBuilder str = new	StringBuilder();	
		str.append("\nName:" + name);
		str.append("\nid:" + id);
		str.append("\nSalary:" + this.getSalary());
		return str.toString(); 
	}
}