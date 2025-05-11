package Twelve_test;

public class Zongzi {
	int number;
	int size;
	int act_number=0;
	int pro_number=0;
	boolean zongzi=true;
	
	public Zongzi(int s,int n) {
		this.size=s;
		this.number=n;
	}
	
	public synchronized void put() {
		if(number>=200) {//如果还有销售处的粽子为200，则生产粽子线程等待
			try{ wait();} catch(Exception e){}
		}
		pro_number=pro_number+2;
		System.out.println("后厨生产出 "+(pro_number));
		number=number+2;
		if(number>0)
			notify(); //生产粽子后 唤醒 销售处线程开始分发粽子
	}
	
	public synchronized void sell() {
		if(number==0) {//如果没有粽子，则 销售处线程 等待
			try{ wait();} catch(Exception e){}}
		System.out.println("销售处发出粽子编号  "+(++act_number));
		System.out.println("销售处剩余粽子数  "+(--number));
		if(number<200)
			notify(); //分发粽子后唤醒 后厨线程 开始生产粽子
		
		//if (act_number==number) act_number=number+1 ;//在售完最后一张票后，
		//设置一个结束标志，number>size表示售票结束
	}
	
	
}
