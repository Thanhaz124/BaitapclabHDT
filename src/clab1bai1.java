import java.util.Scanner;

public class clab1bai1 {
    public static void main(String[] args) throws Exception {
        Scanner nhaptenSV;
     nhaptenSV = new Scanner(System.in);
     System.out.print("Họ và tên:" );
     String hoTen=Scanner.nextLine();
     System.out.print("Điểm trung bình:");
     double diemTB= Scanner.nextDouble();
     System.out.printf("%s%điểm",hoTen,diemTB);
     
    } 
}
