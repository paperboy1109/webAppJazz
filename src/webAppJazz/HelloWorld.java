package webAppJazz;


import java.util.*;

class Course {
	private String crn;
	private String usp;	
	private String subject;
	private String cnumber;
	private String section;
	private String title;
	private int    credits;
	
	private String days;
	
	private String[] notes;
	

		public Course(String crn, String usp, String subject, String cnumber, String section, String title, int credits, String days, String[] notes) {
    		super();
    		this.crn = crn;
    		this.usp = usp;
    		this.subject = subject;
    		this.cnumber = cnumber;
    		this.section = section;
    		this.title = title;
    		this.credits = credits;
    		
    		this.days = days;
    		this.notes = notes;
		}

    	public String getCrn() {
		    return crn;
	    }
    	
    	public String getUsp() {
    		return usp;
    	}

	    public String getSubject() {
		    return subject;
	    }
	    
	    public String getCnumber() {
			return cnumber;
		}
	    
	    public String getSection() {
			return section;
		}
		public String getTitle() {
			return title;
		}
		public int getCredits() {
			return credits;
		}
		
		public String getDays() {
			return days;
		}

	    public String[] getNotes() {
		    return notes;
	    }


}

public class HelloWorld{

     public static void main(String []args){

        // Greetings
        System.out.println("Hello, Daniel\n");


        // Basic data types in Java
        int myNumber;
        myNumber = 1;

        char myChar;
        myChar = 'y';

        boolean myBoolean = false;
        /*
        System.out.println(myNumber);
        System.out.println(myChar);
        System.out.println("\u00a5 123");
        */


        // Working with arrays
        System.out.println("Working with arrays \n");
        int[] values;
        values = new int[3];
        System.out.println(values[0]);
        values[0] = 10;
        System.out.println(values[0]);

        /*
        int[] numbers = {1, 2, 3};
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        */


        //List<String> object
        System.out.println(" === Practice with the list interface === \n");
        List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");

        System.out.println("Here is a specific item from a List: ");
        System.out.println(supplierNames.get(1));

        
        
        
        // === Create course objects ===
        System.out.println("Working with Course objects \n");
        String crn = "123";
        String placeholderUsp = "Usp";
        String subj = "Java";
        String placeholderCNumber = "c123";
        String placeholderSection = "01";
    	String placeholderTitle = "myCourse";
    	int    placeholderCredits = 3;
        
        String myCourseDay = "M";
        String[] courseNotes = {"Note1", "Note2"};
        Course myCourse = new Course(crn, placeholderUsp, subj, placeholderCNumber, placeholderSection, placeholderTitle, placeholderCredits, myCourseDay, courseNotes);

        System.out.println("*Here is the CRN for myCourse: ");
        System.out.println(myCourse.getCrn());
        
        System.out.println("*Here is the first day for myCourse: ");
        System.out.println(myCourse.getDays());
        
        //Create another myCourse, but with different notes
        System.out.println("Working with Course objects \n");
        //String crn = "123";
        //String subj = "Java";
        myCourseDay = "W";
        String[] courseNotesB = {"Note3", "Note4"};
        Course myCourseB = new Course(crn, placeholderUsp, subj, placeholderCNumber, placeholderSection, placeholderTitle, placeholderCredits, myCourseDay, courseNotesB);
        
        //Create another myCourse, but with different notes
        System.out.println("Working with Course objects \n");
        //String crn = "123";
        //String subj = "Java";
        myCourseDay = "F";
        String[] courseNotesC = {"Note5", "Note6"};
        Course myCourseC = new Course(crn, placeholderUsp, subj, placeholderCNumber, placeholderSection, placeholderTitle, placeholderCredits, myCourseDay, courseNotesC);

        
        
        
        //Create another course object (to add to a list)
        String crn2 = "456";
        placeholderUsp = "Usp456";
        String subj2 = "Python";
        placeholderCNumber = "c456";
        placeholderSection = "02";
    	placeholderTitle = "yourCourse";
    	placeholderCredits = 1;
        
        String[] courseNotes2 = {"YourNote1", "YourNote2"};
        String yourCourseDay = "T";
        Course yourCourse = new Course(crn2, placeholderUsp, subj2, placeholderCNumber, placeholderSection, placeholderTitle, placeholderCredits, yourCourseDay, courseNotes2);
        System.out.println("Here is the CRN for yourCourse: ");
        System.out.println(yourCourse.getCrn());

        //Create another course object (to add to a list)
        String crn2B = "789";
        placeholderUsp = "Usp789";
        String subj2B = "Ruby";
        placeholderCNumber = "c789";
        placeholderSection = "03";
    	placeholderTitle = "yourCourseB";
    	placeholderCredits = 4;
        
        String[] courseNotes2B = {"YourNote1B", "YourNote2B"};
        yourCourseDay = "R";
        Course yourCourseB = new Course(crn2B, placeholderUsp, subj2B, placeholderCNumber,placeholderSection, placeholderTitle, placeholderCredits, yourCourseDay, courseNotes2B);
        System.out.println("Here is the CRN for yourCourseB: ");
        System.out.println(yourCourseB.getCrn());

        



        // Create a list of Courses
        // List<String> crunchifyList = new ArrayList<String>();
        List<Course> myList = new ArrayList<Course>();
        myList.add(myCourse);
        myList.add(myCourseB);
        myList.add(myCourseC);
        myList.add(yourCourse);
        myList.add(yourCourseB);
        myList.add(myCourse);
        myList.add(myCourse);
        myList.add(myCourseB);
        myList.add(myCourseC);
        


        // A basic for loop in Java
        /*
        for(int i=0; i < 5; i++){
            System.out.println("The value of i is" + i);
        }
        */


        // Use a loop to iterate through a list of courses
        /*
        for (Course element : myList) {
        // 1 - can call methods of element

        if(1 < 5){
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }

        System.out.println(element.getCrn());

        // ...
        }
        */







        // Combine notes from the same CRN into a single Course object
        System.out.println(" === COMBINING COURSES === \n");
        String previousCRN = "x123";
        String previousDays = "";
      //-------------------------------------
        String storedSubject = "";
        String storedUsp = "";
        String storedCNumber = "";
        String storedSection = "";
        String storedTitle = "";
        int storedCredits = 0;
      //-------------------------------------
        
        ArrayList<String> tempNotesArray = new ArrayList<String>();
        List<Course> finalList = new ArrayList<Course>();
        
        int loopCounter = 0;

        for (Course element : myList) {

            String currentCRN = null;
            String currentDays = null;
            String[] currentNotes = null;
            
            loopCounter++ ;
            System.out.println("\n\nWhat's the count?");
            System.out.println(loopCounter);


            // Check that the CRN has been recognized
            System.out.println("\nIterating through myList ...");
            if(element.getCrn() == "123"){
                System.out.println("Found myCourse!");
            } else {
                System.out.println("This is not myCourse");
            }

            
            
            
            // Get the current CRN info
            currentCRN = element.getCrn();
            System.out.println("The CRN is: ");
            System.out.println(currentCRN);
            
            // Get the current days info
            currentDays = element.getDays();
            System.out.println("Here are the days");
            System.out.println(currentDays);

            // Get the current info
            currentNotes = element.getNotes();
            System.out.println("The number of notes is:");
            System.out.println(currentNotes.length);
            System.out.println("The notes are:");
            System.out.println(currentNotes[0]);
            System.out.println(currentNotes[1]);

            // (1 of 7) Ignore (consecutive) duplicates
            if( (currentCRN == previousCRN) && (currentDays == previousDays) ) {
            	System.out.println("Duplicate course found");
            	
            // (2 of 7) A repeated CRN, with more CRNs to come
            } else if( (currentCRN == previousCRN) && (loopCounter != myList.size())) {
                System.out.println("SAME course found");

                //Since the CRN has not changed, combine the notes
                for(int i=0; i < currentNotes.length; i++){
                    tempNotesArray.add(currentNotes[i]);
                }
                
                //Since the CRN has not changed, combine the days
                previousDays = previousDays + currentDays;
                System.out.println("Here are the days UPDATED");
                System.out.println(previousDays);

            // (3 of 7) A repeated CRN, with no more CRNs to check
            } else if ((currentCRN == previousCRN) && (loopCounter == myList.size())){ 
            	
            	//Since the CRN has not changed, combine the notes
                for(int i=0; i < currentNotes.length; i++){
                    tempNotesArray.add(currentNotes[i]);
                }
                
                //Since the CRN has not changed, combine the days
                previousDays = previousDays + currentDays;
                System.out.println("Here are the days UPDATED");
                System.out.println(previousDays);
                
                // Create a Course object 
                String completeDays = "";
                completeDays = previousDays;
                
                String[] completeNotes = new String[tempNotesArray.size()];
                completeNotes = tempNotesArray.toArray(completeNotes);
                
                Course completeCourse = new Course(previousCRN, storedUsp, storedSubject, storedCNumber, storedSection, storedTitle, storedCredits, completeDays, completeNotes);
                finalList.add(completeCourse);
                
            // (4 of 7) The last CRN is being read in and it's not also the first (and not a repeat)
            } else if(loopCounter == myList.size() && (previousCRN != "x123")) {

                System.out.println("This is the last shot \n");

                //Create an object for the previous course
                String completeDays = "";
                completeDays = previousDays;
                
                String[] completeNotes = new String[tempNotesArray.size()];
                completeNotes = tempNotesArray.toArray(completeNotes);
                
                Course completeCourse = new Course(previousCRN, storedUsp, storedSubject, storedCNumber, storedSection, storedTitle, storedCredits, completeDays, completeNotes);
                finalList.add(completeCourse);
                
                
                // Create an object for the new course
                //-------------------------------------
                storedSubject = element.getSubject();
                storedUsp = element.getUsp();
                storedCNumber = element.getCnumber();
                storedSection = element.getSection();
                storedTitle = element.getTitle();
                storedCredits = element.getCredits();
                //-------------------------------------
                Course lastCourse = new Course(currentCRN, storedUsp, storedSubject, storedCNumber, storedSection, storedTitle, storedCredits, currentDays, currentNotes);
                finalList.add(lastCourse);

            // (5 of 7) There first CRN is being read and there are more to come
            } else if( (previousCRN == "x123") && (loopCounter != myList.size()) ) {

                System.out.println("This is the first course \n");
                previousCRN = currentCRN;
                //Save the notes and days
                for(int i=0; i < currentNotes.length; i++){
                    tempNotesArray.add(currentNotes[i]);
                }
                previousDays = currentDays;
                // Save other course info
                //-------------------------------------
                storedSubject = element.getSubject();
                storedUsp = element.getUsp();
                storedCNumber = element.getCnumber();
                storedSection = element.getSection();
                storedTitle = element.getTitle();
                storedCredits = element.getCredits();
                //-------------------------------------
                

            // (6 of 7) There is only one CRN
            } else if ( (previousCRN == "x123") && (loopCounter == myList.size()) ) { 
            	
            	/*
            	// Save the info for this one course
                previousCRN = currentCRN;
                previousDays = currentDays;
                // Update the temporary notes array
                tempNotesArray.clear();
                for(int i=0; i < currentNotes.length; i++){
                    tempNotesArray.add(currentNotes[i]);
                }
                */
                
                // Create an object for for this one course
            	//-------------------------------------
                storedSubject = element.getSubject();
                storedUsp = element.getUsp();
                storedCNumber = element.getCnumber();
                storedSection = element.getSection();
                storedTitle = element.getTitle();
                storedCredits = element.getCredits();
                //-------------------------------------
                Course lastCourse = new Course(currentCRN, storedUsp, storedSubject, storedCNumber, storedSection, storedTitle, storedCredits, currentDays, currentNotes);
                finalList.add(lastCourse);
            	
            	
            // (7 of 7) A new CRN has been read (it's not the first) and there are more to come
            } else {
                System.out.println("new course found");
                // Create a Course object for the old course
                String completeDays = "";
                completeDays = previousDays;
                
                String[] completeNotes = new String[tempNotesArray.size()];
                completeNotes = tempNotesArray.toArray(completeNotes);
                /*
                for(String s : completeNotes){
                    System.out.println(s);
                }
                */
                Course completeCourse = new Course(previousCRN, storedUsp, storedSubject, storedCNumber, storedSection, storedTitle, storedCredits, completeDays, completeNotes);
                finalList.add(completeCourse);
                System.out.println(finalList.size());

                // Save the CRN, days, and notes
                previousCRN = currentCRN;
                previousDays = currentDays;
                System.out.println("Here are the days UPDATED");
                System.out.println(previousDays);
                // Update the temporary notes array
                tempNotesArray.clear();
                for(int i=0; i < currentNotes.length; i++){
                    tempNotesArray.add(currentNotes[i]);
                }
                // Save other course info
                //-------------------------------------
                storedSubject = element.getSubject();
                storedUsp = element.getUsp();
                storedCNumber = element.getCnumber();
                storedSection = element.getSection();
                storedTitle = element.getTitle();
                storedCredits = element.getCredits();
                //-------------------------------------
                
            }


            // What's in the tempNotesArray?
            System.out.println("Here is the tempNotesArray: ");
            System.out.println(tempNotesArray);

        }

        
        
        
        
        // Display the length of the finalList:
        System.out.println("Here is the number of courses in the final list: ");
        System.out.println(finalList.size());


        System.out.println("\n\n\nHere is the final list of courses (by CRN): ");
        // Display the finalList
        String[] flotsamNotes = null;
        for (Course element : finalList) {
        	
        	System.out.println("\n");
            System.out.println(element.getCrn());
            System.out.println(element.getUsp());
            System.out.println(element.getSubject());
            System.out.println(element.getCnumber());
            System.out.println(element.getSection());
            System.out.println(element.getTitle());
            System.out.println(element.getCredits());
            
            System.out.println(element.getDays());
            flotsamNotes = element.getNotes();
            for(String s : flotsamNotes){
                System.out.println(s);
            }

        }

        System.out.println("\n\n\n Number of loops, orignial course count, final course count\n");
        System.out.println(loopCounter);
        System.out.println(myList.size());
        System.out.println(finalList.size());
        
        if( (1 == 1) && (2 <3)){
            System.out.println("Your logic checks out!");
        }

     }



}

