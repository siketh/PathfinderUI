package com.RPGTools.me;

import java.awt.Checkbox;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;

import com.google.gdata.util.ServiceException;

public class MacroButton extends JButton
{	
	public static JButton button;
	public static ArrayList<Checkbox> checkedList;
	public static int sum;
	
	public MacroButton(String name) {
		button = new JButton(name);
		checkedList = new ArrayList<Checkbox>();
		button.addMouseListener(new MouseAction());
		sum = 0;
	}
	
	public void editMacro(JButton edit) throws IOException, ServiceException
	{
		System.out.println(edit.getText());
		EditMacroDialog newDialog = new EditMacroDialog(this);
		newDialog.setVisible(true);
	}
	
	public void calculateValue(ArrayList<Checkbox> tagged)
	{
		
	}
	
	public JButton getButton()
	{
		return button;
	}
	
	public ArrayList<Checkbox> getCheckedList()
	{
		return checkedList;
	}
	
	public void setCheckedList(ArrayList<Checkbox> list)
	{
		checkedList = list;
	}
	
	public void setMacroName(String name)
	{
		button.setText(name);
		
	}

	class MouseAction implements MouseListener {
		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				// Left Click
				System.out.println("Left Click = Peform Action");
			}

			else if (e.getButton() == MouseEvent.BUTTON3) {
				// Right Click
				System.out.println("Right Click = Edit Action");
				try {
					editMacro((JButton)e.getSource());
				} catch (IOException | ServiceException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}
}
