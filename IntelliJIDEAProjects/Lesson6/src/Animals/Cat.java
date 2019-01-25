package Animals;

public class Cat extends Animals {
   public Cat(){
      super(200, 2, 0);
      setType("Cat");
   }
   public Cat(int limitRun, float limitJump, int limitSwim) {
      super(limitRun, limitJump, limitSwim);
      setType("Cat");
   }

   @Override
   public void swim(int sw){
      System.out.println("Cat Не умеет плавать!");
   }
}
