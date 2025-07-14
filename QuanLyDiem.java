import java.util.ArrayList;
import java.util.Scanner;
public class QuanLyDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> diemList = new ArrayList<>();

        while(true){
            System.out.println("----------Menu----------");
            System.out.println("1. Nhap diem hoc vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Thoat");
            System.out.println("Chon chuc nang 1-3: " );

            int chon = sc.nextInt();

            if(chon ==1){
                while (true){
                    System.out.println("Nhap diem cua ban (0-10), nhap -1 de ket  thuc: ");
                    double diem = sc.nextDouble();

                    if (diem == -1) {
                        break;
                    }
                    if(diem < 0 || diem > 10){
                        System.out.println("Diem khong hop le vui long nhap lai");
                        continue;
                    }

                    diemList.add(diem);

                    if(diem <5){
                        System.out.println("Xep loai yeu");
                    } else if (diem < 7) {
                        System.out.println("Xep loai trung binh");
                    } else if (diem < 8) {
                        System.out.println("Xep loai kha");
                    } else if (diem < 9) {
                        System.out.println("Xep loai gioi");
                    } else {
                        System.out.println("Xep loai xuat sac");
                    }
                }

            } else if (chon == 2){
                if(diemList.isEmpty()){
                    System.out.println("Chua co du lieu");
                }else {
                    double tong = 0;
                    double max = diemList.get(0);
                    double min = diemList.get(0);

                    for(double d : diemList){
                        tong = tong + d;
                        if (d > max) max = d;
                        if (d < min) min = d;
                    }
                    double trungBinh = tong/ diemList.size();
                    System.out.println("So hoc vien da nhap" + diemList.size());
                    System.out.println("Diem trung binh la " + trungBinh);
                    System.out.println("Diem cao nhat la " + max);
                    System.out.println("Diem thap nhat la " + min);
                }
            } else if (chon == 3) {
                System.out.println("Thoat chuong trinh");
                break;
            }else {
                System.out.println("Vui long chon lai");
            }

        }

    }
}