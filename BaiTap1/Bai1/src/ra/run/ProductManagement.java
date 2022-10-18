package ra.run;

import ra.dev.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("**********MENU*************");
            System.out.println(" 1. hien thi");
            System.out.println(" 2. them san pham");
            System.out.println(" 3. tim kiem thong tin");
            System.out.println("su lua chon cua ban");
            int chose = Integer.parseInt(sc.nextLine());
            switch (chose) {
                case 1:
                    ProductManagement.displayDataProduct();
                    break;
                case 2:
                    ProductManagement.inputDataProduct(sc);
                    break;
                case 3:
                    ProductManagement.searchProduct(sc);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("nhap lai tu 1 den 3");
            }

        } while (true);
    }

    public static void inputDataProduct(Scanner sc) {
        System.out.println("so luong san phan ban muon them");
        int chose = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < chose; i++) {
            Product pt = new Product();
            pt.inputData(sc);
            productList.add(pt);
        }
    }

    public static void displayDataProduct() {
        for (Product product:productList) {
            product.displayData();
        }
    }

    public static void searchProduct(Scanner sc) {
        boolean check=false;
        System.out.println("Nhap ten san pham can tim kiem");
        String searchProduct = sc.nextLine();
        for (Product pt : productList) {
            if (pt.getProductName().equals(searchProduct)) {
                System.out.println("san pham can tim la");
                pt.displayData();
            }else {
                check=true;
            }
        }
        if (check){
            System.out.println("ten san pham ko ton tai");
        }
    }
}
