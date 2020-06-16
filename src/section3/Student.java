package section3;

import java.util.Random;
import java.util.Set;

public class Student {

    private String name;
    private String SSN;
    private String email;
    private String number;
    private String city;
    private String state;
    private String userID;
    private static int id = 1001;
    private Set<Student> studentDataSet;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", SSN='" + SSN + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }

    public Student(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
        email = name + "@lol.com";

        //Generate userID from A) a static value, B) A random value between 1000-9000 and C) the SSN
        Random r = new Random();
        int randomValue = r.nextInt((9000 - 1000) + 1) + 1000;
        userID = Integer.toString(id) + Integer.toString(randomValue) + SSN ;
    }

    
}
