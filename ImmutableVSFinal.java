public class ImmutableVSFinal {



        public static void main(String[] args)
        {
            final StringBuffer obj=new StringBuffer("siva");
            obj.append("Reddy");
            // even we make reference obj as final we can change it because if we make final we cannot reassign it, but we can modify.
            //but immutability means we cannot modify it.
            System.out.println(obj);

            final int f=20;
            System.out.println(f);
            System.out.println(f+20);// we can modify the value but not re-referenced
            //f=80;//CE
            System.out.println(f);


//            String s=new String("siva");
//            s.concat("reddy");
//            System.out.println(s);
//
//            final StringBuffer s1=new StringBuffer("venkata");
//            s1.append("Tumu");
//            System.out.println(s1);



        }

    }


// Immutiable vs final

// final is applicable to variables ,class ,methods
// Immutiable means it can appliacble for only objects
    //Ex:-String,Wrapper Class objects.



