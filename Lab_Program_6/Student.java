package CIE;

import java.util.*;

public class Student{

        Scanner sc = new Scanner(System.in);
        public String usn,name;
        public int sem;

public void accept(){

System.out.println("Enter the usn: ");
usn = sc.nextLine();
System.out.println("Enter the name: ");
name = sc.nextLine();
System.out.println("Enter the sem: ");
sem = sc.nextInt();

}

public void display(){

System.out.println("Name: " + name);
System.out.println("USN: "+usn);
System.out.println("Sem: " + sem);

}

}
