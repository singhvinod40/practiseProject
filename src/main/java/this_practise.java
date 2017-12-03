public class this_practise {
    protected int age;
    public String name;
    public boolean smart;

    public this_practise(int age,String name,boolean Smart){
        this.age=age;
        this.name=name;
        this.smart=Smart;
    }
    void print(){
        System.out.println(age+"  "+name+"  "+smart);
    }
    public static void main(String args[]){
        this_practise ts=new this_practise(12,"priyana",true);
            ts.print();
    }
}
