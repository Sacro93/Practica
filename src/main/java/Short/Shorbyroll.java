package Short;

import java.util.Comparator;

 class Shorbyroll implements Comparator<Student> {


     @Override
     public int compare(Student a, Student b) {
         return a.rollno - b.rollno;
     }
 }
