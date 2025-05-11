package Twelve_test;

public class Product_Zongzi extends Thread{
	Zongzi zz=null;
	
	public Product_Zongzi(Zongzi z) {
		this.zz=z;
	}
	
	public void run() {
		try {
			while((zz.pro_number+150)<zz.size){
				zz.put();
				Thread.sleep(2);
			}
		}catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+"interrupted.");
		}
	}
	
}
