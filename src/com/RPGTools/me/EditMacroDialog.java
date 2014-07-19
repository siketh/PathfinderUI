package com.RPGTools.me;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import com.google.gdata.util.ServiceException;

public class EditMacroDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Create the dialog.
	 * 
	 * @throws ServiceException
	 * @throws IOException
	 */
	public EditMacroDialog() throws IOException, ServiceException {
		setBounds(100, 100, 661, 392);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[][][][][][][][][][][][]",
				"[][][][][][][][][][][][][][]"));
		{
			Checkbox checkbox = new Checkbox("STR Score");
			contentPanel.add(checkbox, "cell 1 0");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 0");
		}
		{
			Checkbox checkbox = new Checkbox("Initiative");
			contentPanel.add(checkbox, "cell 3 0");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 4 0");
		}
		{
			Checkbox checkbox = new Checkbox("Total AC");
			contentPanel.add(checkbox, "cell 5 0");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 0");
		}
		{
			Checkbox checkbox = new Checkbox("Melee Attack Bonus");
			contentPanel.add(checkbox, "cell 7 0");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 8 0");
		}
		{
			Checkbox checkbox = new Checkbox("d2");
			contentPanel.add(checkbox, "cell 10 0");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 11 0");
		}
		{
			Checkbox checkbox = new Checkbox("DEX Score");
			contentPanel.add(checkbox, "cell 1 1");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 1");
		}
		{
			Checkbox checkbox = new Checkbox("Fortitude");
			contentPanel.add(checkbox, "cell 3 1");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 4 1");
		}
		{
			Checkbox checkbox = new Checkbox("Armor");
			contentPanel.add(checkbox, "cell 5 1");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 1");
		}
		{
			Checkbox checkbox = new Checkbox("CMB Attack Bonus");
			contentPanel.add(checkbox, "cell 7 1");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 8 1");
		}
		{
			Checkbox checkbox = new Checkbox("d3");
			contentPanel.add(checkbox, "cell 10 1");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 11 1");
		}
		{
			Checkbox checkbox = new Checkbox("INT Score");
			contentPanel.add(checkbox, "cell 1 2");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 2");
		}
		{
			Checkbox checkbox = new Checkbox("Reflex");
			contentPanel.add(checkbox, "cell 3 2");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 4 2");
		}
		{
			Checkbox checkbox = new Checkbox("Shield");
			contentPanel.add(checkbox, "cell 5 2");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 2");
		}
		{
			Checkbox checkbox = new Checkbox("Ranged Attack Bonus");
			contentPanel.add(checkbox, "cell 7 2");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 8 2");
		}
		{
			Checkbox checkbox = new Checkbox("d4");
			contentPanel.add(checkbox, "cell 10 2");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 11 2");
		}
		{
			Checkbox checkbox = new Checkbox("WIS Score");
			contentPanel.add(checkbox, "cell 1 3");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 3");
		}
		{
			Checkbox checkbox = new Checkbox("Will");
			contentPanel.add(checkbox, "cell 3 3");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 4 3");
		}
		{
			Checkbox checkbox = new Checkbox("Dodge");
			contentPanel.add(checkbox, "cell 5 3");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 3");
		}
		{
			Checkbox checkbox = new Checkbox("d6");
			contentPanel.add(checkbox, "cell 10 3");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 11 3");
		}
		{
			Checkbox checkbox = new Checkbox("CHA Score");
			contentPanel.add(checkbox, "cell 1 4");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 4");
		}
		{
			Checkbox checkbox = new Checkbox("Total HP");
			contentPanel.add(checkbox, "cell 3 4");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 4 4");
		}
		{
			Checkbox checkbox = new Checkbox("Size Mod");
			contentPanel.add(checkbox, "cell 5 4");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 4");
		}
		{
			Checkbox checkbox = new Checkbox("d8");
			contentPanel.add(checkbox, "cell 10 4");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 11 4");
		}
		{
			Checkbox checkbox = new Checkbox("STR Mod");
			contentPanel.add(checkbox, "cell 1 5");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 5");
		}
		{
			Checkbox checkbox = new Checkbox("Current HP");
			contentPanel.add(checkbox, "cell 3 5");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 4 5");
		}
		{
			Checkbox checkbox = new Checkbox("Natural");
			contentPanel.add(checkbox, "cell 5 5");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 5");
		}
		{
			Checkbox checkbox = new Checkbox("d10");
			contentPanel.add(checkbox, "cell 10 5");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 11 5");
		}
		{
			Checkbox checkbox = new Checkbox("DEX Mod");
			contentPanel.add(checkbox, "cell 1 6");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 6");
		}
		{
			Checkbox checkbox = new Checkbox("DR");
			contentPanel.add(checkbox, "cell 3 6");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 4 6");
		}
		{
			Checkbox checkbox = new Checkbox("Deflect");
			contentPanel.add(checkbox, "cell 5 6");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 6");
		}
		{
			Checkbox checkbox = new Checkbox("d20");
			contentPanel.add(checkbox, "cell 10 6");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 11 6");
		}
		{
			Checkbox checkbox = new Checkbox("INT Mod");
			contentPanel.add(checkbox, "cell 1 7");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 7");
		}
		{
			Checkbox checkbox = new Checkbox("Misc AC");
			contentPanel.add(checkbox, "cell 5 7");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 7");
		}
		{
			Checkbox checkbox = new Checkbox("WIS Mod");
			contentPanel.add(checkbox, "cell 1 8");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 8");
		}
		{
			Checkbox checkbox = new Checkbox("Touch AC");
			contentPanel.add(checkbox, "cell 5 8");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 8");
		}
		{
			Checkbox checkbox = new Checkbox("CHA Mod");
			contentPanel.add(checkbox, "cell 1 9");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 2 9");
		}
		{
			Checkbox checkbox = new Checkbox("CMD ");
			contentPanel.add(checkbox, "cell 5 9");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 9");
		}
		{
			Checkbox checkbox = new Checkbox("Flat Footed AC");
			contentPanel.add(checkbox, "cell 5 10");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 10");
		}
		{
			Checkbox checkbox = new Checkbox("FCMD");
			contentPanel.add(checkbox, "cell 5 11");
		}
		{
			JSpinner spinner = new JSpinner();
			contentPanel.add(spinner, "cell 6 11");
		}
		{

			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));

			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel lblNewLabel = new JLabel("Macro Name");
				buttonPane.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				buttonPane.add(textField);
				textField.setColumns(10);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}

			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}

		}
	}
}
