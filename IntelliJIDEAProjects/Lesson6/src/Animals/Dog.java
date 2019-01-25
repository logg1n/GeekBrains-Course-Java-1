package Animals;

public class Dog extends Animals {
   private int limitRunDef ;
   private float limitJumpDef ;
   private int limitSwimDef ;

   public Dog(){
      super.limitRun = limitRunDef = 500;
      super.limitJump = limitJumpDef = 0.6f;
      super.limitSwim = limitSwimDef = 10;
   }
   public Dog(int limitRun, float limitJump, int limitSwim) {
      super(limitRun, limitJump, limitSwim);
   }

   @Override
   public void run(int rn){
      System.out.printf("Собачка пробегает %dм ->%s\n", rn, rn > 0 && rn < limitRun ? true: false);
   }
   @Override
   public void jump(float jm){
      System.out.printf("Собачка прыгает %.1fм ->%s\n", jm, jm > 0.1 && (int)jm < limitJump ? true: false);
   }
   @Override
   public void swim(int sw){
      System.out.printf("Собачка проплывает %dм ->%s\n", sw, sw > 0 && sw < limitSwim ? true: false);
   }
}
