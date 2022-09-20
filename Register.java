import com.xzy.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

class Register {
    public void Register(Collection<User> al, Scanner sc) {
        System.out.println ("Пожалуйста, введите номер зарегистрированного счета:");
        int id = sc.nextInt();
        if (al.contains(new User(id, null))) {
            System.out.println ("Учетная запись уже существует, введите заново!");
        } else {
            System.out.println ("Пожалуйста, введите регистрационный пароль:");
            String password = sc.next();
            al.add(new User(id, password));
            System.out.println ("Поздравляем с успешной регистрацией !!");
            Object[] user = al.toArray();
            long[] пользователь = new long[0];
            System.out.println ("Пользователи в коллекции:" + Arrays.toString(пользователь));
        }
    }

    public void register(Collection<User> al, Scanner sc) {
    }
}