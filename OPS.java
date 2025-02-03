/*
Design an Online Payment System with an abstract class PaymentMethod 
containing an abstract method processPayment(). Create two derived 
classes: CreditCard and PayPal, each implementing the processPayment() 
method differently (for example, one might charge a fee, and the other 
might not). Create a method processTransaction(PaymentMethod paymentMethod) 
that accepts a PaymentMethod object and processes the payment by calling 
processPayment(). Demonstrate polymorphism by using both CreditCard and 
PayPal objects in the transaction processing system.
 */
abstract class PaymentMethod {
    int amt;
    PaymentMethod(int amt) {
        this.amt=amt;
    }
    abstract void processPayment();
}
class CreditCard extends PaymentMethod {
    CreditCard(int amt) {
        super(amt);
    }
    void processPayment() {
        System.out.println("Credit card Payment of "+amt+" processed with charges "+(0.02*amt));
    }
}
class PayPal extends PaymentMethod {
    PayPal(int amt) {
        super(amt);
    }
    void processPayment() {
        System.out.println("PayPal Payment of "+amt+" processed with 0 charges");
    }
}
public class OPS {
    static void processTransaction(PaymentMethod p) {
        p.processPayment();
    }
    public static void main(String[] args) {
        PaymentMethod[] p=new PaymentMethod[4];
        for(int i=0;i<p.length;i++) {
            if(i%2==0) {
                int k=1000+i;
                p[i]=new CreditCard(k);
            } else {
                int k=1000+i;
                p[i]=new PayPal(k);
            }
            processTransaction(p[i]);
        }
    }
}
