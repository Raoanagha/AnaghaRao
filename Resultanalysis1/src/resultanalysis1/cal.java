
package resultanalysis;

import java.util.Scanner;


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
           
            
            public void display()
            {
               System.out.println("NAME\t\t\t" + "ROLL NO    " + "\t\t\tMARKS");
               System.out.println("    \t" + "        " + "\t\t\tMATH  "+"MMC   "+"  DBMS  "+"   OS    "+"   DAA   ");
               
               for(i=0;i<n;i++)
              {
        
               System.out.println(""+name[i] + "\t  "+roll[i] + "\t      "+math[i] + "      "+mmc[i] + "      "+dbms[i] + "      "+os[i] + "      "+daa[i] );
               
              }
            }
          
            
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
                
          
                  public void ostopper()
            {
                
              
               
                 osmax=math[0];
                 
                for ( i = 1; i < n; i++)
            {
                
     		if (os[i]>osmax)
		 {
			osmax= os[i];
                        ostopper = name[i];
                        ostopperroll=roll[i];
                 }
                
             }
               System.out.println("OS     " + "   "+ostopper + "         "+ostopperroll + "     "+osmax );
            }
                 
             
                  
                    public void daatopper()
            {
               
              
               
                 daamax=daa[0];
                 
                for ( i = 1; i < n; i++)
            {
                
     		if (daa[i]>daamax)
		 {
			daamax= daa[i];
                        daatopper = name[i];
                        daatopperroll=roll[i];
                 }
                
             }
               System.out.println("DAA    " + "   "+daatopper + "         "+daatopperroll + "     "+daamax );
            }
             
            public void classpass()
            {
                for(i=0;i<n;i++)
              {

                  if(sum[i]>175)
                  p++;
              }
                
                 System.out.println("The percentage of students who failed in the class is: "+((n-p)*100)/n+"%");
                 System.out.println("The percentage of students who passed in the class is: "+(p*100)/n+"%");
            }
            
            
            
            public void subjpass()
            {
                 
                 System.out.println("SUBJECT      " + "  FAIL   " + "PASS"); 
                for(i=0;i<n;i++)
                {
                     if(math[i]<35)
                     f1++;

                }

                 System.out.println("MATHS    : " + "    "+(f1*100)/n+"%" + "   " +((n-f1)*100)/n+"%");
                
                 
                

                for(i=0;i<n;i++)
                {
                     if(mmc[i]<35)
                     f2++;

                }

                 System.out.println("MMC      : "+"    "+(f2*100)/n+"%" + "   " +((n-f2)*100)/n+"%");
                

                 
                  

                for(i=0;i<n;i++)
                {
                     if(dbms[i]<35)
                     f3++;

                }

                System.out.println("DBMS     : "+"    "+(f3*100)/n+"%" + "   " +((n-f3)*100)/n+"%");

                 
                 
                for(i=0;i<n;i++)
                {
                     if(os[i]<35)
                     f4++;

                }

               System.out.println("OS       : "+"    "+(f4*100)/n+"%" + "   " +((n-f4)*100)/n+"%");

                

                for(i=0;i<n;i++)
                {
                     if(daa[i]<35)
                     f5++;

                }

                 System.out.println("DAA      : "+"    "+(f5*100)/n+"%" + "   " +((n-f5)*100)/n+"%");
            }
            
            
    
    
}
