class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("멍");
    }

    @Override
    public void move() {

    }

    public void dogOnly(){
        System.out.println("개만 가능");
    }
}
