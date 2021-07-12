/**Write a method maxLength that takes an ArrayList of Strings as a 
parameter and that returns the length of the longest string in the list.
If your method is passed an empty list, it should return 0.
*/


public static int maxLength(ArrayList<String> a){
    
    if(a.isEmpty()){
        return 0;
    }else{
    int max = a.get(0).length();
    
    for(int i=1; i<a.size(); i++){
        if(a.get(i).length() > max){
            max = a.get(i).length();
        }
    }
    
    return max;
    
    }
}
