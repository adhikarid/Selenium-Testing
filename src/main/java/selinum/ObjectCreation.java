package selinum;

public class ObjectCreation{
	public static void main(String[] args) {
        Student sobj= new Student();
         sobj.setName("John joe");
         int [] marks = {60,70,80};
         sobj.setTestValue(marks );
         System.out.println("grade of student "+sobj.getName()+" :-"+sobj.getGrade());
         sobj.setName("deepak");
         int [] number = {20,70,80};
         sobj.setTestValue(number);
         System.out.println("grade of student"+sobj.getName()+":"+sobj.getGrade());
         
         

	}

}
class Student
{
        public final static int NUM_TESTS = 3;
       String name;
        int[] tests;
      String grade;
      public  void setName(String Student_name)
        {
                name =Student_name; 
        }
        public String getName()
        {
                return name; 
        }


        public void setTestValue(int[] marks)
        {
                tests=marks;
                        
          }
       
        public String getGrade()
        {
                return computeGrade() ; 
        }
        public String computeGrade()
        {
        if (name.equals(""))
        grade = "No grade";
        else if (getTestAverage() >= 65)
        grade = "Pass";
        else
        grade = "Fail";
                return grade;
        }
        public double getTestAverage()
        {
        double total = 0;
        for (int score : tests)
        total += score;
        return total/NUM_TESTS;
        }
       
        }