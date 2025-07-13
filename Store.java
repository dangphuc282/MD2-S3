import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        String tenKhach = sc.nextLine();
        System.out.println("Ten san pham: ");
        String tenSanPham = sc.nextLine();
        System.out.println("Gia san pham: ");
        double gia = sc.nextDouble();
        System.out.println("So luong: ");
        int soLuong = sc.nextInt();
        System.out.println("The thanh vien (true, false): " );
        boolean laThanhVien = sc.nextBoolean();

        double thanhTien = gia * soLuong;
        double giamGia;
        if(laThanhVien){
            giamGia = thanhTien * 0.10;
        }else {
            giamGia = 0;
        }
        double tienVAT = (thanhTien - giamGia) * 0.08;
        double tongThanhToan = thanhTien - giamGia + tienVAT;

        System.out.println("Khach hang: "+ tenKhach);
        System.out.println("San pham: "+ tenSanPham);
        System.out.println("Gia san pham: "+ gia + " vnd");
        System.out.println("So luong: "+ soLuong);
        System.out.println("Thanh tien: "+ thanhTien + " vnd");
        System.out.println("Giam gia: "+ giamGia + " vnd");
        System.out.println("Tien VAT: "+ tienVAT);
        System.out.println("Tong thanh toan: "+ tongThanhToan + " vnd");
    }
}
