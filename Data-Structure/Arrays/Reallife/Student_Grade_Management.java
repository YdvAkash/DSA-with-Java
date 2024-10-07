import java.lang.reflect.Array;
import java.util.*;
public class Student_Grade_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Student in Class : ");
        int n = sc.nextInt();
        // int n= 5;    // Update after test 
        while(true){
        int Threshold = 25;
        int[][] Marks = new int[n][5];
        // int[][] Marks = {
        //     {21, 24, 29, 20, 27},
        //     {30, 23, 26, 22, 21},
        //     {28, 20, 24, 25, 29},
        //     {22, 30, 27, 23, 24},
        //     {21, 25, 28, 22, 30}
        // };

        System.out.println("\n  Enter as  \n 1. Student  \n 2. Teacher \n 3. Exit ");
        System.out.print("Enter a Choice no : ");
        int choice = sc.nextInt();
          switch (choice) {
            case 1:
                System.out.println("You Logged In as a Student ");
                System.out.println("Enter Your Roll No ");  // remove  boundation limit after trail
                int Roll_no = sc.nextInt();
                System.out.println(" \n 1. Your Marks   \n 2. Your Backlogs \n 3. Percentage  \n 4.Exit ");
                System.out.print("Enter a Choice no : ");
                int Studentchoice = sc.nextInt();
                switch (Studentchoice) {
                    case 1:
                        System.out.print("Your Marks : ");
                        ArrayList<Integer> Answer11 = StudentMarks(Marks,Roll_no); 
                        System.out.println(Answer11);
                        break;
                    case 2:
                        System.out.print("Your Backlogs : ");
                        ArrayList<Integer> Answer12 = StudentBacklogs(Marks,Roll_no,Threshold); 
                        System.out.println(Answer12);
                        break;
                    case 3:
                        System.out.print("Your Percentge : ");
                        float Answer13 = StudentPercentage(Marks,Roll_no);
                        System.out.print( Answer13 +"%");
                        break;
                    case 4:
                        System.out.println("Existing.....");
                        return;
                    default:
                    System.out.println("Invalid choice. Please try again.");
                }
                break;
            case 2:
                System.out.println("You Logged In as a Teacher ");
                System.out.println("\n1. Display Marks \n2. Enter Student Numbers  \n5.Exit  ");
                System.out.print("Enter Your Choice :");
                int TeacherChoice = sc.nextInt();
                
                    switch (TeacherChoice) {
                        
                        case 1:
                            System.out.println("---- Whole Class Number --");
                            ArrayList<int[]> Answer14=DisplayMarks(Marks,n);
                            System.out.println(Answer14);
                            break;
                        case 2:
                            for(int i =0 ; i< Marks.length;i++){
                                System.out.println("Enter Number of Roll-No  "+ i);
                                for(int j=0;j<Marks[i].length;j++){
                                    Marks[i][j]= sc.nextInt();
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Exiting .......");
                            return;
                       
                        default:
                        System.out.println("Invalid choice. Please try again.");
                            
                    }
                break;
            case 3:
                
                 return; 
            default:
            System.out.println("Invalid choice. Please try again.");
          } 
        }
    }


   public static ArrayList<Integer> StudentMarks( int[][] Marks, int Roll_no){
        ArrayList<Integer> value = new ArrayList<>();
       for(int i =0 ; i <Marks[Roll_no].length;i++){
         value.add(Marks[Roll_no][i]);
       }
        return value;
    }

   public static ArrayList<Integer> StudentBacklogs(  int[][] Marks , int Roll_no, int Threshold){
        ArrayList<Integer> value = new ArrayList<>();
        for(int i =0 ; i <Marks[Roll_no].length;i++){
              if(Marks[Roll_no][i] < Threshold){
                value.add(Marks[Roll_no][i]);
              }
          }
        return value;
   }

   public static float StudentPercentage(int[][] Marks , int Roll_no) {
    int sum =0;
        for(int i=0 ; i< Marks[Roll_no].length;i++){
           sum = sum + Marks[Roll_no][i];
        }
       float value = (sum/3);
          return value;
   }
   public static ArrayList<int[]> DisplayMarks(int[][] Marks,int n) {
    ArrayList<int[]> Value = new ArrayList<>();
        for(int i=0; i<n;i++){
          Value.add(Marks[i]);
       }
       return Value;
   }
 
}
