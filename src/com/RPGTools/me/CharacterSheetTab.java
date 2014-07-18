package com.RPGTools.me;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import net.miginfocom.swing.MigLayout;

import com.google.gdata.util.ServiceException;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Dimension;

public class CharacterSheetTab extends JFrame implements ActionListener
{

	ArrayList<JTextField> STRList = new ArrayList<JTextField>();
	ArrayList<JTextField> DEXList = new ArrayList<JTextField>();
	ArrayList<JTextField> CONList = new ArrayList<JTextField>();
	ArrayList<JTextField> INTList = new ArrayList<JTextField>();
	ArrayList<JTextField> WISList = new ArrayList<JTextField>();
	ArrayList<JTextField> CHAList = new ArrayList<JTextField>();
	ArrayList<JTextField> initList = new ArrayList<JTextField>();
	ArrayList<JTextField> fortList = new ArrayList<JTextField>();
	ArrayList<JTextField> refList = new ArrayList<JTextField>();
	ArrayList<JTextField> wilList = new ArrayList<JTextField>();
	ArrayList<JTextField> acList = new ArrayList<JTextField>();
	ArrayList<JTextField> abMeleeList = new ArrayList<JTextField>();
	ArrayList<JTextField> abRangedList = new ArrayList<JTextField>();
	ArrayList<JTextField> abCMBList = new ArrayList<JTextField>();
	static ArrayList<JTextField> fieldsList = new ArrayList<JTextField>();
	private static JPanel Sheet;
	private JTextField hpDRField;
	private JTextField strTempSField;
	private JTextField strModField;
	private JTextField dexModField;
	private JTextField dexTempSField;
	private JTextField conModField;
	private JTextField conTempSField;
	private JTextField intModField;
	private JTextField intTempSField;
	private JTextField chaModField;
	private JTextField chaTempSField;
	private JTextField wisModField;
	private JTextField wisTempSField;
	private JTextField strScoreField;
	private JTextField dexScoreField;
	private JTextField conScoreField;
	private JTextField intScoreField;
	private JTextField wisScoreField;
	private JTextField chaScoreField;
	private JTextField strTempMField;
	private JTextField dexTempMField;
	private JTextField conTempMField;
	private JTextField intTempMField;
	private JTextField chaTempMField;
	private JTextField wisTempMField;
	private JTextField hpHitDieField;
	private JTextField hpNonlethalField;
	private JTextField hpCurrentField;
	private JTextField hpTotalField;
	private JLabel abilityScoreField;
	private JLabel abilityModLabel;
	private JLabel abilityTempSLabel;
	private JLabel abilityTempMLabel;
	private JLabel hpTotalLabel;
	private JLabel hpCurrentLabel;
	private JLabel hpNonLethalLabel;
	private JLabel hpHitDieLabel;
	private JLabel hpDRLabel;
	private JTextField acTotalField;
	private JTextField acShieldField;
	private JTextField acDexField;
	private JLabel acTotalLabel;
	private JTextField acArmorField;
	private JLabel acArmorLabel;
	private JLabel acShieldLabel;
	private JLabel acDexLabel;
	private JLabel acDodgeLabel;
	private JLabel acSizeLabel;
	private JLabel acNaturalLabel;
	private JLabel acDeflectLabel;
	private JLabel acMiscLabel;
	private JTextField acDodgeField;
	private JTextField acSizeField;
	private JTextField acNaturalField;
	private JTextField acDeflectField;
	private JTextField acMiscField;
	private JLabel acPlus10Label;
	private JLabel acTouchLabel;
	private JLabel acCMDLabel;
	private JLabel acFlatFootedLabel;
	private JLabel acFCMDLabel;
	private JTextField acTouchField;
	private JTextField acCMDField;
	private JTextField acFlatFootedField;
	private JTextField acFCMDField;
	private JLabel initLabel;
	private JTextField initTotalField;
	private JLabel initTotalLabel;
	private JLabel initDexLabel;
	private JLabel initMiscLabel;
	private JTextField initDexField;
	private JTextField initMiscField;
	private JPanel Right;
	private JPanel HP;
	private JPanel AC;
	private JPanel Abilities;
	private JPanel Initiative;
	private JLabel stFortLabel;
	private JLabel stRefLabel;
	private JLabel stWillLabel;
	private JTextField stFortTempField;
	private JTextField stRefTempField;
	private JTextField stWilTempField;
	private JTextField stFortMiscField;
	private JTextField stRefMiscField;
	private JTextField stWilMiscField;
	private JTextField stFortMagicField;
	private JTextField stFortAbilityField;
	private JTextField stFortBaseField;
	private JTextField stFortTotalField;
	private JTextField stRefTotalField;
	private JTextField stRefBaseField;
	private JTextField stRefAbilityField;
	private JTextField stRefMagicField;
	private JTextField stWilTotalField;
	private JTextField stWilBaseField;
	private JTextField stWilAbilityField;
	private JTextField stWilMagicField;
	private JPanel SavingThrows;
	private JLabel stTotalLabel;
	private JLabel stBaseLabel;
	private JLabel stAbilityModLabel;
	private JLabel stMagicModLabel;
	private JLabel stMiscModLabel;
	private JLabel stTempModLabel;
	private JTextField lightLoadField;
	private JTextField mediumLoadField;
	private JTextField maxLoadField;
	private JTextField overHeadLoadField;
	private JTextField offGroundLoadField;
	private JTextField pushDragLoadField;
	private JLabel lightLoadLabel;
	private JLabel mediumLoadLabel;
	private JLabel maxLoadLabel;
	private JLabel overheadLoadLabel;
	private JLabel offGroundLoadLabel;
	private JLabel pushDragLoadLabel;
	private JPanel Loads;
	private JPanel AttackBonus;
	private JTextField abMeleeTotalField;
	private JTextField abMeleeBaseField;
	private JTextField abMeleeStrField;
	private JTextField abMeleeSizeField;
	private JTextField abMeleeMiscField;
	private JTextField abMeleeTempField;
	private JTextField abCMBTotalField;
	private JTextField abCMBBaseField;
	private JTextField abCMBStrField;
	private JTextField abCMBSizeField;
	private JTextField abCMBMiscField;
	private JTextField abCMBTempField;
	private JTextField abRangedTotalField;
	private JTextField abRangedBaseField;
	private JTextField abRangedStrField;
	private JTextField abRangedSizeField;
	private JTextField abRangedMiscField;
	private JTextField abRangedTempField;
	private JLabel abTotalLabel;
	private JLabel label_1;
	private JLabel abBaseLabel;
	private JLabel abStrModLabel;
	private JLabel abSizeModLabel;
	private JLabel abMiscModLabel;
	private JLabel abTempModLabel;
	private JLabel abMeleeLabel;
	private JLabel abCMBLabel;
	private JLabel abRangedLabel;
	private JTextField speedField;
	private JPanel Speed;
	private JLabel speedLabel;
	private JLabel armorTypeLabel;
	private JTextField armorTypeField;
	private JPanel TopLeft;
	private JPanel TopRight;
	private JTextField characterNameField;
	private JLabel nameLabel;
	private JTextField characterLevelField;
	private JTextField characterClassField;
	private JTextField characterRaceField;
	private JTextField characterAgeField;
	private JLabel levelLabel;
	private JLabel classLabel;
	private JLabel raceLabel;
	private JLabel ageLabel;
	private JLabel genderLabel;
	private JTextField characterGenderField;
	private JLabel sizeLabel;
	private JTextField characterSizeField;
	private JLabel heightLabel;
	private JLabel weightLabel;
	private JLabel hairLabel;
	private JLabel eyeLabel;
	private JTextField characterHairField;
	private JTextField characterEyesField;
	private JTextField characterHeightField;
	private JTextField characterWeightField;
	private JLabel alignmentLabel;
	private JLabel deityLabel;
	private JTextField characterAlignmentField;
	private JTextField characterDeityField;
	private JPanel Character;

