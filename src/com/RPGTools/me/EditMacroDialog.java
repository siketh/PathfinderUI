package com.RPGTools.me;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

import com.google.gdata.util.ServiceException;

public class EditMacroDialog extends JDialog
		implements
			ItemListener,
			ActionListener {

	private JPanel contentPanel = new JPanel();
	private JTextField macroNameField;
	private ArrayList<Checkbox> checkboxesList;
	private JButton okButton;
	private JButton cancelButton;
	private MacroButton edittedMacro;
	private ArrayList<JTextField> fieldsList = CharacterSheetTab
			.getFieldsList();

	/**
	 * Create the dialog.
	 * 
	 * @throws ServiceException
	 * @throws IOException
	 */
	public EditMacroDialog(MacroButton macro) throws IOException,
			ServiceException {
		checkboxesList = new ArrayList<Checkbox>();
		initDialogUI();

		if (macro.getCheckedList().isEmpty() == false) {
			for (int i = 0; i < checkboxesList.size(); i++)
				checkboxesList.get(i).setState(
						macro.getCheckedList().get(i).getState());
		}

		edittedMacro = macro;
		macroNameField.setText(macro.getButton().getText());
		contentPanel.updateUI();
	}

	public void initDialogUI() {
		setBounds(100, 100, 661, 605);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[][][][][]", "[]"));
		{
			JPanel abilityPanel = new JPanel();
			abilityPanel.setBorder(new TitledBorder(null, "Abilities",
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(abilityPanel, "cell 0 0,grow");
			abilityPanel.setLayout(new MigLayout("", "[]",
					"[][][][][][][][][][]"));
			{
				Checkbox strScoreChk = new Checkbox("STR Score");
				strScoreChk.setName("strScoreField");
				checkboxesList.add(strScoreChk);
				abilityPanel.add(strScoreChk, "cell 0 0");
			}
			{
				Checkbox dexScoreChk = new Checkbox("DEX Score");
				dexScoreChk.setName("dexScoreField");
				checkboxesList.add(dexScoreChk);
				abilityPanel.add(dexScoreChk, "cell 0 1");
			}
			{
				Checkbox intScoreChk = new Checkbox("INT Score");
				intScoreChk.setName("intScoreField");
				checkboxesList.add(intScoreChk);
				abilityPanel.add(intScoreChk, "cell 0 2");
			}
			{
				Checkbox wisScoreChk = new Checkbox("WIS Score");
				wisScoreChk.setName("wisScoreField");
				checkboxesList.add(wisScoreChk);
				abilityPanel.add(wisScoreChk, "cell 0 3");
			}
			{
				Checkbox chaScoreChk = new Checkbox("CHA Score");
				chaScoreChk.setName("chaScoreField");
				checkboxesList.add(chaScoreChk);
				abilityPanel.add(chaScoreChk, "cell 0 4");
			}
			{
				Checkbox strModChk = new Checkbox("STR Mod");
				strModChk.setName("strModField");
				checkboxesList.add(strModChk);
				abilityPanel.add(strModChk, "cell 0 5");
			}
			{
				Checkbox dexModChk = new Checkbox("DEX Mod");
				dexModChk.setName("dexModField");
				checkboxesList.add(dexModChk);
				abilityPanel.add(dexModChk, "cell 0 6");
			}
			{
				Checkbox intModChk = new Checkbox("INT Mod");
				intModChk.setName("intModField");
				checkboxesList.add(intModChk);
				abilityPanel.add(intModChk, "cell 0 7");
			}
			{
				Checkbox wisModChk = new Checkbox("WIS Mod");
				wisModChk.setName("wisModField");
				checkboxesList.add(wisModChk);
				abilityPanel.add(wisModChk, "cell 0 8");
			}
			{
				Checkbox chaModChk = new Checkbox("CHA Mod");
				chaModChk.setName("chaModField");
				checkboxesList.add(chaModChk);
				abilityPanel.add(chaModChk, "cell 0 9");
			}
		}
		{
			JPanel miscPanel = new JPanel();
			miscPanel.setBorder(new TitledBorder(null, "Misc",
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(miscPanel, "cell 1 0,grow");
			miscPanel.setLayout(new MigLayout("", "[]", "[][][][][][][]"));
			{
				Checkbox initChk = new Checkbox("Initiative");
				checkboxesList.add(initChk);
				miscPanel.add(initChk, "cell 0 0");
			}
			{
				Checkbox fortChk = new Checkbox("Fortitude");
				checkboxesList.add(fortChk);
				miscPanel.add(fortChk, "cell 0 1");
			}
			{
				Checkbox refChk = new Checkbox("Reflex");
				checkboxesList.add(refChk);
				miscPanel.add(refChk, "cell 0 2");
			}
			{
				Checkbox wilChk = new Checkbox("Will");
				checkboxesList.add(wilChk);
				miscPanel.add(wilChk, "cell 0 3");
			}
			{
				Checkbox totalHPChk = new Checkbox("Total HP");
				checkboxesList.add(totalHPChk);
				miscPanel.add(totalHPChk, "cell 0 4");
			}
			{
				Checkbox currHPChk = new Checkbox("Current HP");
				checkboxesList.add(currHPChk);
				miscPanel.add(currHPChk, "cell 0 5");
			}
			{
				Checkbox drChk = new Checkbox("DR");
				checkboxesList.add(drChk);
				miscPanel.add(drChk, "cell 0 6");
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "AC", TitledBorder.LEADING,
					TitledBorder.TOP, null, null));
			contentPanel.add(panel, "cell 2 0,grow");
			panel.setLayout(new MigLayout("", "[]", "[][][][][][][][][][][][]"));
			{
				Checkbox totalACChk = new Checkbox("Total AC");
				checkboxesList.add(totalACChk);
				panel.add(totalACChk, "cell 0 0");
			}
			{
				Checkbox armorChk = new Checkbox("Armor");
				checkboxesList.add(armorChk);
				panel.add(armorChk, "cell 0 1");
			}
			{
				Checkbox shieldChk = new Checkbox("Shield");
				checkboxesList.add(shieldChk);
				panel.add(shieldChk, "cell 0 2");
			}
			{
				Checkbox dodgeChk = new Checkbox("Dodge");
				checkboxesList.add(dodgeChk);
				panel.add(dodgeChk, "cell 0 3");
			}
			{
				Checkbox sizeModChk = new Checkbox("Size Mod");
				checkboxesList.add(sizeModChk);
				panel.add(sizeModChk, "cell 0 4");
			}
			{
				Checkbox naturalChk = new Checkbox("Natural");
				checkboxesList.add(naturalChk);
				panel.add(naturalChk, "cell 0 5");
			}
			{
				Checkbox deflectChk = new Checkbox("Deflect");
				checkboxesList.add(deflectChk);
				panel.add(deflectChk, "cell 0 6");
			}
			{
				Checkbox miscACChk = new Checkbox("Misc AC");
				checkboxesList.add(miscACChk);
				panel.add(miscACChk, "cell 0 7");
			}
			{
				Checkbox touchACChk = new Checkbox("Touch AC");
				checkboxesList.add(touchACChk);
				panel.add(touchACChk, "cell 0 8");
			}
			{
				Checkbox cmdChk = new Checkbox("CMD ");
				checkboxesList.add(cmdChk);
				panel.add(cmdChk, "cell 0 9");
			}
			{
				Checkbox ffACChk = new Checkbox("Flat Footed AC");
				checkboxesList.add(ffACChk);
				panel.add(ffACChk, "cell 0 10");
			}
			{
				Checkbox fcmdChk = new Checkbox("FCMD");
				checkboxesList.add(fcmdChk);
				panel.add(fcmdChk, "cell 0 11");
			}
		}
		{
			JPanel attackBonusPanel = new JPanel();
			attackBonusPanel.setBorder(new TitledBorder(null, "Attack Bonus",
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(attackBonusPanel, "cell 3 0,grow");
			attackBonusPanel.setLayout(new MigLayout("", "[]", "[][][]"));
			{
				Checkbox meleeABChk = new Checkbox("Melee Attack Bonus");
				checkboxesList.add(meleeABChk);
				attackBonusPanel.add(meleeABChk, "cell 0 0");
			}
			{
				Checkbox cmbABChk = new Checkbox("CMB Attack Bonus");
				checkboxesList.add(cmbABChk);
				attackBonusPanel.add(cmbABChk, "cell 0 1");
			}
			{
				Checkbox rangedABChk = new Checkbox("Ranged Attack Bonus");
				checkboxesList.add(rangedABChk);
				attackBonusPanel.add(rangedABChk, "cell 0 2");
			}
		}
		{
			JPanel diePanel = new JPanel();
			diePanel.setBorder(new TitledBorder(null, "Die",
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(diePanel, "cell 4 0,grow");
			diePanel.setLayout(new MigLayout("", "[]", "[][][][][][][]"));
			{
				Checkbox d2Chk = new Checkbox("d2");
				checkboxesList.add(d2Chk);
				diePanel.add(d2Chk, "cell 0 0");
			}
			{
				Checkbox d3Chk = new Checkbox("d3");
				checkboxesList.add(d3Chk);
				diePanel.add(d3Chk, "cell 0 1");
			}
			{
				Checkbox d4Chk = new Checkbox("d4");
				checkboxesList.add(d4Chk);
				diePanel.add(d4Chk, "cell 0 2");
			}
			{
				Checkbox d6Chk = new Checkbox("d6");
				checkboxesList.add(d6Chk);
				diePanel.add(d6Chk, "cell 0 3");
			}
			{
				Checkbox d8Chk = new Checkbox("d8");
				checkboxesList.add(d8Chk);
				diePanel.add(d8Chk, "cell 0 4");
			}
			{
				Checkbox d10Chk = new Checkbox("d10");
				checkboxesList.add(d10Chk);
				diePanel.add(d10Chk, "cell 0 5");
			}
			{
				Checkbox d20Chk = new Checkbox("d20");
				checkboxesList.add(d20Chk);
				diePanel.add(d20Chk, "cell 0 6");
			}
		}
		{

			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));

			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel macroNameLabel = new JLabel("Macro Name");
				buttonPane.add(macroNameLabel);
			}
			{
				macroNameField = new JTextField();
				buttonPane.add(macroNameField);
				macroNameField.setColumns(10);
			}
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.addActionListener(this);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}

			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}

		}

		for (int i = 0; i < checkboxesList.size(); i++)
			checkboxesList.get(i).addItemListener(this);
	}

	public int getFieldValue(String fieldName) {
		int value = -99;

		for (int i = 0; i < fieldsList.size(); i++) {
			if (fieldsList.get(i).getDocument().getProperty("Field") == fieldName)
				return Integer.parseInt(fieldsList.get(i).getText());
		}

		return value;
	}

	public int rollDie(int die) {
		Random rand = new Random();
		return rand.nextInt(die);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == okButton) {
			edittedMacro.setCheckedList(checkboxesList);
			edittedMacro.setMacroName(macroNameField.getText());
			dispose();
		}

		else if (e.getSource() == cancelButton) {
			dispose();
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		for(int i=0; i<checkboxesList.size(); i++)
		{
			if(e.getItem().toString() == checkboxesList.get(i).getLabel())
			{
				System.out.println(checkboxesList.get(i).getName());
				System.out.println(getFieldValue(checkboxesList.get(i).getName()));
			}
				
		}
	}
}
