package com.player;
import com.Application.*;
import com.player.*;

public class Player_Repository implements PlayerInterface{
	
	Player[] player;
	int cntPlayer;
	
	
	public Player_Repository() {
		super();
		this.player = new Player[11];
		this.cntPlayer = 0;
	}

	@Override
	public void addPlayer(Player p) {
		// TODO Auto-generated method stub
		player[cntPlayer]=p;
		cntPlayer++;
	}

	@Override
	public Player getPlayer(int ranking) {
		// TODO Auto-generated method stub
		for(int i=0; i<cntPlayer;i++) {
			
			if(player[i].getPlayer()== ranking) {
				
				return player[i];
			}
		}
		
		return null;
	}
	
	
	
	

}
