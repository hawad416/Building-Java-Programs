/*Write a static method named contains that accepts two arrays of 
integers a1 and a2 as parameters and that returns a boolean 
value indicating whether or not a2's sequence of elements appears 
in a1 (true for yes, false for no). The sequence of elements in a2 may appear 
anywhere in a1 but must appear consecutively and in the same order. 
For example, if variables called list1 and list2 store the following values:

int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
int[] list2 = {1, 2, 1};
Then the call of contains(list1, list2) should return true because list2's
sequence of values {1, 2, 1} is contained in list1 starting at index 5.
If list2 had stored the values {2, 1, 2}, the call of contains(list1, list2) 
would return false because list1 does not contain that sequence of values. 
Any two lists with identical elements are considered to contain each other, 
so a call such as contains(list1, list1) should return true.

You may assume that both arrays passed to your method will have lengths of at least 1. 
You may not use any Strings to help you solve this problem, nor methods that produce Strings such as Arrays.toString.
*/

 public static boolean contains(int[] a, int[]b){
2
     
3
        boolean bool = true;
4
        int entrypoint;
5
        int[] copy;
8
        if(a.length == b.length){
9
            
10
            if(a[0] != b[0]){
11
                return false;
12
            }
13
            
14
        } else if (a.length < b.length){
15
            return false;
16
17
        }
18
20
        for(int i = 0; i < a.length; i++){
21
            if(a[i] == b[0]){
23
                entrypoint = i;
24
           
26
                if(a.length - entrypoint < b.length){
27
                    return false;
29
                 
                }else{
31
                    
32
                    copy = Arrays.copyOfRange(a, entrypoint, a.length);
33
                    
34
                    int count = 0;
35
                    
36
                    for(int j = 0; j < b.length; j++){
37
                     
38
                        if(copy[j] != b[j]){
39
                            bool = false;
40
                        }else{
41
                            count++;
42
                        }
43
                    }
45
                    if(count == b.length){
47
                        return true;
48
                    }
49
                
51
                }
52
            
54
            }
55
     
        }
58
             return bool;
59
    }
60
        
61
        // Logical Test Cases & Edge Cases
65
            /* if a.length == b.length --> if(a[0] != b[0]) --> return false
66
                * if a.length < b.length --> return false
67
                    * if (a.length - entrypoint < b.length --> return flase
68
        
69
    }*/
