public class StringReverseTask {
    public static void main(String[] args) {
        		String s1 = "Noel - sees Leon";
//        String s1 = "A man - a plan, a canal - Panama";

//		System.out.println(s1.length());

        String n1=s1.substring(0,s1.length()/2 +1);
        String n2=s1.substring(s1.length()/2 +1);

        System.out.println(n1);
        System.out.println(n2);



        if(n1.toLowerCase().equals(n2.toLowerCase())) {
            System.out.println("True");
        }


        System.out.println(n1.replaceAll("-", "").replaceAll(" ", "").toLowerCase());
        System.out.println(n2.replaceAll("-", "").replaceAll(" ", "").toLowerCase());

        if(n1.replaceAll("-", "").replaceAll(" ", "").toLowerCase().equals(new StringBuffer(n2.replaceAll("-", "").replaceAll(" ", "").toLowerCase()).reverse().toString())) {
            System.out.println("True");
        }
    }
}
