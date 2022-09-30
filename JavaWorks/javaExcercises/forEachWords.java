package javaExcercises;

//In this exercise you have to create a loop that allows you to concatenate texts 
//and print the final result on the console.
//Keep in mind that the texts can come from an array of type String. For example:
//String[] names = {"", "", "", ""}

public class forEachWords {
    public static void main(String[] args) {
        String[] words = {"Largo", "Camión", "Banano", "Gato", "Avión"};
          
           StringBuffer words2 = new StringBuffer();
          

         for(String word: words) {
           words2.append(word+", ");
            
            
            System.out.println(words2);
            }
    }

}
    
 