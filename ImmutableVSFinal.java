public class ImmutableVSFinal {



        public static void main(String[] args)
        {
            final StringBuffer obj=new StringBuffer("siva");
            obj.append("Reddy");
            // even we make referenc obj as final we can change it beacuse if we make final we cannot reassign it but we can modifiy.
            //but immutibilty means we cannot modify it.
            System.out.println(obj);

            final int f=20;
            System.out.println(f);
            System.out.println(f+20);// we can modify the value but not re-referenced
            //f=80;//CE
            System.out.println(f);






        }

    }


// Immutiable vs final

// final is applicable to variables ,class ,methods
// Immutiable means it can appliacble for only objects
    //Ex:-String,Wrapper Class objects.



