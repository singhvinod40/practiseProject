public class constructorPractise {
   public String name;
    public int age;
    String city;
    static String company="cognizant";

    public constructorPractise(int i,String p,String s){
        name=p;
        city=s;
        age=i;
     }


     void display(){ System.out.println(name+"  "+city+"  "+age+"  "+company); }



    public static void main(String args[]){

        constructorPractise s1=new constructorPractise(24,"vinod","allahabad");
        constructorPractise s2=new constructorPractise(0,null,null);

        s2.age=s1.age;
        s1.display();
    }
}
