package Third_test;


/*
2.	使用某种方式存储一个足球队的3个人员(包括教练和队员)的信息：
•	人员信息包括：姓名，ID，在球队中的角色(队员及教练等); 
•	要求至少包含球队类(class)及人员类(class)；
•	打印出所有人员的信息。
*/

public class Football_test {
	public static void main(String[] args) {
		Football_People c1=new Football_People("老陈",947363,"Coach");
		
		Football_People p1=new Football_People("Tony",371481,"Player");
		Football_People p2=new Football_People("Daiv",743824,"Player");
		Football_People p3=new Football_People("Jack",298373,"Player");
		
		Football_Team T=new Football_Team("狂帅强球队");
		
		T.shows();
		
		T.update_coach(c1);
		T.update_player(p1);
		T.update_player(p2);
		T.update_player(p3);
		T.shows();
		
		System.out.println();
	}
}
