package com.infix.shabbir.constructor;

public class Students {



   /* public Students(){

        System.out.println("Calling Contructior");
    }*/

   String studentsName;
   int  rullNumber;

    public Students (String studentsName, int rullNumber){

        this.studentsName= studentsName;
        this.rullNumber=rullNumber;

    }

    public static void main(String[] args) {

        Students s = new Students("Shabbir",101);
        System.out.println(s.studentsName);
        System.out.println(s.rullNumber);

    }
}
