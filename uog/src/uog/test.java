//package uog;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import uog.Student;
//
//public class test {
//	static List<Student> studentlist = new ArrayList<Student>();
//	public static void main(String[] args) throws IOException{
//		File file = new File("Students.txt"); 
//		Scanner sc = new Scanner(file); //locates the file using scanner.
//		System.out.println("Please Mark attendance with Y/N ");
//		String line =" ";
//
//		//System.out.println("Enter the Unit ID: ");
//		
//		while (sc.hasNext()){ //the loop which is used to iterate through the file (in english, while the file has a next line, do what is inside the body of the loop.
//			//String input = sc.next(); // now we have come to a line.
//			if (line.contains("ECSC400")){ // nnow we are there.
//				System.out.println("Please Mark attendance with Y/N ");
//				String[] temp = line.split("\t");//me line eken wenne mekai. when we take the line, u know it is a string. split method eken wenne, string 1k deela thiyena ekak dakkma podi podi stirngs walata break karana eka. basically methana wenne, line eka tab space 1k dakka gaman break karana eka.
//				Student s1 = new Student();
//				s1.setstdNum(temp[0]);
//				s1.setFirstName(temp[1]);
//				s1.setsurname(temp[2]); //so now, the big string is broken down into four(u know right? theruna ne?) small strings.4? yes, not in this code, me code eka api hadiwe student record file ekata nehhh ope yes/got it ..so in studentdetails eke 3kata ne? stdNum,surname and firstName ya. eka line ekak, tab spaces walin wen unama, parts gaana thamai me split wela hadena array eke size eka. theruna ne?ow bn theruna
//				studentlist.add(s1); //so now, when u think about a line, all these splitted values belong to one thing right?yah, so it is gonna be easier for us if we keep those splitted stuff inside one variable than having so many variables right?true bro . thats why we use objects. it is like a varable which has multiple variables inside it.yh git it
//			}//?sec loop 1k athule objects hadaddi hama object ekatama enne same name eka. so we use an arraylist. therune natham kiyapan. give me 20mins wil come back
//			
//			String s = sc.nextLine().trim();
//		System.out.println(s);
//		}
//			
//			}
	//	}
//File file = new File("studentdetails.txt"); 
//Scanner sc = new Scanner(file); //locates the file using scanner.
////	System.out.println("Please Mark attendance with Y/N ");
//
////System.out.println("Enter the Unit ID: ");	
//
//while (sc.hasNextLine()){ //the loop which is used to iterate through the file (in english, while the file has a next line, do what is inside the body of the loop.
//	//String input = sc.next(); // now we have come to a line.
//	String studentline = sc.nextLine();
//	System.out.println("hi");
//	if (studentline.contains("201")){ // nnow we are there.
//		System.out.println("hi5");
//		System.out.println("Please Mark attendance with Y/N ");
//		String[] temp = studentline.split("\t");//me line eken wenne mekai. when we take the line, u know it is a string. split method eken wenne, string 1k deela thiyena ekak dakkma podi podi stirngs walata break karana eka. basically methana wenne, line eka tab space 1k dakka gaman break karana eka.
//		Student s1 = new Student();
//		s1.setstdNum(temp[0]);
//		s1.setFirstName(temp[1]);
//		s1.setsurname(temp[2]); //so now, the big string is broken down into four(u know right? theruna ne?) small strings.4? yes, not in this code, me code eka api hadiwe student record file ekata nehhh ope yes/got it ..so in studentdetails eke 3kata ne? stdNum,surname and firstName ya. eka line ekak, tab spaces walin wen unama, parts gaana thamai me split wela hadena array eke size eka. theruna ne?ow bn theruna
//		studentlist.add(s1);
//		System.out.println("Student AaAdded.");
//		//so now, when u think about a line, all these splitted values belong to one thing right?yah, so it is gonna be easier for us if we keep those splitted stuff inside one variable than having so many variables right?true bro . thats why we use objects. it is like a varable which has multiple variables inside it.yh git it
//	}//?sec loop 1k athule 
//	//sSystem.out.println(studentlist);
//}
//File file2 = new File("Lecturer.txt");
//Scanner sc2 = new Scanner(file2);
//
//while (sc2.hasNextLine()){
//	String lecturerline = sc2.nextLine();
//	if(lecturerline.contains("ECSC400")){
//		String[] templ = lecturerline.split("\t");
//		Lecturer l1 = new Lecturer();
//		for(String str:templ){ 
//			System.err.println(str);
//		}
//		l1.setunitId(templ[0]);
//		l1.setunitName(templ[1]);
//		l1.setroomNo(templ[2]);
//		l1.setroomName(templ[3]);
//		l1.setlName(templ[4]);
//		l1.setcapacity(templ[5]);
//		l1.setenrol(templ[6]);
//		lecturerlist.add(l1);
//	}
//	}
//File file3 = new File("attendancelog.txt");
//Scanner sc3 = new Scanner(file2);
//while (sc3.hasNextLine()){
//	String attline = sc3.nextLine();
//	if(attline.contains("ECSC400")){
//		String[] tempa = attline.split("\t");
//		attendancelog a1 = new attendancelog();
//		a1.setroomNo(tempa[0]);
//		a1.setstdNum (tempa[1]);
//		a1.setunitId(tempa[2]);
//		a1.setlName(tempa[3]);
//		a1.setdate(tempa[4]);
//		a1.setweekNo(tempa[5]);
//		attendance.add(a1);
//		System.out.println("Att Added.");
//		
//		
//	}
//}
////template();
//System.out.println(lecturerlist.get(0));
//}

