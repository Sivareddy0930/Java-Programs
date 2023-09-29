
public  class SingletonClass {

        private static SingletonClass t=null;

    private SingletonClass(){}

        public static SingletonClass getmethod() {
            if (t == null) {
                t = new SingletonClass();
            }

                return t;

        }

        public static void main(String[] args)
        {
            SingletonClass obj=SingletonClass.getmethod();
            SingletonClass obj1=SingletonClass.getmethod();


            System.out.println(obj==obj1);


        }

    }


