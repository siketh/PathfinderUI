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
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import com.google.gdata.util.ServiceException;

public class MacroTab
{
	private static JPanel Macros;
	ArrayList<JButton> macroButtons = new ArrayList<JButton>();
	int BUTTON_COUNT = 0;

	public MacroTab() throws IOException, ServiceException
	{
		Macros = new JPanel();
		Macros.setPreferredSize(new Dimension(900, 900));
		Macros.setName("Macros");

		JButton newMacroButton = new JButton("Create New Macro");
		newMacroButton.addActionListener(new CreateNewMacro());
		Macros.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		Macros.add(newMacroButton);
		
		// Temporary, just to see in windowbuilder
		BUTTON_COUNT++;
		JButton newMacro = new JButton("New Macro " + BUTTON_COUNT);
		newMacro.addMouseListener(new MouseAction());
		Macros.add(newMacro);
		macroButtons.add(newMacro);
		Macros.updateUI();
	}

	public static JPanel getMacroPanel()
	{
		return Macros;
	}
	
	public void editMacro(JButton button)
	{
		System.out.println(button.getText());

		JDialog editMacroDialog = new JDialog();
		editMacroDialog.setModal(true);
		editMacroDialog.setEnabled(true);
		editMacroDialog.setVisible(true);
		editMacroDialog.setSize(400, 400);
		
		JTextArea test = new JTextArea();
		editMacroDialog.add(test);
	}

	class CreateNewMacro implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			BUTTON_COUNT++;
			JButton newMacro = new JButton("New Macro " + BUTTON_COUNT);
			newMacro.addMouseListener(new MouseAction());
			Macros.add(newMacro);
			macroButtons.add(newMacro);
			Macros.updateUI();
		}
	}

	class MouseAction implements MouseListener
	{
		@Override
		public void mousePressed(MouseEvent e)
		{
			if (e.getButton() == MouseEvent.BUTTON1)
			{
				// Left Click
				System.out.println("Left Click = Peform Action");
			} 
			
			else if (e.getButton() == MouseEvent.BUTTON3)
			{
				// Right Click
				System.out.println("Right Click = Edit Action");
				editMacro((JButton)e.getSource());
			}
		}

		@Override
		public void mouseClicked(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0)
		{
			// TODO Auto-generated method stub

		}

	}
}
