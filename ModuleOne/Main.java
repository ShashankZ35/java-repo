public class Main {
    public static void main(String[] args) {
      int age = 22;
      String name = "Shashank";
      char firstCharacter = 'S';
      float var = 22.3f;
      boolean flag = true;
      String[] data = {"data1","data2","data3"};

      System.out.println("Hello Zeta!!\nI am " + name + "\nI am " + age + " years old\nValue is " + var + "\nFirst character " + firstCharacter + "\nflag value " + flag + "\ndata contents are :");

      for(String item:data){
      System.out.println(item);
      }

      int AgeAfterTenYears = age + 10;
      boolean isAdult = false;
      boolean eligible = isAdult && true;
      int doubleAge = age*2;
      int halfAge = age / 2;
      int ageMod = age % 5;
          
      boolean isEighteen = age == 18;
      boolean isMoreThanEighteen = age>18;
      boolean isLessThanEighteen = age<18;

      if(age>=18){
        isAdult = true;
      }
      int originalAge = AgeAfterTenYears - 10;

      int cnt = 0;
      cnt++;
      cnt--;
      String ternaryOperator = (age>=18)? "Adult":"Not adult";
  
    
      System.out.println("is " + name + " eligible = " + eligible + 
      " | is "+name+" Adult " + isAdult+
      " | is 18 " + isEighteen + 
      " | is more than 18 = " + isMoreThanEighteen + 
      " | is less than 18 = " + isLessThanEighteen + 
      " | Counter value = " + cnt + 
      " | Age after 10 years = " + AgeAfterTenYears + 
      " | Double age = " + doubleAge + 
      " | Half age = " + halfAge + 
      " | Age modulo 5 = " + ageMod +
      " | Original age = " + originalAge + 
      " | Ternary result = " + ternaryOperator);

    }
  }