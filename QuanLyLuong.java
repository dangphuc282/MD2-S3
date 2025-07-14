import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> luongNV = new ArrayList<>();

        while (true) {
            System.out.println("----------Menu----------");
            System.out.println("1. Nhap luong nhan vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Tong so tien thuong cua nhan vien");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhap luong nhan vien (nhap -1 de ket thuc): ");
                        double luong = sc.nextDouble();
                        if (luong == -1) break;

                        if (luong < 0 || luong > 500000000) {
                            System.out.println("Luong khong hop le, vui long nhap lai.");
                            continue;
                        }

                        luongNV.add(luong);

                        if (luong < 5000000) {
                            System.out.println("Thu nhap thap");
                        } else if (luong <= 15000000) {
                            System.out.println("Thu nhap trung binh");
                        } else if (luong <= 50000000) {
                            System.out.println("Thu nhap kha");
                        } else {
                            System.out.println("Thu nhap cao");
                        }
                    }
                    break;

                case 2:
                    if (luongNV.isEmpty()) {
                        System.out.println("Chua co du lieu.");
                    } else {
                        double tong = 0,
                                caoNhat = luongNV.get(0),
                                thapNhat = luongNV.get(0);

                        for (double luong : luongNV) {
                            tong += luong;
                            if (luong > caoNhat) caoNhat = luong;
                            if (luong < thapNhat) thapNhat = luong;
                        }

                        double trungBinhLuong = tong / luongNV.size();

                        System.out.println("So nhan vien da nhap: " + luongNV.size());
                        System.out.printf("Luong trung binh: %.0f VND\n", trungBinhLuong);
                        System.out.printf("Luong cao nhat: %.0f VND\n", caoNhat);
                        System.out.printf("Luong thap nhat: %.0f VND\n", thapNhat);
                        System.out.printf("Tong tien luong: %.0f VND\n", tong);
                    }
                    break;

                case 3:
                    if (luongNV.isEmpty()) {
                        System.out.println("Chua co du lieu.");
                    } else {
                        double tongThuong = 0;

                        for (int i = 0; i < luongNV.size(); i++) {
                            double luong = luongNV.get(i);
                            double tiLe;

                            if (luong <= 5000000) {
                                tiLe = 0.05;
                            } else if (luong <= 15000000) {
                                tiLe = 0.10;
                            } else if (luong <= 50000000) {
                                tiLe = 0.15;
                            } else if (luong <= 100000000) {
                                tiLe = 0.20;
                            } else {
                                tiLe = 0.25;
                            }

                            tongThuong += luong * tiLe;
                        }

                        System.out.printf("Tong so tien thuong cho nhan vien la: %.0f VND\n", tongThuong);
                    }
                    break;

                case 4:
                    System.out.println("Chuong trinh ket thuc.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
            }

            System.out.println(); 
        }
    }
}
