package Animals;

public class Cat extends Animals {
   private int limitRunDef ;
   private float limitJumpDef ;
   private int limitSwimDef ;

   public Cat(){
      super.limitRun = limitRunDef = 200;
      super.limitJump = limitJumpDef = 2;
      super.limitSwim = limitSwimDef = 0;
   }
   public Cat(int limitRun, float limitJump, int limitSwim) {
      super(limitRun, limitJump, limitSwim);
   }

   @Override
   public void run(int rn){
      System.out.printf("Котик пробегает %dм ->%s\n", rn, rn > 0 && rn < limitRun ? true: false);
   }
   @Override
   public void jump(float jm){
      System.out.printf("Котик прыгает %.1fм ->%s\n", jm, jm > 0.1 && (int)jm < limitJump ? true: false);
   }
   @Override
   public void swim(int sw){
      System.out.printf("Котик проплывает %dм ->%s\n", sw, sw > 0 && sw < limitSwim ? true: false);
   }
}
