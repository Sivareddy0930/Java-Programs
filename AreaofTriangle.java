import java.lang.Math;
public class AreaofTriangle {
//    int a=2;
//    int b=3;
//    int c=5;

    static void area(int a,int b,int c){
            double s=(a+b+c)/2;
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));//sqrt(s*(s-a)*(s-b)*(s-c)
        System.out.println("area:-"+area);
    }

    public static void main(String[] args) {
        area(3,6,7);
    }



}
