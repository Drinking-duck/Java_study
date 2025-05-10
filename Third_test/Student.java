package Third_test;

public class Student {
	String name;
	int age;
	int ID;
	float JavaScore;
	
	public Student()
	{
		name="";
		age=0;
		ID=0;
		JavaScore=0;
	}
	
	public Student(String n,int a,int i)
	{
		name=n;
		age=a;
		ID=i;
		JavaScore=0;
	}
	
	public Student(String n,int a,int i,float j)
	{
		name=n;
		age=a;
		ID=i;
		JavaScore=j;
	}
	
	public void show() {
		System.out.println(name+' '+age+' '+ID+' '+JavaScore);
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public int getID() {
		return ID;
	}
	
	public float getJavaScore() {
		return JavaScore;
	}
	
}
