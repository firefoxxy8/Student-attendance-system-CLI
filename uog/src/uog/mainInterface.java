package uog;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class mainInterface {
	public static void main(String[] args) throws IOException {

		// Display UOG logo written in ascii
		System.out.println("\t\t  .----------------.  .----------------.  .----------------. ");
		System.out.println("\t\t | .--------------. || .--------------. || .--------------. |");
		System.out.println("\t\t | | _____  _____ | || |     ____     | || |    ______    | |");
		System.out.println("\t\t | ||_   _||_   _|| || |   .'    `.   | || |  .' ___  |   | |");
		System.out.println("\t\t | |  | |    | |  | || |  /  .--.  \\  | || | / .'   \\_|   | |");
		System.out.println("\t\t | |  | '    ' |  | || |  | |    | |  | || | | |    ____  | |");
		System.out.println("\t\t | |   \\ `--' /   | || |  \\  `--'  /  | || | \\ `.___]  _| | |");
		System.out.println("\t\t | |    `.__.'    | || |   `.____.'   | || |  `._____.'   | |");
		System.out.println("\t\t | |              | || |              | || |              | |");
		System.out.println("\t\t | '--------------' || '--------------' || '--------------' |");
		System.out.println("\t\t '----------------'  '----------------'  '----------------' ");
		System.out.println("\n \t \t \t \t \t \t \t -University of Gugsi-");

		// Display Current date and time
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(Calendar.getInstance().getTime());
		System.out.println("\nCurrent Time: " + timeStamp);

		// Welcome Message and the Login
		System.out.println('\n' + "Welcome to UOG Student Attendance System ");
		loginFunction();
	}

	/*
	 * Method used to implement login function
	 */
	public static void loginFunction() throws IOException {
		Scanner sc = new Scanner(System.in);
		// Get user name and password to access the system
		System.out.print("\nUsername: ");
		String user = sc.nextLine();

		System.out.print("Password: ");
		String pass = sc.nextLine();
		// Validate the user input with the given username and password
		if ("admin@uog.lk".equalsIgnoreCase(user) && "_021211".equals(pass)) {
			// Display message login successful
			System.out.println("\t \t \t \t   Login Successful");
			System.out.println("Loading...");
			// Calling menuDisplay Method
			menuDisplay();
		} else {
			// If the user input not matched with the given data, display
			// incorrect
			System.err.println("The username and password is incorrect.");
			// Exit the system
			System.exit(0);
		}
		// Close the scanner
		sc.close();
	}

	/*
	 * Method used to Display the Menu of the System
	 */
	public static void menuDisplay() throws IOException {
		System.out.println(
				"______________________________________________________________________________________________");
		System.out.println("\t \t \t \t \t |Menu|");
		System.out.println(
				"\n[      Add Student - as     ]\t[   Modify Student - ms    ]\t[Delete Student Details - ds ]");
		System.out
				.println("[      Add Lecturer- al     ]\t[   Modify Lecturer - ml   ]\t[Delete Lecturer Details - dl]");
		System.out
				.println("[ View Student Details - vs ]\t[View Lecturer Details - vl]\t[View Attendance Report - ar ]");
		System.out.println("\t\t\t[  View Help - help  ]\t [     System exit - exit     ]");

		Scanner sc = new Scanner(System.in);
		String command = "";
		// Input of Commands to call methods within the main interface
		do {
			System.out.println("\n\n Enter your command: ");
			command = sc.nextLine();
			if ("as".equalsIgnoreCase(command)) {
				studentAdd();
				continue;
			}
			if ("al".equalsIgnoreCase(command)) {
				lecturerAdd();
				continue;
			}
			if ("ms".equalsIgnoreCase(command)) {
				studentModify();
				continue;
			}
			if ("ml".equalsIgnoreCase(command)) {
				lecturerModify();
				continue;
			}
			if ("ds".equalsIgnoreCase(command)) {
				studentDelete();
				continue;
			}
			if ("dl".equalsIgnoreCase(command)) {
				lecturerDelete();
				continue;
			}
			if ("vs".equalsIgnoreCase(command)) {
				viewStudent();
				continue;
			}
			if ("vl".equalsIgnoreCase(command)) {
				viewLecturer();
				continue;
			}

			if ("ar".equalsIgnoreCase(command)) {
				attendanceReport();
				continue;
			}
			if ("help".equalsIgnoreCase(command)) {
				viewHelp();
				continue;
			}
			if ("exit".equalsIgnoreCase(command)) {
				System.out.println("Thank You");
				System.exit(0);
			} else {
				System.err.println("Error. Please enter a valid command.");
			}
			// run the loop until user enter exit
		} while (!"exit".equalsIgnoreCase(command));
	}

	/*
	 * Method created to view details of the lecturers existing in the
	 * lecturer.txt
	 */
	private static void viewLecturer() {
		System.out.println("VIEW LECTURER FILE\n");
		try {
			// BufferedReader is declared to read lecturer.txt
			BufferedReader in = new BufferedReader(new FileReader("lecturer.txt"));
			// line variable is declared to store data of lecturer.txt
			String line;
			System.out.println(
					"Unit ID\tUnit Name\tRoom No Room Name\tLecturer Name  Room Capacity No of Sutdents Enrolled\n");
			// Read line by line and display
			while ((line = in.readLine()) != null) {
				// Display the data
				System.out.println(line);
			}
			// Catches IOExceptions thrown by studentdetails.txt if the file is
			// not existing or working properly
		} catch (IOException error) {
			System.out.println("File does not exist or you are trying to read a file that has been deleted");
		}

	}

	/*
	 * Method created to view details of the students existing in the
	 * studentdetails.txt
	 */
	public static void viewStudent() {
		System.out.println("VIEW STUDENTS FILE\n");
		try {
			// Declares a bufferedReader to read studentdetails.txt
			BufferedReader in = new BufferedReader(new FileReader("studentdetails.txt"));
			// line is used to store the data which reads by the bufferedReader
			String line;
			// Print the heading of the table
			System.out.println("Student No\tSurname\t\tFirst Name\n");
			// Read line by line and display
			while ((line = in.readLine()) != null) {
				// Display the data stored in variable line
				System.out.println(line);
			}
			// Catches IOExceptions thrown by studentdetails.txt if the file is
			// not existing or working properly
		} catch (IOException error) {
			System.out.println("File does not exist or you are trying to read a file that has been deleted");
		}
	}

	/*
	 * Method created to add students to the studentdetails.txt
	 */
	public static void studentAdd() {
		// Display the title of the function
		System.out.println("STUDENT ADD FUNCTION\n");
		Scanner sc = new Scanner(System.in);
		// Input student number, surname and first name
		System.out.println("Enter Student Number: ");
		// Get the integer and convert to string
		int stdNumI = sc.nextInt();

		System.out.println("Enter Surname: ");
		String surname = sc.next();

		System.out.println("Enter First Name: ");
		String firstName = sc.next();

		// Convert stdNum to string
		String stdNum = Integer.toString(stdNumI);

		try {
			// Creating a file called studentdetails.txt
			File file = new File("studentdetails.txt");
			file.createNewFile();
			// Write the user input data in the file
			// In case the file exist, the data is append in the following file
			FileWriter fileWrite = new FileWriter(file, true);
			BufferedWriter bufferedWrite = new BufferedWriter(fileWrite);
			// Student Number, surname and first name is written in the file
			bufferedWrite.write("\n" + stdNum + "\t\t" + surname + "\t\t" + firstName);
			// Force to write data to the file
			bufferedWrite.flush();
			// Close bufferedReader
			bufferedWrite.close();
			// Display Successful message
			System.out.println("You have successfully added the student.");
			// Catches IOExceptions thrown by studentdetails.txt if the file is
			// not existing or working properly
		} catch (IOException error) {
			System.out.println("File does not exist or you are trying to read a file that has been deleted");
		}
	}

	/*
	 * Method created to add lecturer details
	 */
	public static void lecturerAdd() {
		System.out.println("LECTURER ADD FUNCTION\n");
		try {
			Scanner sc = new Scanner(System.in);
			// Get the table inputs
			System.out.println("Enter Unit ID: ");
			String unitId = sc.nextLine();

			System.out.println("Enter Unit Name: ");
			String unitName = sc.nextLine();

			System.out.println("Enter Room No: ");
			String roomNo = sc.nextLine();

			System.out.println("Enter Room Name: ");
			String roomName = sc.nextLine();

			System.out.println("Enter Lecturer Name: ");
			String lName = sc.nextLine();

			System.out.println("Room Capacity: ");
			int capacityI = sc.nextInt();

			System.out.println("No of Students Enrolled: ");
			int enrolI = sc.nextInt();

			// Convert the inputs to string in order to create the array to
			// modify

			String capacity = Integer.toString(capacityI);
			String enrol = Integer.toString(enrolI);
			// Create new file lecturer.txt
			File file = new File("lecturer.txt");
			file.createNewFile();
			// Write the given inputs to the lecturer.txt file
			// In case the file exist, the data is append in the following file
			FileWriter fileWrite = new FileWriter(file, true);
			// Declares bufferedWrite to write data to lecturer.txt
			BufferedWriter bufferedWrite = new BufferedWriter(fileWrite);
			// Structure of the data is written
			bufferedWrite.write("\n" + unitId + "\t\t" + unitName + "\t\t" + roomNo + "\t\t" + roomName + "\t\t" + lName + "\t\t"
					+ capacity + "\t\t" + enrol);
			// Force to write data to the file
			bufferedWrite.flush();
			// Close bufferedWrite
			bufferedWrite.close();
			// Display message if success
			System.out.println("You have successfully added the lecturer.");
			// Catches IOExceptions thrown by studentdetails.txt if the file is
			// not existing or working properly
		} catch (IOException error) {
			System.out.println("File does not exist or you are trying to read a file that has been deleted");
		}
	}

	/*
	 * Method created to edit the studentdetails.txt file
	 */
	public static void studentModify() {
		// Display the title of the function
		System.out.println("STUDENT MODIFY FUNCTION\n");
		// Get the user inputs to modify the particular data
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Number: ");
		String stdNum = sc.nextLine();
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter Surname: ");
		String surname = sc.nextLine();

		try {
			// Declares file input stream to open the studentdetails.txt
			FileInputStream fis = new FileInputStream("studentdetails.txt");
			// Declared buffered reader to read file input stream
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			// Declares a variable called line in order to store data in the
			// file
			String line;
			// Declares string builder to append and insert new data
			StringBuilder strBuilder = new StringBuilder();
			// Read line by line
			while ((line = br.readLine()) != null) {
				// created an array in order to split data
				String words[] = line.split("\t");
				if (words.length > 0) {
					// words [0] is student number to identify the data input
					if (words[0].contains(stdNum)) {
						if (surname != null)
							words[2] = surname;
						if (firstName != null)
							words[1] = firstName;
						// Structure of the file to be written
						String newLine = words[0] + "\t\t" + words[1] + "\t\t" + words[2];
						// newline contains the new values to be stored
						strBuilder.append(newLine);
						strBuilder.append("\n");
					} else {
						strBuilder.append(line);
						strBuilder.append("\n");
					}
				}
			}
			// Write to the file studentdetails.txt
			FileWriter writer = new FileWriter("studentdetails.txt");
			// Declare new buffered writer to store data to text file
			BufferedWriter br2 = new BufferedWriter(writer);
			br2.write(strBuilder.toString());
			// Display Message if successful
			System.out.println("You have successfully edited the student entry.");
		}
		// Catches IOExceptions thrown by studentdetails.txt if the file is not
		// existing or working properly
		catch (Exception e) {
			System.err.println("Unsucessful");
		}
	}

	/*
	 * Method created to edit lecturer.txt
	 */
	public static void lecturerModify() {
		System.out.println("LECTURER MODIFY FUNCTION\n");
		Scanner sc = new Scanner(System.in);
		// Get the user input
		System.out.println("Enter Unit ID: ");
		String unitId = sc.nextLine();

		System.out.println("Enter Unit Name: ");
		String unitName = sc.nextLine();

		System.out.println("Enter Room No: ");
		String roomNo = sc.nextLine();

		System.out.println("Enter Room Name: ");
		String roomName = sc.nextLine();

		System.out.println("Enter Lecturer Name: ");
		String lName = sc.nextLine();

		System.out.println("Room Capacity: ");
		int capacityI = sc.nextInt();

		System.out.println("No of Students Enrolled: ");
		int enrolI = sc.nextInt();

		// Convert integer to string
		String capacity = Integer.toString(capacityI);
		String enrol = Integer.toString(enrolI);
		try {
			// Declares a new IO Stream in order to open lecturer.txt
			FileInputStream fis = new FileInputStream("lecturer.txt");
			// Declare buffered reader to read file input stream
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			// Declare line variable to store values of the file
			String line;
			// Declare string builder to insert and append data
			StringBuilder strBuilder = new StringBuilder();
			// Read line by line in the file
			while ((line = br.readLine()) != null) {
				// Split data by tab
				String words[] = line.split("\t");
				if (words.length > 0) {
					// Assign unitID to word[0] then compare with the existing
					// records
					if (words[0].contains(unitId)) {
						if (unitName != null)
							words[1] = unitName;
						if (roomNo != null)
							words[2] = roomNo;
						if (roomName != null)
							words[3] = roomName;
						if (lName != null)
							words[4] = lName;
						if (capacity != null)
							words[5] = capacity;
						if (enrol != null)
							words[6] = enrol;
						// Table structure for the list
						String newLine = words[0] + "\t" + words[1] + "\t" + words[2] + "\t" + words[3] + "\t"
								+ words[4] + "\t" + words[5] + "\t" + words[6];
						// StringBuilder is much faster than StringBuffer,
						// therefore object newline will be append
						strBuilder.append(newLine);
						strBuilder.append("\n");
					} else {
						strBuilder.append(line);
						strBuilder.append("\n");
					}
				}
			}
			// Overwrite to the file in lecturer.txt
			FileWriter writer = new FileWriter("lecturer.txt");
			// Declare buffered writer to write data of lecturer.txt
			BufferedWriter br2 = new BufferedWriter(writer);
			br2.write(strBuilder.toString());
			// If success, display message
			System.out.println("You have successfully edited the lecturer entry.");

		}
		// Catches IOExceptions thrown by lecturer.txt if the file is not
		// existing or working properly
		catch (Exception e) {
			System.err.println("Unsucessful");
		}

	}

	/*
	 * Method to delete studentdetails.txt file
	 */
	public static void studentDelete() throws IOException {
		try {
			// Declare buffered Writer to studentdetails.txt
			BufferedWriter out = new BufferedWriter(new FileWriter("studentdetails.txt"));
			// Delete data
			out.write("");
			// close buffered writer
			out.close();
			// If delete file successful
			boolean success = (new File("studentdetails.txt")).delete();
			if (success) {
				// Display successful message
				System.out.println("The file has been deleted successfully");
			}
			// Declare buffered reader to read studentdetails.txt
			BufferedReader br = new BufferedReader(new FileReader("studentdetails.txt"));
			// Store data to line variable
			String line;
			// Read line by line until null
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			// Catches IOExceptions thrown by studentdetails.txt if the file is
			// not existing or working properly
		} catch (IOException e) {
			System.out.println("exception occoured" + e);
			System.out.println("File does not exist or you are trying to read a file that has been deleted");
		}
	}

	/*
	 * Method to delete lecturer file
	 */
	public static void lecturerDelete() {
		try {
			// Declare buffered writer to write lecturer.txt
			BufferedWriter out = new BufferedWriter(new FileWriter("lecturer.txt"));
			// Delete data of the file
			out.write("");
			// Close buffered writer
			out.close();
			// Delete lecturer.txt file
			boolean success = (new File("lecturer.txt")).delete();
			if (success) {
				// Display message if the delete lecturer file is successful
				System.out.println("The file has been deleted successfully");
			}
			// Declared buffered reader to read lecturer.txt
			BufferedReader in = new BufferedReader(new FileReader("lecturer.txt"));
			// Store data to line variable
			String line;
			// Read line by line until null value
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			// Catches IOExceptions thrown by lecturer.txt if the file is not
			// existing or working properly
		} catch (IOException e) {
			System.out.println("exception occoured" + e);
			System.out.println("File does not exist or you are trying to read a file that has been deleted");
		}
	}

	/*
	 * Method to generate attendance report
	 */
	public static void attendanceReport() throws IOException {
		// Declare line variable to store data
		String line = "";
		// Declare arraylist for studentdetails.txt, lecturer.txt and
		// attendancelog.txt
		ArrayList<String> studentdetail = new ArrayList<>();
		List<String> lecturerdetail = new ArrayList<>();
		List<String> att = new ArrayList<>();
		// Declare variable date and week
		String date = "";
		String week = "";
		// Scanner is used to get the unit ID input

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit: ");
		String unitinput = sc.next();
		//Validate the unit input 
		if ("ECSC410".equalsIgnoreCase(unitinput) || "ECSC500".equals(unitinput)
				||"ECSC400".equalsIgnoreCase(unitinput)){		
		// Declare buffered reader to read attendancelong.txt
		BufferedReader b = new BufferedReader(new FileReader("attendancelog.txt"));
		// Read line by line until null
		while ((line = b.readLine()) != null) {
			// check unit id input with the attendance log file
			if (line.contains(unitinput)) {
				// Add the data to att, studentdetail, date, week from the
				// attendancelog.txt
				att = Arrays.asList(line.split("\t"));
				studentdetail.add(att.get(1));
				date = att.get(4);
				week = att.get(5);
			}

			// Declare buffered reader to read lecturer.txt file
			BufferedReader b2 = new BufferedReader(new FileReader("lecturer.txt"));
			// Read line by line until null
			while ((line = b2.readLine()) != null) {
				// Get the data relating to unit id input
				if (line.contains(unitinput)) {
					// add data to lecturer detail
					lecturerdetail = Arrays.asList(line.split("\t"));
				}
			}
		}
		// Declare records array
		List<String> records = new ArrayList<>();
		// Declare buffered reader to read studentdetails.txt
		BufferedReader br3 = new BufferedReader(new FileReader("studentdetails.txt"));
		// Read line by line until null
		while ((line = br3.readLine()) != null) {
			// Insert Y to the students following the module
			for (String student : studentdetail) {
				if (line.contains(student)) {
					records.add(line + "      Y");
				}
			}
		}

		String[] studentArr = records.toArray(new String[studentdetail.size() - 1]);
		// getting lecturer detail data to lecturerArr array
		String[] lecturerArr = lecturerdetail.toArray(new String[lecturerdetail.size()]);
		// Call method template to generate the report
		template(unitinput, lecturerArr, week, date, records);
		}
	}

	/*
	 * Method to create a template
	 */
	public static void template(String unitinput, String[] lecturerArr, String week, String date, List<String> array)
			throws IOException {
		// Template to generate attendance report
		System.out.println("\t\t ATTENDANCE REPORT \n");
		System.out.println("Unit ID\t\t: " + "\t" + unitinput);
		System.out.println("Unit Name\t: " + "\t" + lecturerArr[1]);
		System.out.println("Room\t\t: " + "\t" + lecturerArr[2]);
		System.out.println("Name\t\t: " + "\t" + lecturerArr[3]);
		System.out.println("Lecturer\t: " + "\t" + lecturerArr[4]);
		System.out.println("Week#\t\t: " + "\t" + week);
		System.out.println("Date\t\t: " + "\t" + date + "\n");
		// Display studentdetails.txt with relating to unit input
		for (String line : array) {
			System.out.println(line);
		}
		System.out.println("\n\nLecturer confirmed attendance: Yes/No");
		System.out.println("Students Enrolled\t : " + lecturerArr[6]);
		System.out.println("Attendance\t\t : " + array.size());
		System.out.println("Room capacity\t\t : " + lecturerArr[5]);
		// Percentage is calculated according to student enrolled and room
		// capacity
		System.out.println("Percentage occupancy\t : "
				+ ((array.size() / (double) (Integer.valueOf(lecturerArr[6])) * 100)) + "%");
		// Authorization of the attendance report
		System.out.println("Please confirm the authozation [Y/N]");
		Scanner sc = new Scanner(System.in);
		String autho = sc.next();

		// If the user accepts the report go to method save
		if (autho.equalsIgnoreCase("Y")) {
			// Display successful message
			System.out.println("Attendance Report successfully saved.");
			save(unitinput, lecturerArr, week, date, array);
			// If the user rejects the report, display following message
		} else {
			System.out.println("Attendance Report is not confirmed.");
		}
	}

	/*
	 * Method to save the authorized report
	 */
	public static void save(String unitinput, String[] lecturerArr, String week, String date, List<String> array)
			throws IOException {
		// Declare line variable to store data
		String line = "Unit :" + unitinput + "\n" + "Unit name :" + lecturerArr[1] + "\n" + "Room :" + lecturerArr[2]
				+ "\n" + "Name :" + lecturerArr[3] + "\n" + "Lecturer :" + lecturerArr[4] + "\n" + "Week :" + week
				+ "\n" + "Date :" + date + "\n"
				+ "Student No.			Last Name			First Name			Present\n"
				+ "Lecturer confirmed attendance: Yes\n" + "Students enrolled :" + lecturerArr[6] + "\n"
				+ "Attendance :" + array.size() + "\n" + "Room capacity :" + lecturerArr[5] + "\n"
				+ "Percentage occupancy :" + ((array.size() / (double) (Integer.valueOf(lecturerArr[6])) * 100)) + " %";
		// Date function is imported to record the time and date, the record
		// saved
		Date curDate = new Date();
		// Format of the date and time
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// Format of the saved file
		String fileName = sdf.format(curDate) + unitinput + ".txt";
		// Print the saved file name
		System.out.println(fileName);
		// Declare a variable to avoid report overwriting
		int number = 1;

		File file = new File("file" + number + ".txt");
		FileWriter fw = null;
		PrintWriter pw = null;
		Scanner sc = null;

		try {
			// Declare print writer to write the file
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			// Write the data to the file using print writer
			pw.println("Unit :" + unitinput);
			pw.println("Unit name :" + lecturerArr[1]);
			pw.println("Room :" + lecturerArr[2]);
			pw.println("Name :" + lecturerArr[3]);
			pw.println("Lecturer :" + lecturerArr[4]);
			pw.println("Week :" + week);
			pw.println("Date :" + date);
			pw.println("Student No.	Last Name	First Name	Present\n");
			for (String line2 : array) {
				pw.println(line2);
			}
			pw.println("Lecturer confirmed attendance: Yes");
			pw.println("Students enrolled :" + lecturerArr[6]);
			pw.println("Attendance :" + array.size());
			pw.println("Room capacity :" + lecturerArr[5]);
			pw.println("Percentage occupancy :" + ((array.size() / (double) (Integer.valueOf(lecturerArr[6])) * 100))
					+ " %");
		//Catches file not found exception
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				//Close file writer
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//Close print writer
			pw.close();
		}
	}

	// Method created to view the instruction codes
	public static void viewHelp() {
		System.out.println("Commands");
		System.out.print("\nas - Add Students\nal - Add Lecturer\nms - Modify Student\nml - Modify Lecturer\n");
		System.out.println("ds - Delete Student Details\ndl - Delete Lecturer Details\nvs - View Student Details");
		System.out.println(
				"vl - View Lecturer Details\nvr - View Attendance Report\nhelp - View Help\nexit - System exit");
	}
}
