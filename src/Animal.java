public interface Animal {
    public void move();
    public void sound();
    default  public void  a(){
        System.out.println("sdsadsa");
    }
}
