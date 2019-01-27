package Animals;

public class Dog extends Animals {
   public Dog(){
      super("Собачка", 500, 0.5f, 10);
   }
   public Dog(int limitRun, float limitJump, int limitSwim) {
      super("Собачка", limitRun, limitJump, limitSwim);
   }

}
