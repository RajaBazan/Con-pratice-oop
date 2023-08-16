package hello.com;
class Haseeb{
    Haseeb(){
        System.out.println("I'm a constructor of Haseeb");
    }
    Haseeb(int x){
        System.out.println("I'm overloaded constructor of Haseeb: " + x);
    }

}
class Ali extends Haseeb{
    Ali(){
        super(12);
        System.out.println("I am a constructor of Ali");
    }
    Ali(int x, int y){
        super(x);
        System.out.println("I'm overloaded constructor of Ali:" + y);
    }
}
class Bazan1 extends Ali{
    Bazan1(){
        System.out.println("I'm a constructor of Bazan1");
    }
    Bazan1(int x, int y, int z){
        super(x, y);
        System.out.println("I'm overloaded contructor of Bazan1: " + z);

    }
}
public class con_prac_oop {
    public static void main(String[] args) {
//        Haseeb heb = new Haseeb();
//        Ali al = new Ali();
        Bazan1 baz = new Bazan1(12,17,19);
    }
}
