package array.view;

import javax.swing.*;
import array.controller.ArrayController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HipsterPanel extends JPanel
{
	private ArrayController baseController;
	private JButton myButton;
	private JComboBox dropDown;
	private JLabel wordsLabel;
	private SpringLayout baseLayout;
	
	public HipsterPanel(ArrayController baseController)
	{
		super();
		this.baseController = baseController;
		myButton = new JButton("Click Here");
		wordsLabel = new JLabel("Such wods");
		baseLayout = new SpringLayout();

		dropDown = new JComboBox(baseController.getHipsters());
	
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(myButton);
		this.add(wordsLabel);
		this.add(dropDown);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, wordsLabel, 4, SpringLayout.NORTH, dropDown);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, wordsLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -10, SpringLayout.SOUTH, this);
	}
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerfomed(ActionEvent selection)
			{
				String selectedText = baseController.getWords()[dropDown.detSelectedIndex()];
				wordsLabel.setText(selectedText);
			}
		});
		
	}

}
