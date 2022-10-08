import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String userName, password, newPassword, answer;

        Scanner input = new Scanner(System.in);
        
        System.out.println(("Kullanıcı adı giriniz:"));
        userName = input.nextLine();

        System.out.println(("Şifre giriniz:"));
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Hatalı giriş yaptınız. Şifrenizi sıfırlamak ister misiniz? (evet/hayır)");
            answer = input.nextLine();
            if (answer.equals("evet")){
                System.out.println(password);
                System.out.println("Yeni şifre giriniz:");
                newPassword = input.nextLine();
                System.out.println(newPassword);
                while (password.equals(newPassword)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz:");
                    newPassword = input.nextLine();
                }
                    System.out.println("Şifre oluşturuldu.");

            }

        }


    }

}
