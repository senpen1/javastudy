public class Hero {
    String name ="ミナト";
    int hp =100;
     
    //戦う
    public void attack(Enemy enemy){
        System.out.println(this.name +"の攻撃！");
        enemy.hp -=5;
        System.out.println("5ポイントのダメージを与えた！");
    }

    public void run(){
        System.out.println(this.name + "は逃げ出した!");
    }
}
