package Third_test;

/*
 3.	打印9*9乘法表
 */

public class multiplicatinon_table {
	
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			for(int j=i;j<10;j++) {
				System.out.print(i+"*"+j+"="+i*j+'\t');
			}
			System.out.println();
		}
		
	}
}
