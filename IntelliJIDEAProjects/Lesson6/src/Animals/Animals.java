package Animals;

abstract class Animals {
   protected int limitRun ;
   protected float limitJump ;
   protected int limitSwim ;

   public Animals(){ }
   public Animals(int limitRun, float limitJump, int limitSwim){
      this.limitRun = limitRun;
      this.limitJump = limitJump;
      this.limitSwim = limitSwim;
   }

   abstract public void run(int rn);
   abstract public void jump(float jm);
   abstract public void swim(int sw);
}
