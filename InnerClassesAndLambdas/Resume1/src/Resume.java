import java.util.ArrayList;
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
    private ArrayList<Education> educationList;//declation
    private ArrayList<Experience> experienceList;

    public Resume(Person p) {
        this.p = p;
        this.educationList= new ArrayList<Education>(); //initialization
        this.experienceList = new ArrayList<Experience>();
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

/* TODO */
//This constructor should initialize the person and do all necessary initializations for the other methods to work.



/* TODO */
//Create the addEducation, addExperience and override the toString methods as specified.



}
