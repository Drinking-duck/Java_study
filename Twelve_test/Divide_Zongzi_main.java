package Twelve_test;

/*
 *第十二周作业：
在食堂售卖的粽子先由后厨制作，
再放在销售区售卖，学生从销售区购买粽子，
销售区一次最多只能放200个粽子，
如果后厨想制作更多的粽子，
销售区会让后厨停一停，  
如果销售区有空位，再通知后厨，继续生产，
如果销售区没有了粽子，销售区会告诉学生等一下，
如果销售区有了粽子再通知学生取走产品。请编写程序描述上述过程。
 */
public class Divide_Zongzi_main {
	public static void main(String[] args) {
		
		Zongzi zz=new Zongzi(500,150);
		
		Product_Zongzi P_zz=new Product_Zongzi(zz);
		new Thread(P_zz,"后厨").start();
		
		Divide_Zongzi D_zz=new Divide_Zongzi(zz);
		new Thread(D_zz,"销售处").start();

		
	}
}
