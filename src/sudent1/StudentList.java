/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudent1;

public class StudentList {
    public static void main(String[] args){
       // Sudent1 s1 = new Sudent1("s1","Chris");
       Sudent1[] studentList = new Sudent1[3];
       studentList[0] = new Sudent1("s1","Chris");
       studentList[1] = new Sudent1("s2","Hugh");
       studentList[2] = new Sudent1("s3","Moe");
       
       for(int i = 0; i < studentList.length; i++){
           System.out.println(studentList[i].getStudentName());
       }
    }
}
