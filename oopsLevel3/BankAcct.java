package oopsLevel3;

class BankAcct {
    private double balance = 1000;

    class Interest {
        void calculate() {
            double interest = balance * 0.05;
            System.out.println("Interest: " + interest);
        }
    }

    public static void main(String[] args) {
        BankAcct account = new BankAcct();
        BankAcct.Interest interest = account.new Interest();
        interest.calculate();
    }
}
