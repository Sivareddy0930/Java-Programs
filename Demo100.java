class Test {
    static int output=0;
   static int count=0;
    static int rec(int value){
        if(value>0){
            output=value-1 ;
            count++;
             if(count!=1){
                 rec(value-1);
             }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(rec(10));
    }
}