/* TODO */
//The imports will self populate. You don't have to do anything.

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;

public class Resume {
    /* TODO */
//Create a public member inner class Education according to the specifications.

    public class Education{
        String school;
        String major;

        public Education(String edu, String major){
            this.school = edu;
            this.major = major;
        }
        public void setEducation(String edu){ //setter??
            this.school = edu;
        }
        public String getEducation(){
            return this.school;
        }
        public void setMajor(String major){
            this.major = major;
        }
        public String getMajor(){
            return this.major;
        }
        @Override
        public String toString(){
            return this.major + " at " + this.school;
        }
    }

    /* TODO */
//Create a public static inner class called Experience, according to the specifications.

    public static class Experience {
        String title;
        int startYear;
        int toYear;
        public Experience(String title, int startYear, int endYear){
            this.title = title;
            this.startYear = startYear;
            this.toYear = endYear;
        }
        @Override
        public String toString(){
            return this.startYear + "-" + this.toYear+ ":" + this.title;
        }
    }

    /* TODO */
//Create the Person and List of Education and List of experience objects. They should be private.//
    private Person p;
    private ArrayList<Education> educationList;//declaration
    private PriorityQueue<Experience> experienceList;
    public Resume(Person p) {
        this.p = p;
        this.educationList= new ArrayList<Education>(); //initialization of empty list
        //Comparator<String> stringLengthComparator = new Comparator<>() {
        this.experienceList = new PriorityQueue<Experience>(new Comparator<Experience>() {
            @Override
            public int compare(Experience ex1, Experience ex2) {
                int compare = ex2.toYear - ex1.toYear;
                return compare;
            }
        });
    }
    public void addEducation(Education education){
        this.educationList.add(education);
    }
    public void addExperience(Experience experience){
        this.experienceList.add(experience);
    }
    @Override
    public String toString(){
        String resume;
        resume = this.p.toString() + "\n";
        resume = resume + "Experience" + "\n";
        for(Experience e: experienceList){
            resume += e.toString()+"\n";
        }
        resume = resume + "Education" + "\n";
        for(Education e: educationList){
            resume += e.toString()+"\n";
        }

        return resume;
    }
    public PriorityQueue<Experience> getExperience() {
        return this.experienceList;
    }
    /* TODO */
//This constructor should initialize the person and do all necessary initializations for the other methods to work.



    /* TODO */
//Create the addEducation, addExperience and override the toString methods as specified.



}








/* TODO */
//Copy the two inner classes of Resume exactly as they were in Task 2. Copy->paste.

    /* TODO */
//Create a member variable of type Person (exactly as in task 2)

    /* TODO */
//Create a List to hold values of type Education (exactly as in task 2)

    /* TODO */
//Create a Priority Queue that holds values of type Experience.

/* TODO */
//Assign a value to the Person variable.

/* TODO */
//Initialize the List with Education objects.
//* TODO */
//Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.


/* TODO */
//Add a standard getter for the experiences. getExperience. it should return a priority queue.


/* TODO */
//Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)