//Scanner  sc = new Scanner (new File("studentdetails.txt"));
//Scanner sc2 = new Scanner (new File("lecturer.txt"));
//Scanner sc3 = new Scanner (new File("attendancelog.txt"));
//
//Student stu = new Student();
//Lecturer lec = new Lecturer();
//attendancelog att = new attendancelog();
//
//ArrayList<Student> list = new ArrayList<Student>();
//list.add(stu);
//List<Student> studentlist = surname,firstName;
//
//ArrayList<Lecturer>list2 = new ArrayList<Lecturer>();
//list2.add(lec);
//
//ArrayList<attendancelog>list3 = new ArrayList<attendancelog>();
//list3.add(att);
//
//

//		while (sc.hasNext()){
//String line = sc.nextLine();
////System.out.println(line);
//if (line.contains("2015")){
//	String[] temp = line.split("\t");
//	Student s1 = new Student();
//	s1.setstdNum(temp[0]);
//	s1.setFirstName(temp[1]);
//	s1.setsurname(temp[2]);
//	list.add(s1);
//System.out.println("Unit ID : "+unitId);
//System.out.println(("Unit Name :"+unitName));
//
//
/*	try {
BufferedReader in = new BufferedReader(new FileReader("attendancelog.txt"));
String line;
System.out.println("Attendance Report");
String [] list={"Unit","Unit Name","Room","Name","Lecturer","Week#","Date"};
// Read line by line and display
while ((line = in.readLine()) != null) { 
	System.out.println(list +line);
}
in.close();
} catch (IOException error) {
System.out.println("Caught");
}
}
*/	
/*try {
Scanner sc = new Scanner(new File("studentdetails.txt"));
Scanner sc1 = new Scanner(new File("lecturer.txt"));

ArrayList<String>list = new ArrayList<String>();
while (sc.hasNext()){
	list.add(sc.next());
}
sc.close();

while (sc1.hasNext()){
	list.add(sc.next());
}
System.out.println(list);
} catch (FileNotFoundException e) {
e.printStackTrace();
}*/
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter Unit Name: ");
//String unitInput = sc.next();
////
//
//
//try {
//	//FileInputStream fis = new FileInputStream("studentdetails.txt");
//	//FileInputStream fis2 = new FileInputStream("lecturer.txt");
//	
//	FileReader in = new FileReader("studentdetails.txt");
//	FileReader in2 = new FileReader("lecturer.txt");
//	FileReader in3 = new FileReader ("attendancelog.txt");
//    BufferedReader br = new BufferedReader(in);
//    BufferedReader br2 = new BufferedReader (in2);
//    BufferedReader br3 = new BufferedReader (in3);
//  //// BufferedReader reader2 = new BufferedReader(new FileReader(fis2));
//
//String line;
//StringBuilder strBuilder = new StringBuilder();
////Read line by line in the file
//while ((line = br.readLine()) != null) {
//	
//	System.out.println(line);
//	String words[] = line.split("\t");
//	if (words.length > 0) {
//		//Assign unitID to word[0]
//		if (words[0].contains(unitId)) {
//			if (unitName != null)
//				words[1] = unitName;
//			if (roomNo != null)
//				words[2] = roomNo;
//			if (roomName != null)
//				words[3] = roomName;
//			if (lName != null)
//				words[4] = lName;
//			if (capacity != null)
//				words[5] = capacity;
//			if (enrol != null)
//				words[6] = enrol;
//
//			String newLine = words[0] + "\t" + words[1] + "\t" + words[2] + "\t" + words[3] + "\t"
//					+ words[4] + "\t" + words[5] + "\t" + words[6];
//			strBuilder.append(newLine);
//			strBuilder.append("\n");
//			System.out.println("Attendance Report");
//			System.out.println("Unit\t:\t"+unitInput);
//			System.out.println("Unit Name\t:\t"+unitName);
//			System.out.println("Room\t:\t"+roomNo);
//			System.out.println("Name\t:\t"+lName);
//		
//		} else {
//			strBuilder.append(line);
//			strBuilder.append("\n");
//		}
//	}			}} catch (Exception e) {
//    e.printStackTrace();
//}
//public static void readFiles() throws IOException{}
//File file = new File("studentdetails.txt"); 
//Scanner sc = new Scanner(file); //locates the file using scanner.
//while (sc.hasNextLine()){ //read line by line
//String studentline = sc.nextLine(); 
//if (studentline.contains("201")){ //read every line contains 201
//	String[] temp = studentline.split("\t"); //identify tab spaces and split
//	for(String str:temp){
//		System.out.println(str);
//	}
//	Student s1 = new Student(); // create an object
//	s1.setstdNum(temp[0]); //divide data
//	s1.setFirstName(temp[1]);
//	s1.setsurname(temp[2]);
//	studentlist.add(s1);//all variables under one variable
//	System.out.println("Student added.");
//}
//System.out.println(studentlist.get(0));
//File file2 = new File("Lecturer.txt");
//Scanner sc2 = new Scanner(file2);
//
//while (sc2.hasNextLine()){
//String lecturerline = sc2.nextLine();
//if(lecturerline.contains("ECS")){
//	String[] templ = lecturerline.split("\t");
//	Lecturer l1 = new Lecturer();
//	l1.setunitId(templ[0]);
//	l1.setunitName(templ[1]);
//	l1.setroomNo(templ[2]);
//	l1.setroomName(templ[3]);
//	l1.setlName(templ[4]);
//	l1.setcapacity(templ[5]);
//	l1.setenrol(templ[6]);
//	lecturerlist.add(l1);
//	System.out.println("Lecturer added");
//}
//}
//File file3 = new File("attendancelog.txt");
//Scanner sc3 = new Scanner(file3);
//while (sc3.hasNextLine()){
//String attline = sc3.nextLine();
//if(attline.contains("2")){
//	String[] tempa = attline.split("\t");
//	attendancelog a1 = new attendancelog();
//	a1.setroomNo(tempa[0]);
//	a1.setstdNum (tempa[1]);
//	a1.setunitId(tempa[2]);
//	a1.setlName(tempa[3]);
//	a1.setdate(tempa[4]);
//	a1.setweekNo(tempa[5]);
//	attendance.add(a1);
//	System.out.println("Att Added.");
//	//template(unitId,lecturer);
//	
//}
//}}
//}
//public static void read() throws IOException{
//
//}
//


