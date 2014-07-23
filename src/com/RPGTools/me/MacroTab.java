package com.RPGTools.me;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.google.gdata.util.ServiceException;

public class MacroTab
{
	private static JPanel Macros;
	public static ArrayList<JTextField> fieldsList;
	ArrayList<JButton> macroButtons = new ArrayList<JButton>();
	int BUTTON_COUNT = 0;

	public MacroTab() throws IOException, ServiceException
	{
		Macros = new JPanel();
		Macros.setPreferredSize(new Dimension(900, 900));
		Macros.setName("Macros");

		JButton newMacroButton = new JButton("Create New Macro");
		newMacroButton.addActionListener(new CreateNewMacroAction());
		Macros.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		Macros.add(newMacroButton);
	}

	public static JPanel getMacroPanel()
	{
		return Macros;
	}
	
	class CreateNewMacroAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			BUTTON_COUNT++;
			
			MacroButton newMacro = new MacroButton("New Macro " + BUTTON_COUNT);
			
			Macros.add(newMacro.getButton());
			macroButtons.add(newMacro.getButton());
			Macros.updateUI();
		}
	}
}
