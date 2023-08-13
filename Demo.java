
class Demo{
    int a=10;
     Demo(){
       System.out.println("protected Access Modifier");
   }
    public static void main(String[] args) {
        Demo d=new Demo();

        System.out.println(d.a);


    }
  
}