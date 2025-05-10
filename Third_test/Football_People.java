package Third_test;

public class Football_People {
	String name;
	int ID;
	String Status;
	
	public Football_People(String n,int I,String S) {
		name=n;
		ID=I;
		Status=S;
	}
	
	public void show() {
		System.out.println(name+","+ID+","+Status);
	}
}
