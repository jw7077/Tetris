package MVC.View;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

import MVC.model.LeftPanelModel;
import MVC.model.RightPanelModel;

public class LeftPanel extends JPanel{
	private LeftPanelModel model;
	
	public LeftPanel(LeftPanelModel model) {
		setSize(100,800);
		this.model = model;
		
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);	   
		drawCoordinates(g);
	}

		
	private void drawCoordinates(Graphics g) {

		  for (int i = 0; i < 12*25; i += 25) {
		    g.drawLine(i, 0, i, 23*25);
		  }
		  for (int j = 0; j < 24*25; j += 25) {
		      g.drawLine(0, j, 11*25, j);
		  }
		}
}