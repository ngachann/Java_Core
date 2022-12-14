package bai5.service.sachtruong;

import bai5.entity.SachTruong;

import java.util.Scanner;

public class SachTruongImpl implements SachTruongService {

    @Override
    public SachTruong themSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã sách: ");
        String maSach = sc.nextLine();
        System.out.print("Tên sách: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhà xuất bản: ");
        String nhaXuatBan = sc.nextLine();
        System.out.print("Năm xuất bản: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Số lượng: ");
        Long soLuong = sc.nextLong();
        sc.nextLine();
        System.out.print("Vị trí: ");
        String viTri = sc.nextLine();
        System.out.print("Số trang: ");
        long soTrang = sc.nextLong();
        sc.nextLine();
        System.out.print("Tình trạng: ");
        String tinhTrang = sc.nextLine();
        return new SachTruong(maSach, tenSach, nhaXuatBan,
                namXuatBan, soLuong, viTri, soTrang, tinhTrang);
    }
}
