public class SuperHero extends Hero{

    boolean flying;//新しいフィールドを設定

    //飛ぶメソッドを作成
    public void fly(){
        this.flying = true;
        System.out.println("は飛び上がった!");
    }
    //着地するメソッドを作成
    public void land(){
        this.flying = false;
        System.out.println("は着地した!");
    }
}


    //ヒーローが敵に攻撃するメソッド
    //public void ataack(){
        //System.out.println(this.name+this.sword+"は敵を攻撃した！");
        //System.out.println("敵に5のダメージを与えた!");
        //攻撃の詳細なロジックをここに記述
    //}

    //public Hero(String name){
        //this.hp =100;
        //this.name = "ダミー";
    //

    



    
