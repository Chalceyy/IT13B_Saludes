package midterm;

public class SALUDES_BALENDEZ_SINGLE_MULTIDIMENSIONAL_ARRAY {
   
    public static void main(String[] args) {
       
       char letters[] = {'A','B','C','D','E','F','G'};
       
        for (char a = 0; a < letters.length; a++) {
           System.out.print(letters[a] + "," );
           
       }
        System.out.println();
        
       int numbers [][] = {
           {51, 52, 53, 54},
           {55, 56, 57, 58},
           {59, 60, 61, 62}
       };
       for (int y = 0; y< numbers.length; y++){
           System.out.print ("The Elements in Row " + (y + 1) + ": ");
           for (int z = 0; z< numbers[y].length; z++){
             System.out.print(numbers[y][z] + " ");
           }
           System.out.println();
       }
    }
}
  
