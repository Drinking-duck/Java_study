package Third_test;

public class Student_test {
	
	public static void main(String[] args) {
		Student S1=new Student();
		Student S2=new Student("JAVA",18,371481);
		Student S3=new Student("IDE",36,184173,92.5f);
		
		int student_num=100;
		Student[] student_list=new Student[student_num];
		
		student_list[0]=S1;
		student_list[1]=S2;
		student_list[2]=S3;
		int n=3;
		
		for(int i=0;i<n;i++)
		{
			student_list[i].show();
		}
		
		System.out.println(S1.getJavaScore()+S2.getJavaScore()+S3.getJavaScore());
	}
		
		
}