//public static void markAttendance() throws FileNotFoundException{
/*try {
BufferedReader in = new BufferedReader(new FileReader("student.txt"));
String line;
//System.out.println("Student No\tSurname\t\tFirst Name\t\tPresent");
// Read line by line and display
//String line2;
//StringBuilder strBuilder = new StringBuilder();
//Read line by line in the file
while ((line = in.readLine()) != null) {
	String words[] = line.split(";\\t");
	if (words.length > 0) 
		//Assign stdNum to word[0]
		if (words[0].contains(stdNum));
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Mark attendace with Y / N: ");
	System.out.print(stdNum);
	String mark = sc.nextLine();
	System.out.println(mark);
}
in.close();
} catch (IOException error) {
//System.out.println("Caught");
//}*/
//File file = new File ("students.txt"); 
//Scanner sc = new Scanner(file);;
//System.out.println("Please Mark attendance with Y/N ");
//System.out.println(sc.nextLine());

//	public static void report(){
//		List<String> listLec = new ArrayList<>();
//		List<String> concT = new ArrayList<>();
//		String date = "";
//		String week ="";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter unit :");
//		String unit = sc.next();
//		String line ="";
//		ArrayList<String> studentPresent = new ArrayList<>();
//		List<String>
//		BufferedReader br = new BufferedReader(new FileReader("attendancelog.txt"));
//	
//		while((line = br.readLine())!= null){
//		if(line.contains(unit)){
//		System.out.println(line);
//			concT=Arrays.asList(line.split("\t"));
//			studentPresent.add(concT.get(1));
//			date = concT.get(4);
//			week = concT.get(5);
//	//	}	
//	}
//	for(String str:studentPresent){
//		System.err.println(str +"  "+studentPresent.size());
//	}
//	
//	BufferedReader brLec = new BufferedReader(new FileReader("lecturer.txt"));
//	while((line = brLec.readLine())!= null){
//		if(line.contains(unit)){
//			listLec=Arrays.asList(line.split("\t"));
//			
//			
//		}
//	}
//	}
//	//System.err.println(listLec);
//	List<String> studentRecord = new ArrayList<>();
//	BufferedReader brStu = new BufferedReader(new FileReader("studentsdetails.txt"));
//	while((line = brStu.readLine())!=null){
//		for(String str:studentPresent){
//			if(line.contains(str)){
//				studentRecord.add(line+"      Y");
//			}
//		}
//	}
//	String[] arrStu = studentRecord.toArray(new String[studentPresent.size()-1]);
//	String[] arrLec = listLec.toArray(new String[listLec.size()]);
//	System.err.println(studentRecord);
//	
//	reportReport(unit,arrLec,week,date,studentRecord);
//	
//	}	

