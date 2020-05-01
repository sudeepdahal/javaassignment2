// package marks;

// Imporing Arrays class to use its Function
import java.util.Arrays;
public class ProcessMarks {

    // starting the main Function
    public static void main(String[] args) {
        // obtining the marks array and printing it
        int[] testMarks = Marks.getMarks();
        System.out.println("The mark are as follows: \n");
        for (int n = 0; n < testMarks.length; n++) {
            System.out.print(testMarks[n] + " ");
            if (n % 10 == 9)
                System.out.println();
        }

        // Printing the max,min,range,mean,median and mode values by getting its 
        // values by calling its function
        System.out.println("\n\nMaximum mark is: "+max(testMarks));
        System.out.println("\nMinimum mark is: "+min(testMarks));
        System.out.println("\nRange is: "+range(testMarks));
        System.out.println("\nMean is: "+mean(testMarks));
        System.out.println("\nMedian is: "+median(testMarks));
        System.out.println("\nMode is: "+mode(testMarks));

        // Printing the grades
        System.out.println("\nGrades are as follows: \n");
        for (int n = 0; n < testMarks.length; n++) {
            // calling grades function for getting each grade for a mark and printing it
            System.out.print(grades(Marks.getMarks())[n] + " ");
            // For displaying 30 grades per line
            if (n % 30 == 29)
                System.out.println();
        }
        // Displaying frequency of grade obtained by calling gradeDistn function after
        // getting grade of each marks by grades function for each grade
        System.out.println("\nGrades distribution are as follows: \n");
        System.out.println("A: " + gradeDistn(grades(testMarks))[0]);
        System.out.println("B: " + gradeDistn(grades(testMarks))[1]);
        System.out.println("C: " + gradeDistn(grades(testMarks))[2]);
        System.out.println("D: " + gradeDistn(grades(testMarks))[3]);
        System.out.println("F: " + gradeDistn(grades(testMarks))[4]);
        System.out.println();

    }

    // to calculate max value
    public static int max(int[] marksArray){
        int maxMark =marksArray[0];
        for (int i=1; i<marksArray.length;i++){
            if(marksArray[i]>maxMark){
                maxMark = marksArray[i];
            }
        }            
        return maxMark;
    }
    
    // to calculate min value
    public static int min(int[] marksArray){
        int minMark = marksArray[0];
        for(int i=1;i<marksArray.length;i++){
            if(marksArray[i]<minMark){
                minMark=marksArray[i];                
            }
        }
        return minMark;
    }
    
    // to calculate range value
    public static int range(int[] marksArray){
        int minMark=min(marksArray);
        int maxMark=max(marksArray);
        return maxMark-minMark;
    }

    // to calculate mean value    
    public static int mean(int[] marksArray){
        int ArraySum= 0;
        for(int i=0;i<marksArray.length;i++){
            ArraySum += marksArray[i];
        }
        return ArraySum/marksArray.length;
    }

    // to calculate median value      
    public static double median(int[] marksArray){   
        
        int Arraylength=marksArray.length;
        
        //storing original array to new array to sort it for finding median without affecting the index of original array
        int[] sortedArray = marksArray;
        // sorting the array by standard sort function of array class
        Arrays.sort(sortedArray);
        if(Arraylength%2 != 0)
           return (double)sortedArray[Arraylength/2];
        
        return (double)(sortedArray[(Arraylength-1)/2]+sortedArray[Arraylength/2])/2.0;
    }
    
    // to calculate range value
    public static int mode(int[] marksArray){        

        //creating the OccuranceCount array for storing number of occrance of a mark in given array of marks.
        int countLength = max(marksArray) + 1;
        int[] OccuranceCount = new int[countLength];
        //initializing the value of OccuranceCount array to zero
        for(int i =0; i<countLength;i++){
            OccuranceCount[i]=0;
        }
        //storing the count of each element(mark) of marksArray into array OccuranceCount.
        //the index of OccuranceCount signifies as the marks(element) of marksArray
        for (int i =0; i<marksArray.length;i++){
            OccuranceCount[marksArray[i]]++;
        }
        //mode is the index of OccuranceCount that has maximum value.
        int mode=0;
        int maxOccurance = OccuranceCount[0];
        for(int i=1;i<countLength;i++){
            if(OccuranceCount[i] > maxOccurance){
                maxOccurance = OccuranceCount[i];
                mode = i;
            }
        }
        return mode;
    }
    
    public static char[] grades(int[] marksArray){
        char[] gradesArray = new char[marksArray.length];
        for(int i=0;i<marksArray.length;i++){
            // calculating the grades and assigning the values accordingly
            if(marksArray[i]>= 85)gradesArray[i]='A';
            if(marksArray[i]>= 75 & marksArray[i]<=84)gradesArray[i]='B';
            if(marksArray[i]>= 65 & marksArray[i]<=74)gradesArray[i]='C';
            if(marksArray[i]>= 50 & marksArray[i]<=64)gradesArray[i]='D';
            if(marksArray[i] < 50) gradesArray[i]='F';                
        }
        return gradesArray;        
    } 
    
    public static int[] gradeDistn(char[] c){
        
        int[] gradeDistb = new int[5];
        for(int i=0;i<5;i++){
            // assigning 0 count for each grade
            gradeDistb[i]=0;
        }        
               
        for(int i =0;i<c.length;i++){
            // adding one the frequency of grade occurance
            if(c[i]=='A')gradeDistb[0]++;
            if(c[i]=='B')gradeDistb[1]++;
            if(c[i]=='C')gradeDistb[2]++;
            if(c[i]=='D')gradeDistb[3]++;
            if(c[i]=='F')gradeDistb[4]++;
        }
        return gradeDistb;        
    }
}
