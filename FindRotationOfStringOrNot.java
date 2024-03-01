public class FindRotationOfStringOrNot {
    public static void main(String[] args) {
            String s1="ABCD";
            String s2="CDAB";
            Rotation(s1,s2);
    }
    public static void Rotation(String s1,String s2){
        if (s1.length()==s2.length() && (s1 + s1).indexOf(s2) !=-1){
            //(s1 + s1).indexOf(s2) !=-1     => ABCDABCD .indexOf(CDAB) != -1
            //                                          2   != -1   ==> true
            // indexOf() returns If no such value . -1 is returned.
            System.out.println("String is rotation of specified String");
        }
        else{
            System.out.println("String is not a rotation of specified String");
        }
    }
}
