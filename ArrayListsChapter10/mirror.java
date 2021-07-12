/*Write a method mirror that accepts an ArrayList of 
Strings as a parameter and produces a mirrored copy of the list as output,
with the original values followed by those same values in the opposite order. 
For example, if an ArrayList variable called list contains the values ["a", "b", "c"], after
a call of mirror(list); it should contain ["a", "b", "c", "c", "b", "a"].
*/

public static void mirror(ArrayList<String> a){
 
   
    int size = a.size()-1;
    for(int i = size; i>=0; i--){
        
       String word = a.get(i);
        a.add(word);
}
}
