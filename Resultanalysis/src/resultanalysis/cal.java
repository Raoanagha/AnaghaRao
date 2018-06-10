package resultanalysis;

import java.util.Scanner;

/**
 *This is a public class containing all the methods
 * 
 * 
 */
public class cal 
{
            int i=0,j=0,n=0;
            private int sum[]={0};
            private int max;
            private int roll[]; 
            private int math[];
            private int mmc[];
            private int dbms[];
            private int os[];
            private int daa[];
            private String name[];
            private String topper;
            private int topperroll;
            private int p,p1,p2,p3,p4,p5;
            private int f,f1,f2,f3,f4,f5;
            private int mathmax;
            private String mathtopper;
            private int mathtopperroll;         
            private int mmcmax;
            private String mmctopper;
            private int mmctopperroll;
            private int osmax;
            private String ostopper;
            private int ostopperroll;
            private int dbmsmax;
            private String dbmstopper;
            private int dbmstopperroll;
            private int daamax;
            private String daatopper;
            private int daatopperroll;
            
            /**
             * This method takes input from the user<br>
             * It collects information of all the students<br>
             * n-number of students<br>
             * name-name of the student<br>
             * roll-roll no<br>
             * math-marks scored in math<br>
             * dbms-marks scored in dbms<br>
             * mmc-marks scored in mmc<br>
             * os-marks scored in os<br>
             * daa-marks scored in daa<br>
             * 
             */
            public void input()
            {
                    System.out.println("Enter the number of students: ");
                    Scanner s = new Scanner(System.in);
                     n = s.nextInt();
                     roll=new int[n];
                     math=new int[n];
                     mmc=new int[n];
                     dbms=new int[n];
                     os=new int[n];
                     daa=new int[n];
                     name = new String[n];                 
                     
                     
                      for (i = 0; i <n; i++)
            {
                    System.out.println("\nEnter name" );                      
                    name[i]=s.next() + " " +s.next();      		
                    System.out.println("Enter roll number" );
                    roll[i] = s.nextInt();
                
                    System.out.println("\nEnter math marks" );
                    math[i] = s.nextInt();
                    System.out.println("\nEnter mmc marks" );
                    mmc[i] = s.nextInt();
                    System.out.println("\nEnter dbms marks" );
                    dbms[i] = s.nextInt();
                    System.out.println("\nEnter os marks" );
                    os[i] = s.nextInt();
                    System.out.println("\nEnter daa marks" );
                    daa[i] = s.nextInt();
            }
            }
            /**
            *This method displays all the information collected 
            */
            
            public void display()
            {
               System.out.println("NAME\t\t\t" + "ROLL NO    " + "\t\t\tMARKS");
               System.out.println("    \t" + "        " + "\t\t\tMATH  "+"MMC   "+"  DBMS  "+"   OS    "+"   DAA   ");
               
               for(i=0;i<n;i++)
              {
        
               System.out.println(""+name[i] + "\t  "+roll[i] + "\t      "+math[i] + "      "+mmc[i] + "      "+dbms[i] + "      "+os[i] + "      "+daa[i] );
               
              }
            }
            
            /**
             *  This method calculates total marks obtained by each student<br>
             * sum[]- An array to store total marks of each student<br>
             */
            
            public void total()
            {
               
                 sum=new int[n];
                
                 System.out.println("STUDENT NAME   " + "  TOTAL MARKS");   
                 
                 for (i=0; i<n; i++)
            {  
                   
                  sum[i]=sum[i]+(math[i] +mmc[i] +dbms[i]+ os[i] +daa[i]);
             
                  System.out.println(""+name[i]+"        \t "+sum[i]);	
          
            }
            }
            /**
             * This method finds out the student securing highest marks in the class<br>
             * max- marks scored by the topper<br>
             * topper-name of the topper<br>
             * topperroll-rollno of the topper
             */
            public void classtopper()
            {
               
              
               
                 max=sum[0];
                 
                for ( i = 1; i < n; i++)
            {
                
     		if (sum[i]>max)
		 {
			max= sum[i];
                        topper = name[i];
                        topperroll=roll[i];
                 }
                
             }
	
               System.out.println("HIGHEST SCORER OF CLASS:");
               System.out.println("NAME: "+topper);  
               System.out.println("ROLL NO: "+topperroll);
               System.out.println("MARKS SCORED: "+max);
              
            }
            
             /**
             *This method finds out the student securing highest marks in math<br>
             * mathmax-marks of the student securing highest marks in math<br>
             * mathtopper-name of the student securing highest marks in math<br>
             * mathtopperroll-rollno of the student securing highest marks in math
             */
             
            public void mathtopper()
            {
                
              
           System.out.println("HIGHEST SCORER OF EVERY SUBJECT");
           System.out.println("SUBJECT   " + "NAME  " + "    ROLL NO  " + "MARKS SCORED ");
                 mathmax=math[0];
                 
                for ( i = 1; i < n; i++)
            {
                
     		if (math[i]>mathmax)
		 {
			mathmax= math[i];
                        mathtopper = name[i];
                        mathtopperroll=roll[i];
                 }
                
             }
               System.out.println("MATH   " + "   "+mathtopper + "         "+mathtopperroll + "     "+mathmax );
             
            }
            
            /**
             *This method finds out the student securing highest marks in mmc<br>
             * mmcmax-marks of the student securing highest marks in mmc<br>
             * mmctopper-name of the student securing highest marks in mmc<br>
             * mmctopperroll-rollno of the student securing highest marks in mmc
             */
            
              public void mmctopper()
            {
                
              
               
                 mmcmax=mmc[0];
                 
                for ( i = 1; i < n; i++)
            {
                
     		if (mmc[i]>mmcmax)
		 {
			mmcmax= mmc[i];
                        mmctopper = name[i];
                        mmctopperroll=roll[i];
                 }
                
             }
                System.out.println("MMC    " + "   "+mmctopper + "         "+mmctopperroll + "     "+mmcmax );
            }
              
              
              /**
             *This method finds out the student securing highest marks in dbms<br>
             * dbmsmax-marks of the student securing highest marks in dbms<br>
             * dbmstopper-name of the student securing highest marks in dbms<br>
             * dbmstopperroll-rollno of the student securing highest marks in dbms<br>
             */
                public void dbmstopper()
            {
                
               
                 dbmsmax=math[0];
                 
                for ( i = 1; i < n; i++)
            {
                
     		if (dbms[i]>dbmsmax)
		 {
			dbmsmax= dbms[i];
                        dbmstopper = name[i];
                        dbmstopperroll=roll[i];
                 }
                
             }
                System.out.println("DBMS   " + "   "+dbmstopper + "         "+dbmstopperroll + "     "+dbmsmax );
            }
            
}
