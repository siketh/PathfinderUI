package com.RPGTools.me;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.google.gdata.util.ServiceException;

public class MacroTab implements ActionListener
{
	private JPanel Macros;
	public static ArrayList<JTextField> fieldsList;
	public ArrayList<JButton> macroButtons;
	int BUTTON_COUNT = 0;

	public MacroTab() throws IOException, ServiceException
	{
		macroButtons = new ArrayList<JButton>();
		initMacroTab();
	}
	
	private void initMacroTab()
	{
		Macros = new JPanel();
		Macros.setPreferredSize(new Dimension(900, 900));
		Macros.setName("Macros");

		JButton newMacroButton = new JButton("Create New Macro");
		newMacroButton.addActionListener(this);
		Macros.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		Macros.add(newMacroButton);
	}

	public JPanel getMacroPanel()
	{
		return Macros;
	}
	

	public void actionPerformed(ActionEvent e)
	{
		BUTTON_COUNT++;
			
		MacroButton newMacro = new MacroButton("New Macro " + BUTTON_COUNT);
			
		Macros.add(newMacro.getButton());
		macroButtons.add(newMacro.getButton());
		Macros.updateUI();
	}
}
