package com.mygame.DAO;
import com.mygame.dao GameDAO;

public class GameService {
	public String[] getCityNameService() {
		GameDAO GdObj=new GameDAO();
		 GdObj.getCityName();
		 String s[]=GdObj. getCityName();
		 return s;
	 
	}

}
