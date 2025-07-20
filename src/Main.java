    

            class Student{
       String name;
       int rollnumber;
       char grade;
       Student(){
           name="kevin joseph";
           rollnumber=100;
           grade='A';
       }
       public void displayDetails() {
           System.out.println("Name:"+name);
            System.out.println("Rollnumber:"+rollnumber);
            System.out.println("Grade:"+grade);
       }
   }
    public class Main{
    public static void main(String[] args){
        Student student=new Student();
        student.displayDetails();
    }
}
        // TODO: Create a Student object and call the method to display details
    }
}
