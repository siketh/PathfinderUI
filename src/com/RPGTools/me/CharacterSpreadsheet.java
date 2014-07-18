package com.RPGTools.me;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import com.google.gdata.client.spreadsheet.SpreadsheetQuery;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.CellEntry;
import com.google.gdata.data.spreadsheet.CellFeed;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.data.spreadsheet.SpreadsheetFeed;
import com.google.gdata.data.spreadsheet.WorksheetEntry;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

public class CharacterSpreadsheet
{
	ArrayList<JTextField> fieldsList = CharacterSheetTab.getFieldsList();
	SpreadsheetService service = new SpreadsheetService("Service");
	WorksheetEntry sheet = getWorksheet("Trevor");

	public CharacterSpreadsheet() throws IOException, ServiceException, URISyntaxException
	{
		verifySpreadsheet(sheet);
		printCells(sheet);
		updateCharacterSheet(sheet);
	}

	public WorksheetEntry getWorksheet(String name) throws IOException, ServiceException
	{
		String SPREADSHEET_URL = "https://spreadsheets.google.com/feeds/spreadsheets/private/full";

		service.setUserCredentials("troman.sw.dev@gmail.com", "149253649");

		URL sheetListURL = new URL(SPREADSHEET_URL);
		SpreadsheetQuery query = new SpreadsheetQuery(sheetListURL);
		query.setTitleQuery("Character Sheet");
		SpreadsheetFeed sfeed = service.getFeed(query, SpreadsheetFeed.class);

		List<SpreadsheetEntry> spreadsheetEntries = sfeed.getEntries();
		SpreadsheetEntry spreadsheet = spreadsheetEntries.get(0);

		List<WorksheetEntry> worksheets = spreadsheet.getWorksheets();
		
		WorksheetEntry worksheet = new WorksheetEntry();
		
		for(int i=0; i<worksheets.size(); i++)
		{
			if(worksheets.get(i).getTitle().getPlainText().equals(name))
			{
				worksheet = worksheets.get(i);
				break;
			}
		}
		
		return worksheet;
	}

	public void verifySpreadsheet(WorksheetEntry worksheet) throws IOException, ServiceException
	{
		System.out.println("Worksheet name: " + worksheet.getTitle().getPlainText() + ", Cols: " + worksheet.getColCount() + ", Rows: "
				+ worksheet.getRowCount());
	}

	public void printCells(WorksheetEntry worksheet) throws AuthenticationException, MalformedURLException, IOException, ServiceException,
			URISyntaxException
	{
		// Fetch the cell feed of the worksheet.
		URL cellFeedUrl = new URI(worksheet.getCellFeedUrl().toString() + "?min-row=2&min-col=2&max-col=2").toURL();

		CellFeed cellFeed = service.getFeed(cellFeedUrl, CellFeed.class);

		// Iterate through each cell, printing its value.
		for (CellEntry cell : cellFeed.getEntries())
		{
			// Print the cell's address in A1 notation
			System.out.print(cell.getTitle().getPlainText() + "\t");
			// Print the cell's formula or text value
			System.out.print(cell.getCell().getInputValue() + "\t");
			System.out.println();
		}
	}

	public void updateCharacterSheet(WorksheetEntry worksheet) throws AuthenticationException, MalformedURLException, IOException, ServiceException,
			URISyntaxException
	{
		// Fetch the cell feed of the worksheet.
		URL cellFeedUrl = new URI(worksheet.getCellFeedUrl().toString() + "?min-row=2&min-col=2&max-col=2").toURL();
		CellFeed cellFeed = service.getFeed(cellFeedUrl, CellFeed.class);

		// Iterate through each cell, printing its value.
		int i = 0;
		for (CellEntry cell : cellFeed.getEntries())
		{
			JTextField temp = fieldsList.get(i);
			temp.setText(cell.getCell().getInputValue());
			fieldsList.set(i, temp);
			i++;
		}
	}

	public void saveCharacter() throws AuthenticationException, MalformedURLException, IOException, ServiceException, URISyntaxException
	{
		System.out.println("*********************** SAVING ***********************");
		
		WorksheetEntry worksheet = sheet;
		// Fetch the cell feed of the worksheet.
		URL cellFeedUrl = new URI(worksheet.getCellFeedUrl().toString() + "?min-row=2&min-col=2&max-col=2").toURL();
		CellFeed cellFeed = service.getFeed(cellFeedUrl, CellFeed.class);

		// Iterate through each cell, setting its value.
		int i = 0;
		for (CellEntry cell : cellFeed.getEntries())
		{
			cell.changeInputValueLocal(fieldsList.get(i).getText());
			cell.update();
			i++;
			// Print the cell's address in A1 notation
			System.out.print(cell.getTitle().getPlainText() + "\t");
			// Print the cell's formula or text value
			System.out.print(cell.getCell().getInputValue() + "\t");
			System.out.println();
		}
	}
	
	public void loadCharacter(String name) throws AuthenticationException, MalformedURLException, IOException, ServiceException, URISyntaxException
	{
		System.out.println("*********************** LOADING ***********************");
		sheet = getWorksheet(name);
		verifySpreadsheet(sheet);
		printCells(sheet);
		updateCharacterSheet(sheet);
	}
}