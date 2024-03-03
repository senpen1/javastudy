public class Wizard {
    String name;
    int hp;
    public void heal(Hero h){
        h.hp += 10;
        System.out.println(this.name + "は呪文を唱えて" + h.name + "を10回復した!");
    }
    
}
