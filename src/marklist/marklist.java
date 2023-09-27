package marklist;
import java.util.Scanner;

public class marklist {

	public static void main(String[] args) {
		
		int studTotal=0;
		double[] averages = new double[4];;
		String[] grades = new String[4];
               String[] results = new String[4];
                int rl1 = 101, rl2 = 102, rl3 = 103, rl4 = 104; int[] mark1 = new int[4]; int [] mark2 = new int[4]; int[] mark3 = new int[4];
		String[] studname = new String[4];
		Scanner scanner = new Scanner(System.in);
		

				for(int i = 0; i<=3; i++) { 
					System.out.println("Enter student name");
					studname[i] = scanner.next();
					System.out.println("Enter mark1");
					mark1[i]=scanner.nextInt();
					System.out.println("Enter mark2");
					mark2[i]=scanner.nextInt();
					System.out.println("Enter mark3");
					mark3[i]=scanner.nextInt();
					studTotal=mark1[i]+mark2[i]+mark3[i];
			        double average=studTotal/3;
			        averages[i]=average;
				
				
				

				if (average > 79) {
					grades[i] = "A";
				} else if(average > 74) {
					grades[i] = "B+";
				} else if(average > 64) {
					grades[i] = "B";
				} else if(average > 54) {
					grades[i] = "C+";
				} else if(average > 49) {
					grades[i] = "C";
				} else if(average > 39) {
					grades[i] = "D";
				} else {
					grades[i] = "F";
				}
				
				if (average > 39) {
					results[i] = "P";
				} else {
					results[i] = "F";
				}
			}
				
						
				System.out.println("*************************************************************************************************");
				System.out.println("\t\t\t\t STUDENT MARKLIST");
				System.out.println("*************************************************************************************************");
				System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
				for(int i = 0; i<=3; i++) {
					System.out.println(rl1+i+ "\t" + studname[i] +"\t" + mark1[i] +"\t" + mark2[i] +"\t" + mark3[i] +"\t" + (mark1[i] + mark2[i] + mark3[i]) +"\t" + results[i] +"\t" + averages[i] +"\t" + grades[i]);
				}
				
				
				
				
				
				
				scanner.close();
			}
		}
			
