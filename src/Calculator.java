public class Calculator {
    public void add(){
        int x=1;
        int y=2;
        System.out.println(x+y);
    }
    public void sub(){
        int x=2;
        int y=1;
        System.out.println(x-y);
    }
    public void mul(){
        int x=1;
        int y=4;
        System.out.println(x*y);
    }
    public void div(){
        int x=4;
        int y=2;
        System.out.println(x/y);
    }
    public static void main(String[] args){
        Calculator obj =new Calculator();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}