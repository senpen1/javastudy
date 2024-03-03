import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    int maxhp = 50;//finalは先頭につける。
    int mp = 10;
    final int maxmp= 10;//

    public void selfAid(){
        System.out.println(this.name +"はセルフエイドを唱えた!");
        this.hp = this.maxhp;
        this.mp -= 5;
        System.out.println("HPが最大値まで回復した!");

    }

    public int pray(int sec){
        System.out.println(this.name + "は" + sec + "秒間祈った!");
        //理論上の回復量を乱数を用いて決定する。
        int recover = new Random().nextInt(3)+sec;

        //実際の回復量を計算する
        int recoverActual = Math.min(this.maxmp - this.mp, recover);

        //MPが回復したことを出力
        this.mp += recoverActual;
        System.out.println("MPが"+recoverActual+"回復した!");
        return recoverActual;
    }
}
