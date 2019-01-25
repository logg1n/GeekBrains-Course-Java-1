package Animals;

public class Lesson6 {
   public static void main(String[] args) {
      Cat cat1 = new Cat();
      cat1.run(100);
      cat1.jump(2);
      cat1.swim(0);

      System.out.println("-------------------------");

      Cat cat2 = new Cat(350, 4, 2);
      cat2.run(200);
      cat2.jump(3);
      cat2.swim(1);

      System.out.println("-------------------------");

      Dog dog1 = new Dog();
      dog1.run(600);
      dog1.jump(9);
      dog1.swim(5);

      System.out.println("-------------------------");

      Dog dog2 = new Dog(400, 5, 20);
      dog2.run(400);
      dog2.jump(6);
      dog2.swim(10);

      System.out.println("-------------------------");
   }
}
