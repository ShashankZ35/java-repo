public class Operator{
    public static void main(String args[]){
        String name = "Shashank";
        int age = 22;
        int AgeAfterTenYears = age + 10;
        boolean isAdult = false;
        int doubleAge = age * 2;
        int halfAge = age / 2;
        int ageMod = age % 5;

        boolean isEighteen = age == 18;
        boolean isMoreThanEighteen = age > 18;
        boolean isLessThanEighteen = age < 18;

        if(age >= 18){
          isAdult = true;
        }
        else{
            isAdult = false;
        }
        boolean eligible = isAdult && true;

        int bitwiseAnd = age & 10;  
        int bitwiseOr = age | 10;   
        int bitwiseXor = age ^ 10; 
        int bitwiseNot = ~age; 

        int leftShift = age << 1;   
        int rightShift = age >> 1;  
        int originalAge = AgeAfterTenYears - 10;
        
        int i = 0;
        int cnt = 0;
        cnt++;
        cnt--;
        cnt++;
        String ternaryOperator = (age>=18)? "Adult":"Not adult";
    // usage of all operators
        System.out.println(
                "is " + name + " eligible = " + eligible +
                " , is " + name + " Adult = " + isAdult + 
                " , is 18 = " + isEighteen +
                " , is more than 18 = " + isMoreThanEighteen +
                " , is less than 18 = " + isLessThanEighteen +
                " , Counter value = " + cnt + 
                " , Age after 10 years = " + AgeAfterTenYears +
                " , Double age = " + doubleAge +
                " , Half age = " + halfAge +
                " , Age modulo 5 = " + ageMod +
                " , Original age = " + originalAge +
                " , Ternary result = " + ternaryOperator + 
                "Bitiwse outputs: " + 
                ", BitwiseAnd = " + bitwiseAnd +
                ", BitwiseOr = " + bitwiseOr +
                ", bitwiseXor = " + bitwiseXor +
                ", bitwiseNot = " + bitwiseNot +
                "Shift operators outputs: " + 
                ", leftShift = " + leftShift +
                ", rightShift = " + rightShift
                );

    //print number from 0 to 10
        while(i<=10){
            System.out.println(i);
            i++;
        }

    //print number from 11 to 20
        do { 
            System.out.println(i);
            i++;
        } while (i<=20);

    //print number from 21 to 30
        for(int j=21;j<=30;j++){
            System.out.println(j);
            j++;
        }   
    
        int getNum = getRandomNumber();
        switch (getNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println(" unexpected day");
                break;
        }        
    }

    //a function function to create number from 1-7
    public static int getRandomNumber() {
        int num =  (int)(Math.random() * 7) + 1;
        return num;
    }
}