public class Task {
    public static void main(String[] args){
/* TODO */
//This code is exactly the same as in Task 3 and should yield the same output.
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        /* TODO */
//Create an education object. Schoo is NEIU, major is Computer Science.


        Resume.Education edu = r.new Education("NEIU", "Computer Science");//accessing r instance of resume class


        /* TODO */
//add this education object to the resume "r"

        r.addEducation(edu);


        /* TODO */
//Create a new Experience object and add it to the resume.

        Resume.Experience experience = new Resume.Experience("Software Engineer", 2019, 2021);

        r.addExperience(experience);
        r.addExperience(new Resume.Experience("Medival Historian", 2015, 2016));


        /* TODO */
//Create a new experience object on the fly, inside the addExperiece call.);

        /* TODO */
//Add another experience object on the fly as you add it.);

        r.addExperience(new Resume.Experience("Psychic", 2009, 2017));
        r.addExperience(new Resume.Experience("Bartender", 2014, 2018));
        r.addExperience(new Resume.Experience("Secret Agent", 2007, 2011));

        System.out.println(r); //watch the resume print.

    }
}