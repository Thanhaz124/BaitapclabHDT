import java.lang.ref.Reference;
import java.util.Scanner;

public class CTMinhHoaNhapXuat {
    public static void main(String[] args) {
        System.out.print("Gia Định");
        System.out.println(" Đào tạo");
        System.out.printf("%d nghề", 12);
        
        String nhapTensinhvien;
        float diemKTLapTrinh;

        Scanner bienNhapLieu;//ApplicationProgramingInterface

        bienNhapLieu= new Scanner(System.in);
        System.out.print("nhập vào điểm môn kĩ thuật lập trình:");
       diemKTLapTrinh= bienNhapLieu.nextFloat();
       System.out.println("Nhâp môn ki thuât lập trình :"+ diemKTLapTrinh);
        //vd
      nhapTensinhvien = new String("mr Tý");

        
    }
    
}
