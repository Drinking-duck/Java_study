package Twelve_test;

public class Divide_Zongzi extends Thread{
	Zongzi zz=null;

	public Divide_Zongzi(Zongzi z) {
		this.zz=z;
	}
	
	public void run() {
		try {
			while(zz.act_number<zz.size){
				zz.sell();
				Thread.sleep(2);
			}
		}catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+"interrupted.");
		}
	}
}
