package com.storage;

import com.player.PlayerInterface;
import com.player.Player_Repository;

public class StorageFactory {
	
	public static PlayerInterface getStorage() {
		PlayerInterface obj = new Player_Repository();
		return obj;
	}
	
}
