class Child extends Parent{
    int x=9;
    @Override
    void add(int y){
        System.out.println("Child.add.before,x="+x);
        x+=y;
        System.out.println("Child.add.after,x+="+x);
    }

    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println("Child.main,x+="+p.x);
    }
}