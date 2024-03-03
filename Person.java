public class Person {
    String name;//文字列の名前フィールド

    //コンストラクタ
    public Person(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("私の名前は"+name+"です。");
    }
    


    
}
