package mvc.controller;

import mvc.view.GameFrame;
import mvc.view.setFrame;
import mvc.model.LeftPanelModel;
import mvc.model.RightPanelModel;

public class init {

	public static void main(String[] args) {

		//initialize
		boolean running = true;
		GameFrame GameFrame = new GameFrame(/*total model*/);
	    GameFrame.setVisible(true);
		Controller c = new Controller(); //*******yihan********
		while(true) {
			if(running == false) {
				break;
			}
			c.move();
			
		}
	}
	
	

	  
}
