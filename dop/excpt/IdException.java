package dop.excpt;

public class IdException extends RuntimeException{
	private String error;

	public IdException(String error){
		this.error = error;
		System.out.println("This is a error...");
	}
	public void getMassage(){
		System.err.println("Error:" + error);
	}
}