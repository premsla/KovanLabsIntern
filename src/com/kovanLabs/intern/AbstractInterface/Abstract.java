package com.kovanLabs.intern.AbstractInterface;
abstract class Payment{
    abstract void pay();
    abstract void refund();
}
abstract class GooglePay extends Payment{
    @Override
    void pay(){
        System.out.println("Payment Done...");
    }
}
class updateGooglePay extends GooglePay{
    @Override
    void refund(){
        System.out.println("Refund is done..");
    }
}
public class Abstract {
    public static void main(String[] args){
        Payment obj=new updateGooglePay();
        obj.pay();
        obj.refund();
          Plugin[] plugins = new Plugin[] {
                new Plugin() {
                    public void execute() {
                        System.out.println("Authentication plugin executed");
                    }
                },
                new Plugin() {
                    public void execute() {
                        System.out.println("Logging plugin executed");
                    }
                },
                new Plugin() {
                    public void execute() {
                        System.out.println("Payment plugin executed");
                    }
                },
                new Plugin() {
                    public void execute() {
                        System.out.println("Refund plugin executed");
                    }
                },
        };

        Plugin[] plugins1=new Plugin[]{
                ()-> System.out.println("Authentication Plugin is executed"),
                ()-> System.out.println("Login Plugin is Executed"),
                ()-> System.out.println("Payment Plugin is executed")
        };
        CoreSystem coreSystem = new CoreSystem();
        coreSystem.runPlugin(plugins);
        MultipleInterface mi=new MultipleInterface();
        mi.start();
        mi.takePhoto();
        mi.playMusic();
        mi.makecall();
    }
}

