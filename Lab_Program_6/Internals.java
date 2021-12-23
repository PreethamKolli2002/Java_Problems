package CIE;

import java.util.*;

public class Internals extends CIE.Student
{

Scanner sc = new Scanner(System.in);
public int ciem[] = new int[5];

public void accept(){

for(int i=0;i<5;i++){

System.out.println("Enter the cie marks of subject " + (i+1));
ciem[i] = sc.nextInt();

}

}

}
