
package arrayproject;

/**
 * Date:  7/2/20
 * author: April Bollinger
 * 
 */


public class ArrayProject {
    public static void main(String[] args) {
       int[] myArray = {1, 2, 3, 4, 5};
       String[] stringArray = {"Hello", "Candy", "purple", "Cat", "elf"};
       String[] emptyArray = new String[1];
       String[] inventory = new String[6];
       int[] lengthArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       
       //Step 1 print 1 from myArray
       System.out.println("The number one in myArray: " + myArray[0]);
       
       //Printing the 3rd element from stringArray
       System.out.println("The 3rd element in stringArray: " + stringArray[3]);
       
       //Appending "foo" to the emptyArray
       emptyArray[0] = "foo";
       
       //Appending items to the inventory array
       inventory[0] = "candle";
       inventory[1] = "gloves";
       inventory[2] = "hat";
       inventory[3] = "T-shirts";
       inventory[4] = "pants";
       inventory[5] = "socks";
       
       //Printing the length of the lengthArray
       System.out.println("The length of the lengthArray is " + lengthArray.length);
       
       //For loop that adds 5 to every element in the lengthArray
       for(int i = 0; i < lengthArray.length; i++){
           lengthArray[i] = i + 5;
           System.out.println(i + " + 5 is " + lengthArray[i]);
       }
    }   
}
