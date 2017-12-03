public class staticprac {

    int age;
   public String name;
    public  static String company="cognizant";

    public staticprac(int i, String n){
        age=i;
             name=n;
    }
     public static void method(){
        company="delloite";
    }
    void dispaly(){
        System.out.println(age+"  "+name+"  "+ company);
    }

    static {System.out.println("testing static block");}

    public static void main(String args[]){

        staticprac s1=new staticprac(21,"vinod");
        staticprac.method();
        s1.dispaly();

    }
}
