package dop.workerbase;
import dop.workers.*;
import dop.excpt.*;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class WorkerBase{
	private LinkedList<Worker> workers;
	private int size;
	public WorkerBase(){
		this.workers = new LinkedList<Worker>();
	}
	public void add(Worker w){
		workers.add(w);	
	}
	public void erase(int id ){
		workers.remove(find(id));
	}
	public float calcTotalSalary(){
		float sum = 0;
		ListIterator<Worker> iter = this.workers.listIterator();
		while(iter.hasNext()){
			Worker tmp = iter.next();
			sum += tmp.getSalary();
		}
		return sum;
	}
	public Worker find(int id){
		ListIterator<Worker> iter = this.workers.listIterator();
		while(iter.hasNext()){
			Worker tmp = iter.next();
			if(tmp.getid() == id) return tmp;
		}
		IdException e = new IdException("not correct Id ");
		throw e;
	}
	public String toString(){ 
		StringBuilder str = new	StringBuilder();	
		str.append("\n--------Base-------:");

		ListIterator<Worker> iter = this.workers.listIterator();
		while(iter.hasNext()){
			Worker tmp = iter.next();
			str.append(tmp.toString());
			str.append("\n");
		}
		return str.toString(); 
	}
}