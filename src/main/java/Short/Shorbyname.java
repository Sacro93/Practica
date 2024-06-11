package Short;

import java.util.Comparator;

 class Shorbyname implements Comparator<Student> {

     public int compare(Student a, Student b){
         return a.name.compareTo(b.name);
     }
}
