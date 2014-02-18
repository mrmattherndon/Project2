import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Comparator;
import javax.swing.*;
import javax.swing.table.*;

/**
 *Responsible for building a user interface and reading from the file. When called, it takes a command line argument 
 *(which is ideally a collection of paths to .csv files) and attempts to read their data. If the paths are invalid, 
 *it alerts the user and closes. If not, the main() calls GeoDriver.readInfoFromFile() which attempts to read and interpret the files. 
 *After this, Driver builds a GUI which implicitly asks for user input. Once the input is given, it calls CountryList.searchInfo() 
 *to get results, which (assuming they exist) builds a table of the data and places it into a JScrollPane. 
 * </P>
 * @version 1.0
 */
public class GeoDriver {
	/* * Provides the backbone for the CountryMain GUI; the main window.*/
	private static JFrame window=new JFrame();
	
	/* * A secondary container for 'tool bar' components.*/
	private static JPanel toolPanel=new JPanel();
	
	/* * Provides a means of text input to the program. checkInputText() is called to use its input.*/
	private static JTextField textInput=new JTextField(20);
	
	/* A table to show the data */
	private static JTable table=new JTable(0,4);
	
	/* Sorts the table*/
	static TableRowSorter<TableModel> sorter=new TableRowSorter<TableModel>(table.getModel());
		
	/* * Allows the table to be scrolled through*/
	private static JScrollPane tableScroll=new JScrollPane();
	
	/* * Calls checkInputText() on activation*/
	private static JButton submitButton=new JButton("Query Database");
	
	/* * A combo box that contains the data type choices. Used to select the data type to search*/
	private static JComboBox<String> searchOptions=new JComboBox<String>(
			new String[]{"Name","Population","Land Area","Continent"});
	
	/* A text area that contains instructions for using the program.*/
	private static JTextArea instructions=new JTextArea("Type a search query into the text box and press submit to search. Placing '*' at the beginning of a query"
			+ " enables fuzzy-ish searching. To sort the results, click on the column headers in the table. Preface query with '^' and format with comments to"
			+ "add a Country to the list. Format is '^CountryName,CountryPopulation,CountryArea,CountryContinent'");
	
	/* * An array which contains the appropriate string values that identify the subclasses of CountryInfo. Used by searchOptions, 
	 * as some names used in the combo box that enhance readability are not compatible with the "getSpecificInfo(string)" method of
	 * class "Country", which is used to grab the appropriate data members on request.*/
	private static String[] options=new String[]{"name","population","area","continent"};
	
	
	/**
	 * The main function of the class. First, it attempts to read the file indicated by the program argument. If it exists, main
	 * builds the GUI for the program and sends the arguments to GeoDriver.readInfoFromFile().
	 * @param String[] args
	 * @return void
	 */
	public static void main(String[] args){
	
	}
	
	/**
	 * Reads the file and sends it line by line to the DataStructure object passed to it to be interpreted. Then, if a valid Group object is found,
	 * adds the data to the appropriate GroupList object.</P>
	 * @param DataStructure structure
	 * @return void
	 * */
	public static void readInfoFromFile(DataStructure structure){
	
	}
	
	/**
	 * The method is called to deal with user input through the class variable textInput.
	 * <P>
	 * Algorithm:<br>
	 * 1. This method is used to deal with input text and build a table of results to be shown to the user.<br>
	 * 2. Send search query to CountryList.searchList().<br>
	 * 3. Build a table from the results if they exist. If not, alerts the user via a JDialog notification.<br>
	 * </P>
	 * @param empty
	 * @return void
	 * */
	public static void checkInputText(){

	}
}
