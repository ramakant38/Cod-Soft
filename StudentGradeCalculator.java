import java.util.*;

class StudentMark
{
    Scanner sc = new Scanner(System.in);
        int res, per, total=600;
		int avg, avg1;
        void inputmark()
        {
            System.out.println("Enter the mark of the Student");
            System.out.println("NAME OF SUBJECTS        FULL MARK       OBTAINED MARK");
            System.out.print("   Literature               100                ");
            int lit = sc.nextInt();
            System.out.print("   Mathmetics               100                ");
            int mat = sc.nextInt();
            System.out.print("   Physics                  100                ");
            int phy = sc.nextInt();
            System.out.print("   Chemistry                100                ");
            int che = sc.nextInt();
            System.out.print("   IT                       100                ");
            int it = sc.nextInt();
            System.out.print("   Biology                  100                ");
            int bio = sc.nextInt();
            System.out.println("______________________________________________________");

			res =( lit + mat + phy + che + it + bio);
            System.out.println("   Total                    600               "+res);
         
    
        }
        void calculatemark()
        {
            System.out.println("Total Obtained Mark is     :"+ res);
            avg = total/6;
            System.out.println("Average Percentage is      :"+ avg+"%");
            
            avg1 = (res*100)/600;
            System.out.println("Student obtained Average Percentage is  :"+avg1+"%");
        }
        void gradeInfo()
        {
            System.out.println("Percentage         Grade");
            System.out.println("_________          ______");
            System.out.println("90-100               'O'");
            System.out.println("80-89                'A'");
            System.out.println("70-79                'B'");
            System.out.println("60-69                'C'");
            System.out.println("50-59                'D'");
            System.out.println("35-49                'E'");
            System.out.println("Less than 35         'Fail'");
        }   
        void gradeObtained()
        {
            if(avg1 >= 90 && avg1 <= 100)
            {
                System.out.println("Student has got Grade 'O'");
            }
            else if(avg1 >= 80 && avg1 < 90 )
            {
                System.out.println("Student has got Grade 'A'");
            }
            else if(avg1 >=70 && avg1 < 80)
            {
                System.out.println("Student has got Grade 'B'");
            }
            else if(avg1 >= 60 && avg1 < 70)
            {
                System.out.println("Student has got Grade 'C'");
            }
            else if(avg1 >=50 && avg1 < 60)
            {
                System.out.println("Student has got Grade 'D'");
            }
            else if(avg1 >=35 && avg1 < 50)
            {
                System.out.println("Student has got Grade 'E'");
            }
            else 
            {
                System.out.println("Student has failed in the exam");
            }
        }
}  

public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        StudentMark ob = new StudentMark();

        ob.inputmark();
        ob.calculatemark();
        ob.gradeInfo();
        ob.gradeObtained();
    }
}