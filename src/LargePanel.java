import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JToolTip;

public class LargePanel extends JPanel{
	
	
	private static final long serialVersionUID = 1L;
	public CardPanel[] th = new CardPanel[9];
	public JToolTip tip;
	public boolean panelCheck = false;
	private int width, height = 300;
	private boolean background;
	
	
	/**
	 * constructs large panel and cards to go in array
	 */
	public LargePanel(boolean back){
		setLayout(new GridLayout(3, 3));
		setPreferredSize(new Dimension(width, height));
		background = back;

		Container c = new Container();
		c.add(getPanel());
		setVisible(true);
	}
	
	/**
	 * creates and adds 9 cards to this large panel
	 * @return
	 */
	public JPanel getPanel(){
		CardPanel cp;
		for(int i = 0;i<9;i++){
			if(background == true){
				cp = new CardPanel(true, i);
				}
			else{
				cp = new CardPanel(false, i);
			}
			this.add(cp);
			th[i] = cp;
		}
		return this;
	}
	
	/**
	 * sets background color of this panel
	 * @param c
	 */
	public void setBackgroundColor(Color c){
		for(int i = 0;i<9;i++){
			th[i].setBackground(c);
		}
	}
	
	/**
	 * returns the list of cards in this panel
	 * @return
	 */
	public CardPanel[] getList(){
		return th;
	}

}
