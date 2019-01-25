package Animals;

public class Dog extends Animals {
   public Dog(){
      super(500, 0.5f, 10);
      setType("Dog");
   }
   public Dog(int limitRun, float limitJump, int limitSwim) {
      super(limitRun, limitJump, limitSwim);
      setType("Dog");
   }

}
