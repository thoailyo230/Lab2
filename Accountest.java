
import java.util.Scanner;
public class Accountest {
    static Scanner sc = new Scanner(System.in);

    static void nhapTK(Account a) {
        Account tk = new Account();
        System.out.println("Nhap So Tai Khoan ");
        tk.setSotk();
        System.out.println("Nhap So Tai Khoan ");
        tk.setTentk();

    }

    public static void main(String[] args) {
        Account tk = new Account();
        Account a[] = null;
        int k, b, n = 0;
        long s, d, c, f;
        int sochon;
        boolean flag = true;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Lua Chon ");
        System.out.println("1.Nhap Thong Tin \n"
                + "2.Nap Tien\n" + "3.Rut Tien\n"
                + "4.Dao Han\n" + "5.Thoat");
        sochon = Integer.parseInt(myScanner.nextLine());

        if (sochon == 1) {
            System.out.println("So Luong Khach Hang ");
            n = sc.nextInt();
            a = new Account[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Khach Hang Thu " + (i + 1));
                a[i] = new Account();
                tk.nhaptk();

            }


            if (sochon == 2) {
                System.out.println("Nhap So Tai Khoan: ");
                s = sc.nextLong();
                for (int i = 0; i < n; i++) {
                    d = a[i].getSotk();
                    if (s == d) {

                        a[i].naptien();
                    } else {
                        System.out.println("Nhap So Tien");

                    }
                }
            }
            if (sochon == 3) {
                System.out.println("Nhap So Tai Khoan: ");
                s = sc.nextLong();
                for (int i = 0; i < n; i++) {
                    d = a[i].getSotk();
                    if (s == d) {

                        a[i].ruttien();

                    }
                }
            }

            if (sochon == 4) {
                System.out.println("Nhap So Tai Khoan: ");
                s = sc.nextLong();
                for (int i = 0; i < n; i++) {
                    d = a[i].getSotk();
                    if (s == d) {

                        a[i].daohan();
                        ;

                    }
                    }
                }
            if (sochon == 5) {
                return;

            }
        }
    }


    }


