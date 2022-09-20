import java.util.concurrent.LinkedTransferQueue;

public class Runnable{

    private static final double DELAY = 1;
    private static final double MAX_AMOUNT = 2;
    Runnable r = () -> {
        try{
            while(true){
                LinkedTransferQueue<Object> bank = new LinkedTransferQueue<>();
                int toAccount = (int)(bank.size() * Math.random());
                double amount = MAX_AMOUNT * Math.random();
                Object fromAccount = new Object();
                bank.transfer("fromAccount, toAccount, amount");
                Thread.sleep((int)(DELAY * Math.random());
            }
        }catch(InterruptedException e){

        }

    };
}
