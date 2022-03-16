package KiemTraGiuaKy;

import java.util.Scanner;

public class CDTestDrive {
    public static void main(String[] args) {
        CD alb[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Ban muon chon gi?");
            System.out.println("1.nhap thong tin CD\n" +
                    "2. xuat danh sach CD.\n" + "3.tinh tong gia thanh \n" + "4.tong so luong CD CD \n" +
                    "5.Sap sep giam dan theo gia\n"+"Nhap so 6 de thoat");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhap so luong CD : ");
                    n = sc.nextInt();
                    alb = new CD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thu " + (i + 1)+": ");
                        alb[i] = new CD();
                        nhapCD(alb[i]);
                    }
                    break;
                case 2:
                    System.out.printf("Ma CD", "Name CD", "Tên ca sy", "So bai hat", "Gia CD");
                    for (int i = 0; i < n; i++) {
                        alb[i].hienThiCD();
                    }
                    break;
                case 3:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += alb[i].getGia();
                    }
                    System.out.println("" +
                            "Tong gia: " + tong);
                    break;
                case 4:
                    System.out.println("Tong so luong CD : " + n);
                    break;
                case 5:
                    CD temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getGia() < alb[j].getGia()) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("sap sep thanh cong nhap so 2 de kiem tra!");
                    break;
                default:
                    System.out.println("Tam biet");
                    flag = false;
                    break;
            }
        }while (flag) ;
    }
    static Scanner sc = new Scanner(System.in);
    static void nhapCD(CD cd) {
        System.out.print("Nhap ma CD: ");
        cd.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten CD : ");
        cd.setTenCD(sc.nextLine());
        System.out.print("Nhap ten ca sy : ");
        cd.setCaSy(sc.nextLine());
        System.out.print("Nhap so luong bai hat : ");
        cd.setSoBH(sc.nextInt());
        System.out.print("nhap gia thanh : ");
        cd.setGia(sc.nextFloat());
    }
}
