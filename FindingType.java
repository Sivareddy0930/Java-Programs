public class FindingType {
    int a=10;
//finding datatype by converting in to class.
    public static void main(String[] args) {
        FindingType d=new FindingType();
        System.out.println((d.getClass()).getName());
        System.out.println(((Object) d.a).getClass().getName());
    }
}
