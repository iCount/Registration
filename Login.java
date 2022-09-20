import com.xzy.User;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class Login {
    public void log(Collection<User> al, Scanner sc) {
        System.out.println ("Пожалуйста, введите учетную запись, которая будет входить в систему: ");
        int id = sc.nextInt();
        if (al.contains(new User(id, null))) {
            System.out.println ("Пожалуйста, введите пароль для входа:");
            String password = sc.next();
            // Обходим коллекцию
            Iterator<User> it = al.iterator();
            // Отметить запрашиваемого пользователя
            boolean flag = false;
            while(it.hasNext()) {
                User user = it.next();
                if(password.equals(user.getPassward())) {
                    flag = true;
                    System.out.println ("Поздравляем с успешным входом!");
                    break;
                }
            }
            if(flag == false) {
                System.out.println ("Неверный пароль, введите еще раз ...");
            }
        } else {
            System.out.println ("Введенная учетная запись не существует, введите заново ...");
        }
    }
}