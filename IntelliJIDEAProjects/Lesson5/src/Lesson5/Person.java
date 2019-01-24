package lesson5;

import java.util.Random;

public  class  Person{
   public static Random rand;

   private String name;
   private String profession;
   private String email;
   private long phone;
   private int pay;
   private int age;

   public Person(String name, String profession, String email, long phone, int age, int pay){
      this.name = name;
      this.profession = profession;
      this.email = email;
      this.phone = phone;
      this.age = age;
      this.pay = pay;
   }

   public int getAge(){
      return this.age;
   }

   public void objInfo(){
      System.out.printf("name: %s\nprofession: %s\nEmail: %s\nphone: %d\nage: %d\npay: %d\n",
            name, profession, email, phone, age, pay);
      System.out.println("-------------------------");
   }

   public static void main(String[] args) {
      rand = new Random();
      Person arr[] = new Person[5];

      for (int i = 0; i < arr.length; i++){
         arr[i] = new Person("Person"+(i+1),
               "Engineer"+(i+1),
               "person"+(i+1)+"@mailbox.com",
               (i+1) * 1111111,
               rand.nextInt(42) + 18,
               rand.nextInt(9000) + 1000);
      }

      for (Person it : arr) {
         if (it.getAge() > 40)
            it.objInfo();
      }

   }
}
