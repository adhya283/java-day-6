class Payment {
    public void pay() {
        System.out.println("Payment completed");
    }
}

class CashPayment extends Payment {
    public void pay() {
        System.out.println("Payment made using cash");
    }
}

class CardPayment extends Payment {
    public void pay() {
        System.out.println("Payment made using card");
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment payment1 = new CashPayment();
        Payment payment2 = new CardPayment();

        if (payment1 instanceof CashPayment) {
            System.out.println("Cash payment detected");
        }

        if (payment2 instanceof CardPayment) {
            System.out.println("Card payment detected");
        }

        payment1.pay();
        payment2.pay();
    }
}