	public CharacterSheetTab() throws IOException, ServiceException
	{
		Sheet = new JPanel();
		Sheet.setPreferredSize(new Dimension(900, 900));
		Sheet.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("437px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("474px"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("143px"),
				FormFactory.NARROW_LINE_GAP_ROWSPEC, RowSpec.decode("467px"), }));
		Sheet.setName("Sheet");

		TopLeft = new JPanel();
		Sheet.add(TopLeft, "2, 2, fill, fill");
		TopLeft.setLayout(new GridLayout(0, 1, 0, 0));

		Character = new JPanel();
		Character.setBorder(new TitledBorder(null, "Character",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		TopLeft.add(Character);
		Character.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.UNRELATED_GAP_COLSPEC, ColumnSpec.decode("47px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("86px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("31px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("86px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("35px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("86px"), }, new RowSpec[] {
				RowSpec.decode("20px"), FormFactory.NARROW_LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"), FormFactory.NARROW_LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"), FormFactory.NARROW_LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"), FormFactory.NARROW_LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"), }));

		nameLabel = new JLabel("Name");
		Character.add(nameLabel, "2, 1, left, center");

		characterNameField = new JTextField();
		Character.add(characterNameField, "4, 1, fill, top");
		characterNameField.setColumns(10);

		levelLabel = new JLabel("Level");
		Character.add(levelLabel, "6, 1, left, center");

		characterLevelField = new JTextField();
		Character.add(characterLevelField, "8, 1, fill, top");
		characterLevelField.setColumns(10);

		classLabel = new JLabel("Class");
		Character.add(classLabel, "10, 1, left, center");

		characterClassField = new JTextField();
		Character.add(characterClassField, "12, 1, fill, top");
		characterClassField.setColumns(10);

		raceLabel = new JLabel("Race");
		Character.add(raceLabel, "2, 3, left, center");

		characterRaceField = new JTextField();
		Character.add(characterRaceField, "4, 3, fill, top");
		characterRaceField.setColumns(10);

		ageLabel = new JLabel("Age");
		Character.add(ageLabel, "6, 3, left, center");

		characterAgeField = new JTextField();
		Character.add(characterAgeField, "8, 3, fill, top");
		characterAgeField.setColumns(10);

		genderLabel = new JLabel("Gender");
		Character.add(genderLabel, "10, 3, left, center");

		characterGenderField = new JTextField();
		Character.add(characterGenderField, "12, 3, fill, top");
		characterGenderField.setColumns(10);

		sizeLabel = new JLabel("Size");
		Character.add(sizeLabel, "2, 5, left, center");

		characterSizeField = new JTextField();
		Character.add(characterSizeField, "4, 5, fill, top");
		characterSizeField.setColumns(10);

		heightLabel = new JLabel("Height");
		Character.add(heightLabel, "6, 5, left, center");

		characterHeightField = new JTextField();
		Character.add(characterHeightField, "8, 5, fill, top");
		characterHeightField.setColumns(10);

		weightLabel = new JLabel("Weight");
		Character.add(weightLabel, "10, 5, left, center");

		characterWeightField = new JTextField();
		Character.add(characterWeightField, "12, 5, fill, top");
		characterWeightField.setColumns(10);

		hairLabel = new JLabel("Hair");
		Character.add(hairLabel, "2, 7, left, center");

		characterHairField = new JTextField();
		Character.add(characterHairField, "4, 7, fill, top");
		characterHairField.setColumns(10);

		eyeLabel = new JLabel("Eyes");
		Character.add(eyeLabel, "6, 7, left, center");

		characterEyesField = new JTextField();
		Character.add(characterEyesField, "8, 7, fill, top");
		characterEyesField.setColumns(10);

		alignmentLabel = new JLabel("Alignment");
		Character.add(alignmentLabel, "2, 9, left, center");

		characterAlignmentField = new JTextField();
		Character.add(characterAlignmentField, "4, 9, fill, top");
		characterAlignmentField.setColumns(10);

		deityLabel = new JLabel("Deity");
		Character.add(deityLabel, "6, 9, left, center");

		characterDeityField = new JTextField();
		Character.add(characterDeityField, "8, 9, fill, top");
		characterDeityField.setColumns(10);

		TopRight = new JPanel();
		Sheet.add(TopRight, "4, 2, fill, fill");

		JPanel Left = new JPanel();
		Sheet.add(Left, "2, 4, fill, fill");
		Left.setLayout(new MigLayout("", "[grow]", "[193px][63px][][125px][]"));

		Abilities = new JPanel();
		Abilities.setBorder(new TitledBorder(null, "Abilities",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Left.add(Abilities, "cell 0 0,grow");
		Abilities.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("20dlu:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("20dlu:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("20dlu:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("20dlu:grow"), }, new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, }));

		abilityScoreField = new JLabel("Score");
		Abilities.add(abilityScoreField, "3, 1");

		abilityModLabel = new JLabel("Mod");
		abilityModLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Abilities.add(abilityModLabel, "5, 1");

		abilityTempSLabel = new JLabel("Tmp S");
		Abilities.add(abilityTempSLabel, "7, 1");

		abilityTempMLabel = new JLabel("Tmp M");
		Abilities.add(abilityTempMLabel, "9, 1");

		JLabel abilityStrLabel = new JLabel("STR");
		Abilities.add(abilityStrLabel, "1, 3, right, default");

		strScoreField = new JFormattedTextField();
		strScoreField.getDocument().addDocumentListener(new FieldUpdater());
		strScoreField.getDocument().putProperty("Field", "strScoreField");
		Abilities.add(strScoreField, "3, 3, fill, default");
		strScoreField.setColumns(10);

		strModField = new JFormattedTextField();
		strModField.setEditable(false);
		STRList.add(strModField);
		Abilities.add(strModField, "5, 3, fill, default");
		strModField.setColumns(10);

		strTempSField = new JFormattedTextField();
		Abilities.add(strTempSField, "7, 3, fill, default");
		strTempSField.setColumns(10);

		strTempMField = new JFormattedTextField();
		Abilities.add(strTempMField, "9, 3, fill, default");
		strTempMField.setColumns(10);

		JLabel abilityDexLabel = new JLabel("DEX");
		Abilities.add(abilityDexLabel, "1, 5, right, default");

		dexScoreField = new JFormattedTextField();
		dexScoreField.getDocument().addDocumentListener(new FieldUpdater());
		dexScoreField.getDocument().putProperty("Field", "dexScoreField");
		Abilities.add(dexScoreField, "3, 5, fill, default");
		dexScoreField.setColumns(10);

		dexModField = new JFormattedTextField();
		dexModField.setEditable(false);
		DEXList.add(dexModField);
		Abilities.add(dexModField, "5, 5, fill, default");
		dexModField.setColumns(10);

		dexTempSField = new JFormattedTextField();
		Abilities.add(dexTempSField, "7, 5, fill, default");
		dexTempSField.setColumns(10);

		dexTempMField = new JFormattedTextField();
		Abilities.add(dexTempMField, "9, 5, fill, default");
		dexTempMField.setColumns(10);

		JLabel abilityConLabel = new JLabel("CON");
		Abilities.add(abilityConLabel, "1, 7, right, default");

		conScoreField = new JFormattedTextField();
		conScoreField.getDocument().addDocumentListener(new FieldUpdater());
		conScoreField.getDocument().putProperty("Field", "conScoreField");
		Abilities.add(conScoreField, "3, 7, fill, default");
		conScoreField.setColumns(10);

		conModField = new JFormattedTextField();
		conModField.setEditable(false);
		Abilities.add(conModField, "5, 7, fill, default");
		conModField.setColumns(10);

		conTempSField = new JFormattedTextField();
		Abilities.add(conTempSField, "7, 7, fill, default");
		conTempSField.setColumns(10);

		conTempMField = new JFormattedTextField();
		CONList.add(conModField);
		Abilities.add(conTempMField, "9, 7, fill, default");
		conTempMField.setColumns(10);

		JLabel abilityIntLabel = new JLabel("INT");
		Abilities.add(abilityIntLabel, "1, 9, right, default");

		intScoreField = new JFormattedTextField();
		intScoreField.getDocument().addDocumentListener(new FieldUpdater());
		intScoreField.getDocument().putProperty("Field", "intScoreField");
		Abilities.add(intScoreField, "3, 9, fill, default");
		intScoreField.setColumns(10);

		intModField = new JFormattedTextField();
		intModField.setEditable(false);
		INTList.add(intModField);
		Abilities.add(intModField, "5, 9, fill, default");
		intModField.setColumns(10);

		intTempSField = new JFormattedTextField();
		Abilities.add(intTempSField, "7, 9, fill, default");
		intTempSField.setColumns(10);

		intTempMField = new JFormattedTextField();
		Abilities.add(intTempMField, "9, 9, fill, default");
		intTempMField.setColumns(10);

		JLabel abilityWisLabel = new JLabel("WIS");
		Abilities.add(abilityWisLabel, "1, 11, right, default");

		wisScoreField = new JFormattedTextField();
		wisScoreField.getDocument().addDocumentListener(new FieldUpdater());
		wisScoreField.getDocument().putProperty("Field", "wisScoreField");
		Abilities.add(wisScoreField, "3, 11, fill, default");
		wisScoreField.setColumns(10);

		wisModField = new JFormattedTextField();
		wisModField.setEditable(false);
		WISList.add(wisModField);
		Abilities.add(wisModField, "5, 11, fill, default");
		wisModField.setColumns(10);

		wisTempSField = new JFormattedTextField();
		Abilities.add(wisTempSField, "7, 11, fill, default");
		wisTempSField.setColumns(10);

		wisTempMField = new JFormattedTextField();
		Abilities.add(wisTempMField, "9, 11, fill, default");
		wisTempMField.setColumns(10);

		JLabel abilityChaLabel = new JLabel("CHA");
		Abilities.add(abilityChaLabel, "1, 13, right, default");

		chaScoreField = new JFormattedTextField();
		chaScoreField.getDocument().addDocumentListener(new FieldUpdater());
		chaScoreField.getDocument().putProperty("Field", "chaScoreField");
		Abilities.add(chaScoreField, "3, 13, fill, default");
		chaScoreField.setColumns(10);

		chaModField = new JFormattedTextField();
		chaModField.setEditable(false);
		CHAList.add(chaModField);
		Abilities.add(chaModField, "5, 13, fill, default");
		chaModField.setColumns(10);

		chaTempSField = new JFormattedTextField();
		Abilities.add(chaTempSField, "7, 13, fill, default");
		chaTempSField.setColumns(10);

		chaTempMField = new JFormattedTextField();
		Abilities.add(chaTempMField, "9, 13, fill, default");
		chaTempMField.setColumns(10);

		Initiative = new JPanel();
		Initiative.setBorder(new TitledBorder(null, "Initiative",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Left.add(Initiative, "cell 0 1,grow");
		Initiative.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("20dlu:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("20dlu:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("20dlu:grow"), }, new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, }));

		initTotalLabel = new JLabel("TOTAL");
		initTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		Initiative.add(initTotalLabel, "3, 1");

		initDexLabel = new JLabel("Dex");
		Initiative.add(initDexLabel, "5, 1");

		initMiscLabel = new JLabel("Misc");
		Initiative.add(initMiscLabel, "7, 1");

		initLabel = new JLabel("INIT");
		Initiative.add(initLabel, "1, 3, right, default");

		initTotalField = new JFormattedTextField();
		Initiative.add(initTotalField, "3, 3, fill, default");
		initTotalField.setColumns(10);

		initDexField = new JFormattedTextField();
		initDexField.setEditable(false);
		DEXList.add(initDexField);
		initList.add(initDexField);
		Initiative.add(initDexField, "5, 3, fill, default");
		initDexField.setColumns(10);
		initDexField.getDocument().addDocumentListener(new FieldUpdater());
		initDexField.getDocument().putProperty("Field", "initDexField");

		initMiscField = new JFormattedTextField();
		initList.add(initMiscField);
		Initiative.add(initMiscField, "7, 3, fill, default");
		initMiscField.setColumns(10);
		initMiscField.getDocument().addDocumentListener(new FieldUpdater());
		initMiscField.getDocument().putProperty("Field", "initMiscField");

		Speed = new JPanel();
		Speed.setBorder(new TitledBorder(null, "Speed", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		Left.add(Speed, "cell 0 2,grow");
		Speed.setLayout(new MigLayout("", "[][grow][][grow]", "[]"));

		speedLabel = new JLabel("Speed");
		Speed.add(speedLabel, "cell 0 0,alignx trailing");

		speedField = new JFormattedTextField();
		Speed.add(speedField, "cell 1 0,growx");
		speedField.setColumns(10);

		armorTypeLabel = new JLabel("Armor Type");
		Speed.add(armorTypeLabel, "cell 2 0,alignx trailing");

		armorTypeField = new JFormattedTextField();
		Speed.add(armorTypeField, "cell 3 0,growx");
		armorTypeField.setColumns(10);

		SavingThrows = new JPanel();
		SavingThrows.setBorder(new TitledBorder(null, "Saving Throws",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Left.add(SavingThrows, "cell 0 3,grow");
		SavingThrows.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC, FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, }));

		stTotalLabel = new JLabel("TOTAL");
		stTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		SavingThrows.add(stTotalLabel, "3, 1");

		stBaseLabel = new JLabel("Base");
		SavingThrows.add(stBaseLabel, "5, 1");

		stAbilityModLabel = new JLabel("Ability Mod");
		SavingThrows.add(stAbilityModLabel, "7, 1");

		stMagicModLabel = new JLabel("Magic Mod");
		SavingThrows.add(stMagicModLabel, "9, 1");

		stMiscModLabel = new JLabel("Misc Mod");
		SavingThrows.add(stMiscModLabel, "11, 1");

		stTempModLabel = new JLabel("Temp Mod");
		SavingThrows.add(stTempModLabel, "13, 1");

		stFortLabel = new JLabel("Fortitude");
		SavingThrows.add(stFortLabel, "1, 3, right, default");

		stFortTotalField = new JFormattedTextField();
		SavingThrows.add(stFortTotalField, "3, 3, fill, default");
		stFortTotalField.setColumns(10);

		stFortBaseField = new JFormattedTextField();
		fortList.add(stFortBaseField);
		stFortBaseField.getDocument().addDocumentListener(new FieldUpdater());
		stFortBaseField.getDocument().putProperty("Field", "stFortBaseField");
		SavingThrows.add(stFortBaseField, "5, 3, fill, default");
		stFortBaseField.setColumns(10);

		stFortAbilityField = new JFormattedTextField();
		stFortAbilityField.setEditable(false);
		fortList.add(stFortAbilityField);
		stFortAbilityField.getDocument()
				.addDocumentListener(new FieldUpdater());
		stFortAbilityField.getDocument().putProperty("Field",
				"stFortAbilityField");
		STRList.add(stFortAbilityField);
		SavingThrows.add(stFortAbilityField, "7, 3, fill, default");
		stFortAbilityField.setColumns(10);

		stFortMagicField = new JFormattedTextField();
		fortList.add(stFortMagicField);
		stFortMagicField.getDocument().addDocumentListener(new FieldUpdater());
		stFortMagicField.getDocument().putProperty("Field", "stFortMagicField");
		SavingThrows.add(stFortMagicField, "9, 3, fill, default");
		stFortMagicField.setColumns(10);

		stFortMiscField = new JFormattedTextField();
		fortList.add(stFortMiscField);
		stFortMiscField.getDocument().addDocumentListener(new FieldUpdater());
		stFortMiscField.getDocument().putProperty("Field", "stFortMiscField");
		SavingThrows.add(stFortMiscField, "11, 3, fill, default");
		stFortMiscField.setColumns(10);

		stFortTempField = new JFormattedTextField();
		fortList.add(stFortTempField);
		stFortTempField.getDocument().addDocumentListener(new FieldUpdater());
		stFortTempField.getDocument().putProperty("Field", "stFortTempField");
		SavingThrows.add(stFortTempField, "13, 3, fill, default");
		stFortTempField.setColumns(10);

		stRefLabel = new JLabel("Reflex");
		SavingThrows.add(stRefLabel, "1, 5, right, default");

		stRefTotalField = new JFormattedTextField();
		SavingThrows.add(stRefTotalField, "3, 5, fill, default");
		stRefTotalField.setColumns(10);

		stRefBaseField = new JFormattedTextField();
		refList.add(stRefBaseField);
		stRefBaseField.getDocument().addDocumentListener(new FieldUpdater());
		stRefBaseField.getDocument().putProperty("Field", "stRefBaseField");
		SavingThrows.add(stRefBaseField, "5, 5, fill, default");
		stRefBaseField.setColumns(10);

		stRefAbilityField = new JFormattedTextField();
		stRefAbilityField.setEditable(false);
		refList.add(stRefAbilityField);
		stRefAbilityField.getDocument().addDocumentListener(new FieldUpdater());
		stRefAbilityField.getDocument().putProperty("Field",
				"stRefAbilityField");
		DEXList.add(stRefAbilityField);
		SavingThrows.add(stRefAbilityField, "7, 5, fill, default");
		stRefAbilityField.setColumns(10);

		stRefMagicField = new JFormattedTextField();
		refList.add(stRefMagicField);
		stRefMagicField.getDocument().addDocumentListener(new FieldUpdater());
		stRefMagicField.getDocument().putProperty("Field", "stRefMagicField");
		SavingThrows.add(stRefMagicField, "9, 5, fill, default");
		stRefMagicField.setColumns(10);

		stRefMiscField = new JFormattedTextField();
		refList.add(stRefMiscField);
		stRefMiscField.getDocument().addDocumentListener(new FieldUpdater());
		stRefMiscField.getDocument().putProperty("Field", "stRefMiscField");
		SavingThrows.add(stRefMiscField, "11, 5, fill, default");
		stRefMiscField.setColumns(10);

		stRefTempField = new JFormattedTextField();
		refList.add(stRefTempField);
		stRefTempField.getDocument().addDocumentListener(new FieldUpdater());
		stRefTempField.getDocument().putProperty("Field", "stRefTempField");
		SavingThrows.add(stRefTempField, "13, 5, fill, default");
		stRefTempField.setColumns(10);

		stWillLabel = new JLabel("Will");
		SavingThrows.add(stWillLabel, "1, 7, right, default");

		stWilTotalField = new JFormattedTextField();
		SavingThrows.add(stWilTotalField, "3, 7, fill, default");
		stWilTotalField.setColumns(10);

		stWilBaseField = new JFormattedTextField();
		wilList.add(stWilBaseField);
		stWilBaseField.getDocument().addDocumentListener(new FieldUpdater());
		stWilBaseField.getDocument().putProperty("Field", "stWilBaseField");
		SavingThrows.add(stWilBaseField, "5, 7, fill, default");
		stWilBaseField.setColumns(10);

		stWilAbilityField = new JFormattedTextField();
		stWilAbilityField.setEditable(false);
		wilList.add(stWilAbilityField);
		stWilAbilityField.getDocument().addDocumentListener(new FieldUpdater());
		stWilAbilityField.getDocument().putProperty("Field",
				"stWilAbilityField");
		CONList.add(stWilAbilityField);
		SavingThrows.add(stWilAbilityField, "7, 7, fill, default");
		stWilAbilityField.setColumns(10);

		stWilMagicField = new JFormattedTextField();
		wilList.add(stWilMagicField);
		stWilMagicField.getDocument().addDocumentListener(new FieldUpdater());
		stWilMagicField.getDocument().putProperty("Field", "stWilMagicField");
		SavingThrows.add(stWilMagicField, "9, 7, fill, default");
		stWilMagicField.setColumns(10);

		stWilMiscField = new JFormattedTextField();
		wilList.add(stWilMiscField);
		stWilMiscField.getDocument().addDocumentListener(new FieldUpdater());
		stWilMiscField.getDocument().putProperty("Field", "stWilMiscField");
		SavingThrows.add(stWilMiscField, "11, 7, fill, default");
		stWilMiscField.setColumns(10);

		stWilTempField = new JFormattedTextField();
		wilList.add(stWilTempField);
		stWilTempField.getDocument().addDocumentListener(new FieldUpdater());
		stWilTempField.getDocument().putProperty("Field", "stWilTempField");
		SavingThrows.add(stWilTempField, "13, 7, fill, default");
		stWilTempField.setColumns(10);

		Right = new JPanel();
		Sheet.add(Right, "4, 4, center, top");
		Right.setLayout(new MigLayout("", "[444px,grow]",
				"[75px][159px][75px][]"));

		HP = new JPanel();
		HP.setBorder(new TitledBorder(null, "HP", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		Right.add(HP, "cell 0 0,grow");
		HP.setLayout(new MigLayout("", "[][][][][][]", "[][]"));

		hpTotalLabel = new JLabel("TOTAL");
		hpTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		HP.add(hpTotalLabel, "cell 1 0");

		hpCurrentLabel = new JLabel("CURRENT");
		HP.add(hpCurrentLabel, "cell 2 0");

		hpNonLethalLabel = new JLabel("Nonlethal");
		HP.add(hpNonLethalLabel, "cell 3 0");

		hpHitDieLabel = new JLabel("Hit Die");
		HP.add(hpHitDieLabel, "cell 4 0");

		hpDRLabel = new JLabel("DR");
		HP.add(hpDRLabel, "cell 5 0");

		hpTotalField = new JFormattedTextField();
		HP.add(hpTotalField, "cell 1 1");
		hpTotalField.setColumns(10);

		hpCurrentField = new JFormattedTextField();
		HP.add(hpCurrentField, "cell 2 1");
		hpCurrentField.setColumns(10);

		hpNonlethalField = new JFormattedTextField();
		HP.add(hpNonlethalField, "cell 3 1");
		hpNonlethalField.setColumns(10);

		hpHitDieField = new JFormattedTextField();
		HP.add(hpHitDieField, "cell 4 1");
		hpHitDieField.setColumns(10);

		hpDRField = new JFormattedTextField();
		HP.add(hpDRField, "cell 5 1");
		hpDRField.setColumns(10);

		AC = new JPanel();
		AC.setBorder(new TitledBorder(null, "AC", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		Right.add(AC, "cell 0 1,grow");
		AC.setLayout(new MigLayout("", "[][][][][][]", "[][][][][][]"));

		acTotalLabel = new JLabel("TOTAL");
		acTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		AC.add(acTotalLabel, "cell 1 0");

		acArmorLabel = new JLabel("Armor");
		AC.add(acArmorLabel, "cell 2 0");

		acShieldLabel = new JLabel("Shield");
		AC.add(acShieldLabel, "cell 3 0");

		acDexLabel = new JLabel("Dex");
		AC.add(acDexLabel, "cell 4 0");

		acDodgeLabel = new JLabel("Dodge");
		AC.add(acDodgeLabel, "cell 5 0");

		acTotalField = new JFormattedTextField();
		AC.add(acTotalField, "cell 1 1");
		acTotalField.setColumns(10);

		acArmorField = new JFormattedTextField();
		acList.add(acArmorField);
		acArmorField.getDocument().addDocumentListener(new FieldUpdater());
		acArmorField.getDocument().putProperty("Field", "acArmorField");
		AC.add(acArmorField, "cell 2 1");
		acArmorField.setColumns(10);

		acShieldField = new JFormattedTextField();
		acList.add(acShieldField);
		acShieldField.getDocument().addDocumentListener(new FieldUpdater());
		acShieldField.getDocument().putProperty("Field", "acShieldField");
		AC.add(acShieldField, "cell 3 1");
		acShieldField.setColumns(10);

		acDexField = new JFormattedTextField();
		acDexField.setEditable(false);
		acList.add(acDexField);
		acDexField.getDocument().addDocumentListener(new FieldUpdater());
		acDexField.getDocument().putProperty("Field", "acDexField");
		DEXList.add(acDexField);
		AC.add(acDexField, "cell 4 1");
		acDexField.setColumns(10);

		acDodgeField = new JFormattedTextField();
		acList.add(acDodgeField);
		acDodgeField.getDocument().addDocumentListener(new FieldUpdater());
		acDodgeField.getDocument().putProperty("Field", "acDodgeField");
		AC.add(acDodgeField, "cell 5 1");
		acDodgeField.setColumns(10);

		acSizeLabel = new JLabel("Size");
		AC.add(acSizeLabel, "cell 1 2");

		acNaturalLabel = new JLabel("Natural");
		AC.add(acNaturalLabel, "cell 2 2");

		acDeflectLabel = new JLabel("Deflect");
		AC.add(acDeflectLabel, "cell 3 2");

		acMiscLabel = new JLabel("Misc");
		AC.add(acMiscLabel, "cell 4 2");

		acSizeField = new JFormattedTextField();
		acList.add(acSizeField);
		acSizeField.getDocument().addDocumentListener(new FieldUpdater());
		acSizeField.getDocument().putProperty("Field", "acSizeField");
		AC.add(acSizeField, "cell 1 3");
		acSizeField.setColumns(10);

		acNaturalField = new JFormattedTextField();
		acList.add(acNaturalField);
		acNaturalField.getDocument().addDocumentListener(new FieldUpdater());
		acNaturalField.getDocument().putProperty("Field", "acNaturalField");
		AC.add(acNaturalField, "cell 2 3");
		acNaturalField.setColumns(10);

		acDeflectField = new JFormattedTextField();
		acList.add(acDeflectField);
		acDeflectField.getDocument().addDocumentListener(new FieldUpdater());
		acDeflectField.getDocument().putProperty("Field", "acDeflectField");
		AC.add(acDeflectField, "cell 3 3");
		acDeflectField.setColumns(10);

		acMiscField = new JFormattedTextField();
		acList.add(acMiscField);
		acMiscField.getDocument().addDocumentListener(new FieldUpdater());
		acMiscField.getDocument().putProperty("Field", "acMiscField");
		AC.add(acMiscField, "cell 4 3");
		acMiscField.setColumns(10);

		acPlus10Label = new JLabel("+ 10");
		AC.add(acPlus10Label, "cell 5 3");

		acTouchLabel = new JLabel("Touch");
		AC.add(acTouchLabel, "cell 1 4");

		acCMDLabel = new JLabel("CMD");
		AC.add(acCMDLabel, "cell 2 4");

		acFlatFootedLabel = new JLabel("Flat Footed");
		AC.add(acFlatFootedLabel, "cell 3 4");

		acFCMDLabel = new JLabel("FCMD");
		AC.add(acFCMDLabel, "cell 4 4");

		acTouchField = new JFormattedTextField();
		acList.add(acTouchField);
		acTouchField.getDocument().addDocumentListener(new FieldUpdater());
		acTouchField.getDocument().putProperty("Field", "acTouchField");
		AC.add(acTouchField, "cell 1 5");
		acTouchField.setColumns(10);

		acCMDField = new JFormattedTextField();
		acList.add(acCMDField);
		acCMDField.getDocument().addDocumentListener(new FieldUpdater());
		acCMDField.getDocument().putProperty("Field", "acCMDField");
		AC.add(acCMDField, "cell 2 5");
		acCMDField.setColumns(10);

		acFlatFootedField = new JFormattedTextField();
		acList.add(acFlatFootedField);
		acFlatFootedField.getDocument().addDocumentListener(new FieldUpdater());
		acFlatFootedField.getDocument().putProperty("Field",
				"acFlatFootedField");
		AC.add(acFlatFootedField, "cell 3 5");
		acFlatFootedField.setColumns(10);

		acFCMDField = new JFormattedTextField();
		acList.add(acFCMDField);
		acFCMDField.getDocument().addDocumentListener(new FieldUpdater());
		acFCMDField.getDocument().putProperty("Field", "acFCMDField");
		AC.add(acFCMDField, "cell 4 5");
		acFCMDField.setColumns(10);

		Loads = new JPanel();
		Loads.setBorder(new TitledBorder(null, "Loads", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		Right.add(Loads, "cell 0 2,grow");
		Loads.setLayout(new MigLayout(
				"",
				"[75px][4px][76px][4px][75px][4px][75px][4px][76px][4px][75px]",
				"[][20px]"));

		lightLoadLabel = new JLabel("Light Load");
		Loads.add(lightLoadLabel, "cell 0 0");

		mediumLoadLabel = new JLabel("Medium Load");
		Loads.add(mediumLoadLabel, "cell 2 0");

		maxLoadLabel = new JLabel("Max Load");
		Loads.add(maxLoadLabel, "cell 4 0");

		overheadLoadLabel = new JLabel("Over Head");
		Loads.add(overheadLoadLabel, "cell 6 0");

		offGroundLoadLabel = new JLabel("Off Ground");
		Loads.add(offGroundLoadLabel, "cell 8 0");

		pushDragLoadLabel = new JLabel("Push/Drag");
		Loads.add(pushDragLoadLabel, "cell 10 0");

		lightLoadField = new JFormattedTextField();
		Loads.add(lightLoadField, "cell 0 1,growx,aligny top");
		lightLoadField.setColumns(10);

		mediumLoadField = new JFormattedTextField();
		Loads.add(mediumLoadField, "cell 2 1,growx,aligny top");
		mediumLoadField.setColumns(10);

		maxLoadField = new JFormattedTextField();
		Loads.add(maxLoadField, "cell 4 1,growx,aligny top");
		maxLoadField.setColumns(10);

		overHeadLoadField = new JFormattedTextField();
		Loads.add(overHeadLoadField, "cell 6 1,growx,aligny top");
		overHeadLoadField.setColumns(10);

		offGroundLoadField = new JFormattedTextField();
		Loads.add(offGroundLoadField, "cell 8 1,growx,aligny top");
		offGroundLoadField.setColumns(10);

		pushDragLoadField = new JFormattedTextField();
		Loads.add(pushDragLoadField, "cell 10 1,growx,aligny top");
		pushDragLoadField.setColumns(10);

		AttackBonus = new JPanel();
		AttackBonus.setBorder(new TitledBorder(null, "Attack Bonus",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Right.add(AttackBonus, "cell 0 3,grow");
		AttackBonus
				.setLayout(new MigLayout(
						"",
						"[][46px,grow][58px,grow][58px,grow][58px,grow][58px,grow][58px,grow][58px,grow]",
						"[][20px][][]"));

		abTotalLabel = new JLabel("TOTAL");
		abTotalLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		AttackBonus.add(abTotalLabel, "cell 1 0");

		label_1 = new JLabel("");
		AttackBonus.add(label_1, "flowx,cell 2 0");

		abStrModLabel = new JLabel("Str Mod");
		AttackBonus.add(abStrModLabel, "cell 3 0");

		abSizeModLabel = new JLabel("Size Mod");
		AttackBonus.add(abSizeModLabel, "cell 4 0");

		abMiscModLabel = new JLabel("Misc Mod");
		AttackBonus.add(abMiscModLabel, "cell 5 0");

		abTempModLabel = new JLabel("Temp Mod");
		AttackBonus.add(abTempModLabel, "cell 6 0");

		abMeleeLabel = new JLabel("Melee");
		AttackBonus.add(abMeleeLabel, "cell 0 1,alignx trailing");

		abMeleeTotalField = new JFormattedTextField();
		AttackBonus.add(abMeleeTotalField, "cell 1 1");
		abMeleeTotalField.setColumns(10);

		abMeleeBaseField = new JFormattedTextField();
		abMeleeList.add(abMeleeBaseField);
		abMeleeBaseField.getDocument().addDocumentListener(new FieldUpdater());
		abMeleeBaseField.getDocument().putProperty("Field", "abMeleeBaseField");
		abMeleeBaseField.setColumns(10);
		AttackBonus.add(abMeleeBaseField, "cell 2 1,growx,aligny baseline");

		abMeleeStrField = new JFormattedTextField();
		abMeleeStrField.setEditable(false);
		abMeleeList.add(abMeleeStrField);
		abMeleeStrField.getDocument().addDocumentListener(new FieldUpdater());
		abMeleeStrField.getDocument().putProperty("Field", "abMeleeStrField");
		STRList.add(abMeleeStrField);
		abMeleeStrField.setColumns(10);
		AttackBonus.add(abMeleeStrField, "cell 3 1,growx");

		abMeleeSizeField = new JFormattedTextField();
		abMeleeList.add(abMeleeSizeField);
		abMeleeSizeField.getDocument().addDocumentListener(new FieldUpdater());
		abMeleeSizeField.getDocument().putProperty("Field", "abMeleeSizeField");
		abMeleeSizeField.setColumns(10);
		AttackBonus.add(abMeleeSizeField, "cell 4 1,growx");

		abMeleeMiscField = new JFormattedTextField();
		abMeleeList.add(abMeleeMiscField);
		abMeleeMiscField.getDocument().addDocumentListener(new FieldUpdater());
		abMeleeMiscField.getDocument().putProperty("Field", "abMeleeMiscField");
		abMeleeMiscField.setColumns(10);
		AttackBonus.add(abMeleeMiscField, "cell 5 1,growx");

		abMeleeTempField = new JFormattedTextField();
		abMeleeList.add(abMeleeTempField);
		abMeleeTempField.getDocument().addDocumentListener(new FieldUpdater());
		abMeleeTempField.getDocument().putProperty("Field", "abMeleeTempField");
		abMeleeTempField.setColumns(10);
		AttackBonus.add(abMeleeTempField, "cell 6 1,growx");

		abCMBLabel = new JLabel("CMB");
		AttackBonus.add(abCMBLabel, "cell 0 2,alignx trailing");

		abCMBTotalField = new JFormattedTextField();
		abCMBTotalField.setColumns(10);
		AttackBonus.add(abCMBTotalField, "cell 1 2,growx,aligny baseline");

		abCMBBaseField = new JFormattedTextField();
		abCMBList.add(abCMBBaseField);
		abCMBBaseField.getDocument().addDocumentListener(new FieldUpdater());
		abCMBBaseField.getDocument().putProperty("Field", "abCMBBaseField");
		abCMBBaseField.setColumns(10);
		AttackBonus.add(abCMBBaseField, "cell 2 2,growx");

		abCMBStrField = new JFormattedTextField();
		abCMBStrField.setEditable(false);
		abCMBList.add(abCMBStrField);
		abCMBStrField.getDocument().addDocumentListener(new FieldUpdater());
		abCMBStrField.getDocument().putProperty("Field", "abCMBStrField");
		STRList.add(abCMBStrField);
		abCMBStrField.setColumns(10);
		AttackBonus.add(abCMBStrField, "cell 3 2,growx");

		abCMBSizeField = new JFormattedTextField();
		abCMBList.add(abCMBSizeField);
		abCMBSizeField.getDocument().addDocumentListener(new FieldUpdater());
		abCMBSizeField.getDocument().putProperty("Field", "abCMBSizeField");
		abCMBSizeField.setColumns(10);
		AttackBonus.add(abCMBSizeField, "cell 4 2,growx");

		abCMBMiscField = new JFormattedTextField();
		abCMBList.add(abCMBMiscField);
		abCMBMiscField.getDocument().addDocumentListener(new FieldUpdater());
		abCMBMiscField.getDocument().putProperty("Field", "abCMBMiscField");
		abCMBMiscField.setColumns(10);
		AttackBonus.add(abCMBMiscField, "cell 5 2,growx");

		abCMBTempField = new JFormattedTextField();
		abCMBList.add(abCMBTempField);
		abCMBTempField.getDocument().addDocumentListener(new FieldUpdater());
		abCMBTempField.getDocument().putProperty("Field", "abCMBTempField");
		abCMBTempField.setColumns(10);
		AttackBonus.add(abCMBTempField, "cell 6 2,growx");

		abRangedLabel = new JLabel("Ranged");
		AttackBonus.add(abRangedLabel, "cell 0 3,alignx trailing");

		abRangedTotalField = new JFormattedTextField();
		abRangedTotalField.setColumns(10);
		AttackBonus.add(abRangedTotalField, "cell 1 3,growx");

		abRangedBaseField = new JFormattedTextField();
		abRangedList.add(abRangedBaseField);
		abRangedBaseField.getDocument().addDocumentListener(new FieldUpdater());
		abRangedBaseField.getDocument().putProperty("Field",
				"abRangedBaseField");
		abRangedBaseField.setColumns(10);
		AttackBonus.add(abRangedBaseField, "cell 2 3,growx");

		abRangedStrField = new JFormattedTextField();
		abRangedStrField.setEditable(false);
		abRangedList.add(abRangedStrField);
		abRangedStrField.getDocument().addDocumentListener(new FieldUpdater());
		abRangedStrField.getDocument().putProperty("Field", "abRangedStrField");
		STRList.add(abRangedStrField);
		abRangedStrField.setColumns(10);
		AttackBonus.add(abRangedStrField, "cell 3 3,growx");

		abRangedSizeField = new JFormattedTextField();
		abRangedList.add(abRangedSizeField);
		abRangedSizeField.getDocument().addDocumentListener(new FieldUpdater());
		abRangedSizeField.getDocument().putProperty("Field",
				"abRangedSizeField");
		abRangedSizeField.setColumns(10);
		AttackBonus.add(abRangedSizeField, "cell 4 3,growx");

		abRangedMiscField = new JFormattedTextField();
		abRangedList.add(abRangedMiscField);
		abRangedMiscField.getDocument().addDocumentListener(new FieldUpdater());
		abRangedMiscField.getDocument().putProperty("Field",
				"abRangedMiscField");
		abRangedMiscField.setColumns(10);
		AttackBonus.add(abRangedMiscField, "cell 5 3,growx");

		abRangedTempField = new JFormattedTextField();
		abRangedList.add(abRangedTempField);
		abRangedTempField.getDocument().addDocumentListener(new FieldUpdater());
		abRangedTempField.getDocument().putProperty("Field",
				"abRangedTempField");
		abRangedTempField.setColumns(10);
		AttackBonus.add(abRangedTempField, "cell 6 3,growx");

		abBaseLabel = new JLabel("Base");
		AttackBonus.add(abBaseLabel, "cell 2 0");

		fieldsList.add(characterNameField);
		fieldsList.add(characterLevelField);
		fieldsList.add(characterClassField);
		fieldsList.add(characterRaceField);
		fieldsList.add(characterAgeField);
		fieldsList.add(characterGenderField);
		fieldsList.add(characterSizeField);
		fieldsList.add(characterHeightField);
		fieldsList.add(characterWeightField);
		fieldsList.add(characterHairField);
		fieldsList.add(characterEyesField);
		fieldsList.add(characterAlignmentField);
		fieldsList.add(characterDeityField);
		fieldsList.add(strScoreField);
		fieldsList.add(strModField);
		fieldsList.add(strTempSField);
		fieldsList.add(strTempMField);
		fieldsList.add(dexScoreField);
		fieldsList.add(dexModField);
		fieldsList.add(dexTempSField);
		fieldsList.add(dexTempMField);
		fieldsList.add(conScoreField);
		fieldsList.add(conModField);
		fieldsList.add(conTempSField);
		fieldsList.add(conTempMField);
		fieldsList.add(intScoreField);
		fieldsList.add(intModField);
		fieldsList.add(intTempSField);
		fieldsList.add(intTempMField);
		fieldsList.add(wisScoreField);
		fieldsList.add(wisModField);
		fieldsList.add(wisTempSField);
		fieldsList.add(wisTempMField);
		fieldsList.add(chaScoreField);
		fieldsList.add(chaModField);
		fieldsList.add(chaTempSField);
		fieldsList.add(chaTempMField);
		fieldsList.add(initTotalField);
		fieldsList.add(initDexField);
		fieldsList.add(initMiscField);
		fieldsList.add(speedField);
		fieldsList.add(armorTypeField);
		fieldsList.add(stFortTotalField);
		fieldsList.add(stFortBaseField);
		fieldsList.add(stFortAbilityField);
		fieldsList.add(stFortMagicField);
		fieldsList.add(stFortMiscField);
		fieldsList.add(stFortTempField);
		fieldsList.add(stRefTotalField);
		fieldsList.add(stRefBaseField);
		fieldsList.add(stRefAbilityField);
		fieldsList.add(stRefMagicField);
		fieldsList.add(stRefMiscField);
		fieldsList.add(stRefTempField);
		fieldsList.add(stWilTotalField);
		fieldsList.add(stWilBaseField);
		fieldsList.add(stWilAbilityField);
		fieldsList.add(stWilMagicField);
		fieldsList.add(stWilMiscField);
		fieldsList.add(stWilTempField);
		fieldsList.add(hpTotalField);
		fieldsList.add(hpCurrentField);
		fieldsList.add(hpNonlethalField);
		fieldsList.add(hpHitDieField);
		fieldsList.add(hpDRField);
		fieldsList.add(acTotalField);
		fieldsList.add(acArmorField);
		fieldsList.add(acShieldField);
		fieldsList.add(acDexField);
		fieldsList.add(acDodgeField);
		fieldsList.add(acSizeField);
		fieldsList.add(acNaturalField);
		fieldsList.add(acDeflectField);
		fieldsList.add(acMiscField);
		fieldsList.add(acTouchField);
		fieldsList.add(acCMDField);
		fieldsList.add(acFlatFootedField);
		fieldsList.add(acFCMDField);
		fieldsList.add(lightLoadField);
		fieldsList.add(mediumLoadField);
		fieldsList.add(maxLoadField);
		fieldsList.add(overHeadLoadField);
		fieldsList.add(offGroundLoadField);
		fieldsList.add(pushDragLoadField);
		fieldsList.add(abMeleeTotalField);
		fieldsList.add(abMeleeBaseField);
		fieldsList.add(abMeleeStrField);
		fieldsList.add(abMeleeSizeField);
		fieldsList.add(abMeleeMiscField);
		fieldsList.add(abMeleeTempField);
		fieldsList.add(abCMBTotalField);
		fieldsList.add(abCMBBaseField);
		fieldsList.add(abCMBStrField);
		fieldsList.add(abCMBSizeField);
		fieldsList.add(abCMBMiscField);
		fieldsList.add(abCMBTempField);
		fieldsList.add(abRangedTotalField);
		fieldsList.add(abRangedBaseField);
		fieldsList.add(abRangedStrField);
		fieldsList.add(abRangedSizeField);
		fieldsList.add(abRangedMiscField);
		fieldsList.add(abRangedTempField);
	}

	public static JPanel getSheetPanel()
	{
		return Sheet;
	}

	public static ArrayList<JTextField> getFieldsList()
	{
		return fieldsList;
	}

	class FieldUpdater implements DocumentListener
	{

		public void insertUpdate(DocumentEvent e)
		{
			String field = (String) e.getDocument().getProperty("Field");

			switch (field)
			{
				case "strScoreField":
					updateMod(e, strScoreField, STRList);
				case "dexScoreField":
					updateMod(e, dexScoreField, DEXList);
				case "conScoreField":
					updateMod(e, conScoreField, CONList);
				case "intScoreField":
					updateMod(e, intScoreField, INTList);
				case "wisScoreField":
					updateMod(e, wisScoreField, WISList);
				case "chaScoreField":
					updateMod(e, chaScoreField, CHAList);
				case "initDexField":
				case "initMiscField":
					updateTotal(e, initTotalField, initList);
				case "stFortBaseField":
				case "stFortAbilityField":
				case "stFortMagicField":
				case "stFortMiscField":
				case "stFortTempField":
					updateTotal(e, stFortTotalField, fortList);
				case "stRefBaseField":
				case "stRefAbilityField":
				case "stRefMagicField":
				case "stRefMiscField":
				case "stRefTempField":
					updateTotal(e, stRefTotalField, refList);
				case "stWilBaseField":
				case "stWilAbilityField":
				case "stWilMagicField":
				case "stWiltMiscField":
				case "stWiltTempField":
					updateTotal(e, stWilTotalField, wilList);
				case "acArmorField":
				case "acShieldField":
				case "acDexField":
				case "acDodgeField":
				case "acSizeField":
				case "acNaturalField":
				case "acDeflectField":
				case "acMiscField":
					updateTotal(e, acTotalField, acList);
				case "abMeleeBaseField":
				case "abMeleeStrField":
				case "abMeleeSizeField":
				case "abMeleeMiscField":
				case "abMeleeTempField":
					updateTotal(e, abMeleeTotalField, abMeleeList);
				case "abRangedBaseField":
				case "abRangedStrField":
				case "abRangedSizeField":
				case "abRangedMiscField":
				case "abRangedTempField":
					updateTotal(e, abRangedTotalField, abRangedList);
				case "abCMBBaseField":
				case "abCMBStrField":
				case "abCMBSizeField":
				case "abCMBMiscField":
				case "abCMBTempField":
					updateTotal(e, abCMBTotalField, abCMBList);
			}
		}

		public void removeUpdate(DocumentEvent e)
		{

		}

		public void changedUpdate(DocumentEvent e)
		{

		}

		public void updateMod(DocumentEvent e, JTextField ability,
				ArrayList<JTextField> mod)
		{
			// TODO Need to restrict characters and parse out "-"
			if (!ability.getText().equals(""))
			{
				Integer score = Integer.parseInt(ability.getText());
				if (score >= 0 && score < 2)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("-5");
				} else if (score >= 2 && score < 4)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("-4");
				} else if (score >= 4 && score < 6)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("-3");
				} else if (score >= 6 && score < 8)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("-2");
				} else if (score >= 8 && score < 10)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("-1");
				} else if (score >= 10 && score < 12)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("0");
				} else if (score >= 12 && score < 14)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("1");
				} else if (score >= 14 && score < 16)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("2");
				} else if (score >= 16 && score < 18)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("3");
				} else if (score >= 18 && score < 20)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("4");
				} else if (score >= 20 && score < 22)
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("5");
				} else
				{
					for (int i = 0; i < mod.size(); i++)
						mod.get(i).setText("INV");
				}
			}
		}

		public void updateTotal(DocumentEvent e, JTextField total,
				ArrayList<JTextField> addends)
		{
			total.setText("0");
			if (!total.getText().equals(""))
			{
				int sum = 0;
				for (int i = 0; i < addends.size(); i++)
				{
					if (!addends.get(i).getText().equals(""))
						sum += Integer.parseInt(addends.get(i).getText());
				}
				if (total == acTotalField)
					sum += 10;
				total.setText(String.valueOf(sum));
			}
		}

		public String filterInput(String input)
		{
			if (input.contains("-"))
			{

			}

			return input;
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub

	}
}
