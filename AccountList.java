import java.util.Scanner;
public class AccountList {
    private Account[] accList;
    private int count = 0;
    Scanner in = new Scanner(System.in);
    public AccountList(Account[] accList, int count) {
        this.accList = new Account[10];
        this.count = 0;
    }
    public AccountList(Integer n) {
        System.out.println("Nhap So Luong Phan Tu:");
        n = in.nextInt();
        if(n>0) {
            this.accList=new Account[n];
        }else {
            this.accList=new Account[10];
            this.count=0;
        }
    }
    public void add() {
        Account acc = new Account();
        accList = new Account[1];
        acc.nhaptk();
    }
}
