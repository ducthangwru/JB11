package Lesson2;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double laiSuatNam;
        Scanner input = new Scanner(System.in);
        Date ngaytao = new Date();
        Account account = new Account(1122, 20000);

        account.setNgaytao(ngaytao);
        System.out.println("Nhập lãi suất năm: ");
        laiSuatNam = input.nextDouble();
        account.setLaiSuatNam(laiSuatNam);

        System.out.println("Ngày tạo: " + account.getNgaytao());
        System.out.println("Lợi nhuận hàng tháng là: " + account.getLoiNhuanHangThang());
        account.rutTien(2500);
        account.napTien(3000);
        System.out.println("Số dư hiện tại là: " + account.getSoDu());


    }
}
