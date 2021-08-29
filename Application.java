package com.Application;
import java.util.Scanner;

import com.player.Player;
import com.player.PlayerInterface;
import com.player.Player_Repository;
import com.storage.StorageFactory;

public class Application {

    // Mentor Comment: Form Team Functionality is not found anywhere


	private PlayerInterface imp = StorageFactory.getStorage();
	
	public void acceptPlayerDetailsAndStore() {
		
		Scanner scn = new Scanner(System.in);
		
		Player p = new Player();
		
		System.out.println("Enter Player Name: ");
		p.setName(scn.next());

		//Mentor Comment : Validation for Name?
		
		
		System.out.println("Enter Player Category: ");
		p.setCategory(scn.next());
		//Mentor Comment : Validation for Category?
		
		System.out.println("Enter Ranking: ");
		p.setRanking(scn.nextInt());
		//Mentor Comment : Validation for Ranking?
		
		imp.addPlayer(p);
	}

	public static void main(String[] args) {
		System.out.println("Welcome! Please select the action you want to perform\r\n"
				+ "Add Players to repository\r\n"
				+ "Form team");
	
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
	
		if(str == "Add Players to repository") {
			System.out.println("Enter the number of players that you would like to add");
			int	n = sc.nextInt();
			Player_Repository plyr ;
	
	}
	
	
	}
	

}
