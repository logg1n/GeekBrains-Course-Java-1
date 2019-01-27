package Animals;

public class Cat extends Animals {
   public Cat(){
      super("Котик", 200, 2, 0);
   }
   public Cat(int limitRun, float limitJump, int limitSwim){
      super("Котик", limitRun, limitJump, limitSwim);
   }

   @Override
   public void swim(int sw){
      System.out.println("Cat Не умеет плавать!");
   }
}
