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
	
	public void editMacro(JButton button) throws IOException, ServiceException
	{
		System.out.println(button.getText());
		fieldsList = CharacterSheetTab.getFieldsList();
		EditMacroDialog newDialog = new EditMacroDialog();
		newDialog.setVisible(true);
	}
	
	class CreateNewMacroAction implements ActionListener
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
				try
				{
					editMacro((JButton)e.getSource());
				} catch (IOException | ServiceException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
