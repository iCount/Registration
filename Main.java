import com.xzy.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Collection<User> al = new ArrayList<>();
        while (true) {
            System.out.println ("Выберите функцию: A (регистрация) B (вход)");
            Scanner sc = new Scanner(System.in);
            String st = sc.next();
            if ("a".equalsIgnoreCase(st)) {
                Register reg = new Register();
                reg.register(al,sc);
            } else if ("b".equalsIgnoreCase(st)) {
                Login log = new Login();
                log.log(al,sc);
            } else {
                System.out.println ("Введен неверный код, введите еще раз ...");
            }
        }
    }
}