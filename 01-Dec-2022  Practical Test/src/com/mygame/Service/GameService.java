package com.mygame.Service;
import com.mygame.dao.GameDAO;

public class GameService {

	public  void getCityNameService(){
		GameDAO GameDAOobj=new GameDAO();
		GameDAOobj.getCityName();
		

	}

}
