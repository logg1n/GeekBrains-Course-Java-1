package Animals;

abstract class Animals {
   private int limitRun ;
   private float limitJump ;
   private int limitSwim ;
   private String type;

   public Animals(String type){ this.type = type; }
   public Animals(String type, int limitRun, float limitJump, int limitSwim){
      this.limitRun = limitRun;
      this.limitJump = limitJump;
      this.limitSwim = limitSwim;
      this.type = type;
   }

   public void run(int rn){
      System.out.printf("%s пробегает %dм ->%s\n", type, rn, rn > 0 && rn < limitRun ? true: false);
   }
   public void jump(float jm){
      System.out.printf("%s прыгает %.1fм ->%s\n", type, jm, jm > 0.1 && (int)jm < limitJump ? true: false);
   }
   public void swim(int sw){
      System.out.printf("%s проплывает %dм ->%s\n", type, sw, sw > 0 && sw < limitSwim ? true: false);
   }
}
