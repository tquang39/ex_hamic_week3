package week3;

import java.util.Arrays;
import java.util.Scanner;

public class g41 {
    static Scanner input = new Scanner(System.in);

    public static String[] getArrayInput( int n) {
        String[] names = new String[n];
        for ( int i = 0; i < n; ++i) {
            names[i] = input.nextLine().trim(); // trim de xoa khoang trang o dau va cuoi chuoi
        }
        return names;
    }

    // ham kiem tra va chuan hoa ten
    public static String checkNames(String names ) {
        String[] parts = names.split("\\s+"); // chia name thanh cac chuoi nho rieng biet, dung regex "\s" để tách name dựa trên dấu cách, còn "\s+" để phòng trường hợp người dùng nhập nhiều dấu cách
        for ( int i = 0; i < parts.length; ++i) {
            String part = parts[i];
            if ( part.length() > 0) {
                parts[i] = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
            }
        }
        return String.join(" ", parts); // nối chuỗi
    }
    //ham tach ten ra khoi fullname
    public static String splitTen(String names) {
        String[] parts = names.split("\\s+");
        String ten = parts[parts.length-1];    
        return ten;    
    }

    //ham sap xep
    public static void sortNamesAtoZ ( String[] names) {

        String[] tens = new String[names.length];
        for ( int i = 0; i < names.length; ++i) {
            names[i] = checkNames(names[i]);
            tens[i] = splitTen(names[i]);
        }
        Arrays.sort(tens);
        String[] newNames = new String[names.length];
        for ( int i = 0; i < tens.length; ++i ) {
            for ( int j = 0; j < names.length; ++j) {           //Dòng mã if (splitTen(names[j]).equals(tens[i])) kiểm tra xem
                if (splitTen(names[j]).equals(tens[i])) {           //phần tử tên của names[j] có bằng với phần tử tên tens[i] hay không.
                    newNames[i] = names[j];                     //Ở đây, splitTen(names[j]) trả về phần tử tên của names[j], trong khi tens[i] là phần tử tên được lấy từ mảng tens đã được sắp xếp.
                    break;
                }                                           
            }                                               
        }
        System.arraycopy(newNames, 0, names, 0, names.length); // Copy lại mảng đã sắp xếp vào mảng names ban đầu
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        input.nextLine(); //để tiêu diệt ký tự mới dòng trước khi nhập dữ liệu vào mảng names.
        String[] names = new String[n];
        names = getArrayInput(n);
        sortNamesAtoZ(names);
        for ( String newName : names) {
            System.out.println(newName);
        }
    }
}
