package Third_test;

import java.util.Scanner;

public class Football_Team {
	Scanner input = new Scanner(System.in);
	
	String team_name;
	
	int MAX_COACHNUM=5;
	int MAX_PLAYERNUM=100;
	int coach_num;
	Football_People[] coach_list=new Football_People [MAX_COACHNUM];
	
	int player_num;
	Football_People[] player_list=new Football_People [MAX_PLAYERNUM];
	
	public Football_Team(String t_n) {
		team_name=t_n;
	}
	
	public void shows() {
		System.out.println("队名："+team_name);
		if(coach_num==0) {
			System.out.println("目前无教练");
		}else {
			System.out.println("教练数量："+coach_num);
			System.out.println("教练成员信息：");
			for(int i=0;i<coach_num;i++) {
				coach_list[i].show();
			}
		}
		
		if(player_num==0) {
			System.out.println("目前无队员");
		}else {
			System.out.println("队员数量："+player_num);
			System.out.println("队员成员信息：");
			for(int i=0;i<player_num;i++) {
				player_list[i].show();
			}
		}
		System.out.println();
	}
	
	public void update_player(Football_People p) {
		player_list[player_num]=p;
		player_num++;
	}
	
	public void update_coach(Football_People c) {
		coach_list[coach_num]=c;
		coach_num++;
	}
	
	
}