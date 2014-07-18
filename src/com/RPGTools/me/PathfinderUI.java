package com.RPGTools.me;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PathfinderUI extends JFrame
{
	public CharacterSpreadsheet cSpread;
	public JPanel Container;
	public static JTabbedPane TabPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					PathfinderUI frame = new PathfinderUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws ServiceException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public PathfinderUI() throws IOException, ServiceException, URISyntaxException
	{
		setPreferredSize(new Dimension(900, 900));
		initUI();
		cSpread = new CharacterSpreadsheet();
	}

	public void initUI() throws IOException, ServiceException, URISyntaxException
	{
		setBackground(Color.DARK_GRAY);
		setTitle("PathfinderUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 1000);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu characterMenu = new JMenu("Character");
		menuBar.add(characterMenu);

		JMenuItem saveCharacterMenuItem = new JMenuItem("Save Character");
		saveCharacterMenuItem.addActionListener(new SaveAction());
		
		JMenuItem loadCharacterMenuItem = new JMenuItem("Load Character");
		loadCharacterMenuItem.addActionListener(new LoadAction());
		
		characterMenu.add(saveCharacterMenuItem);
		characterMenu.add(loadCharacterMenuItem);
		
		Container = new JPanel();
		Container.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Container);
		Container.setLayout(new GridLayout(0, 1, 0, 0));

		TabPane = new JTabbedPane(JTabbedPane.TOP);
		Container.add(TabPane);

		CharacterSheetTab characterSheetTab = new CharacterSheetTab();
		TabPane.add(CharacterSheetTab.getSheetPanel());
		
		MacroTab macroTab = new MacroTab();
		TabPane.add(MacroTab.getMacroPanel());
	}
	
	class SaveAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				cSpread.saveCharacter();
			} catch (IOException | ServiceException | URISyntaxException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	class LoadAction implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				cSpread.loadCharacter("Roman");
			} catch (IOException | ServiceException | URISyntaxException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
