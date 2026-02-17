package com.kovanLabs.intern.exceptionhandling;
public class Resource implements AutoCloseable{
    //throw example
//    public void divide() {
//
//        int amount=1000;
//        int bal=1000;
//        try {
////
//        if(amount>bal) {
//            throw new ArithmeticException("Insufficient balance");
//        }
//        System.out.println("Transaction Successful");
//
//        } catch (Exception e) {
//            System.out.println("catch block : "+e.getMessage());
//        }
 // try-catch example
        public void divide(){
            int i=0;
            int j=0;
            int res=0;
            try{
                res=i/j;
                System.out.println(res);
        }catch(ArithmeticException e){
                System.out.println(e);
            }
    }
    public void close(){
        System.out.print("Automatically close runs..");
    }
}
