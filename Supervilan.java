public class Supervilan extends Hero{
    String name = "Dr.Evil";//悪役の名前を設定
    boolean evilPlan;//悪役のフィールドを設定a
    public void evilPlan(){
        this.evilPlan = true;
        System.out.println(this.name + "は邪悪な計画を実行した!");
    }


}
