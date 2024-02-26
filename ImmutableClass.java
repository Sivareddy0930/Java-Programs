
public final class ImmutableClass {

        private final int p;

    ImmutableClass(int p){
            this.p=p;
        }

        public ImmutableClass modified(int z){
            if(this.p==z){
                // System.out.println(this);
                return this;
            }
            else{
                return new ImmutableClass(z);
            }
        }


        public static void main(String[] args)
        {
            ImmutableClass obj=new ImmutableClass(10);
            ImmutableClass obj1=obj.modified(100);
            ImmutableClass obj2=obj.modified(10);

            System.out.println(obj==obj1);
            System.out.println(obj==obj2);

        }

    }

// Immutable vs final

// final is applicable to variables or reference variables ,class ,methods
// Immutable means it can be applicable for only objects

