/**Write a static method named vowelCount that
accepts a String as a parameter and returns an array of integers representing 
the counts of each vowel in the String. The array returned by your method should hold 5 elements: 
the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us.
Assume that the string contains no uppercase letters.

For example, the call vowelCount("i think, therefore i am") should return the array {1, 3, 3, 1, 0}.
*/

   // create an array of the vowels
     // create numOfVowels array --> 5
     // transform given string into an array of chars --> orginalString
        // sort the new char array (orginalString)
    //count how many times each vowel appears --> store into a tempCOunt variable --> store into numOfVowels[i]

    public static int[] vowelCount(String a){
        
     char[] vowels = {'a', 'e', 'i', 'o', 'u'};
     int[] numOfVowels = new int[5];
        
     char[] originalString = a.toCharArray();
        
     Arrays.sort(originalString);
        
        for(int i = 0; i < vowels.length; i++){
            
         int tempCount = 0;
            
            for(int j = 0; j < originalString.length; j++){
             
                if(vowels[i] == originalString[j]){
                    tempCount++;
                 
                    if(j == originalString.length -1){
                            numOfVowels[i] = tempCount;
                    }
                }else{
                   numOfVowels[i] = tempCount;
                }
            }
            
        }
        
        return numOfVowels;
    }

//aeiooou
