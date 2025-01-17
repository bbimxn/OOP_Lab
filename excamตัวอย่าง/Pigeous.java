public class Pigeous extends Bird{
    
    public Pigeous(){
        this("",0);
        setPower(150);
    }
    
    public Pigeous(String name, int age){
        setName(name);
        setAge(age);
        setPower(150);
    }
    
    @Override
    public void wingAttack(Animal a){
        a.setPower(getPower()-5);
    }
    
    public void wingAttack(Animal a, int time){
        for(int i =1;i<=time;i++){
            wingAttack(a);
        }
    }
    
    @Override
   public void eat(Food f){
        setPower(f.getPower()*2);
    }
    
    public void fly(){
        System.out.println( getName() +"fly fly....");
    }
}
