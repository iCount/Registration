

public class Transfer {
    public void transfer(int from, int to, double amount) {
        System.out.print(Thread.currentThread());
        double[] accounts = new double[0];
        accounts[from] -= amount;
        System.out.printf("user from user", amount, from, to);
        accounts[to] += amount;
        System.out.printf("Total Balance: ", getTotalBalance());
    }

    private Object getTotalBalance() {
        return null;
    }
}