	//even digits correct version, @ hawa ali drammeh, 2023

public static int evenDigits(int num) {
        
        if(num == 0) return 0;
        
        if(num < 0 ) {
            return -evenDigits(-num);
        }
     
        
        int lastDigit = num % 10;
        if(lastDigit % 2 == 1) {        
            return evenDigits(num / 10);
        } else {       
            return  10 * evenDigits(num / 10) + (num % 10);
        }
    }

// 10 * d + r  is the formula you should remember where r represents the remainder of a number.
// thus num % 10  means that num = 10 * d(some decimal number in this case 1 ) + r (remainder in this case 0)
//18 = 10 * (1) + 8 . 
// knowing the math will help you to understand how to append back th enumber.
