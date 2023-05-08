
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Account {
    private Double sotien;
    private Integer sotk;
    private String tentk;
    private String trangthai;
    private Double lai=0.035;
    Scanner in = new Scanner(System.in);
    public Account() {
    }
    public Account(Integer sotk, String tentk, Double sotien) {
        this.sotk=sotk;
        this.tentk=tentk;
        this.sotien=sotien;
    }

    public Double getSotien() {
        return sotien;
    }


    public Integer getSotk() {
        return sotk;
    }

    public String getTentk() {
        return tentk;
    }
    public String getTrangthai() {
        return trangthai;
    }

    public void setSotien(Double rut) {
        Double sotien;
        System.out.println("Nhap So Tien:");
        sotien = in.nextDouble();
        if(sotien>=50) {
            this.sotien=sotien;
        }else {
            sotien=50.0;
            System.out.println("So Tien Khong Hop Le");
            System.out.println("So Tien Hien Tai La:"+sotien);
        }
    }
    public void setSotk() {
        Integer stk;
        System.out.println("Nhap So Tai Khoan:");
        stk = in.nextInt();
        if(sotk>0 && sotk!=999999) {
            this.sotk = stk;
        }else {
            sotk=999999;
            System.out.println("So Tai Khoan Khong Hop Le");
            System.out.println("So Tai Khoan Hien Tai La:"+sotk);
        }
    }
    public void setTentk() {
        String tentk;
        System.out.println("Nhap Ten Tai Khoan:");
        tentk = in.nextLine();
        if(tentk!=""&&tentk!=" ") {
            this.tentk = tentk;
        }else {
            tentk="Chua Xac Dinh";
            System.out.println("Ten Tai Khoan Khong Hop Le");
            System.out.println("Ten Tai Khoan Hien Tai La:"+tentk);
        }
    }


    public String toString() {
        Locale vt = new Locale("vi","vn");
        NumberFormat formt = NumberFormat.getCurrencyInstance(vt);
        String Sotien = formt.format(sotien);
        return "Ten tk:" + tentk + "So tk:" + sotk + "So tien:" + sotien;
    }
    public Account(String tentk, Integer sotk) {
        setSotien(50.0);
    }
    public void naptien() {
        Double nap;
        System.out.println("Nhap So Tien Nap:");
        nap = in.nextDouble();
        if(nap<0) {
            System.out.println("Vui Long Nhap Lai");
        }else {
            setSotien(nap);
            sotien = sotien + nap;
        }
    }
    public void ruttien() {
        Double rut;
        System.out.println("Nhap So Tien Rut:");
        rut = in.nextDouble();
        if(rut<0||rut>sotien) {
            System.out.println("So Tien Phai Lon Hon 0 Va Be Hon"+sotien);
        }else {
            setSotien(rut);
            sotien = sotien - rut;
        }
    }
    public void daohan() {
        sotien = sotien + sotien*lai;
    }
    public void nhaptk() {
        System.out.println("Nhap So Tai Khoan:");
        sotk = Integer.parseInt(in.nextLine());
        System.out.println("Nhap Ten Tai Khoan:");
        tentk = in.nextLine();
        System.out.println("Nhap So Tien:");
        sotien = in.nextDouble();
    }
}
