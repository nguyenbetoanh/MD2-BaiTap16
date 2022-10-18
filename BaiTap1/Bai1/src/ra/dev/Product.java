package ra.dev;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Product implements IProduct, Serializable {
    private String productId;
    private String productName;
    private String productTime;
    private float productPrice;
    private boolean productStatus;

    public Product() {
    }

    public Product(String productId, String productName, String productTime, float productPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.productTime = productTime;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductTime() {
        return productTime;
    }

    public void setProductTime(String productTime) {
        this.productTime = productTime;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void displayData() {
        System.out.printf("Ma san pham :%s--Ten sp: %s--Han su dung :%s--Gia sp: %f--Trang thai: %b\n",
                          this.productId,this.productName,this.productTime,this.productPrice,this.productStatus);

    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("Hay nhap ma san pham");
        this.productId= sc.nextLine();
        System.out.println("Hay nhap ten san pham");
        this.productName=sc.nextLine();
        System.out.println("Hay nhap han san xuat");
        this.productTime=sc.nextLine();
        System.out.println("Hay nhap gia");
        this.productPrice=Integer.parseInt(sc.nextLine());
        System.out.println("Hay nhap trang thai cho san pham");
        this.productStatus=Boolean.parseBoolean(sc.nextLine());

    }

    @Override
    public void getData(List<Product>productList) {
     File file = null;
     FileOutputStream fos =null;
     ObjectOutputStream oos =null;

try {
    file =new File(PATH_PRODUCT);
    fos= new FileOutputStream(file);
    oos=new ObjectOutputStream(fos);
    oss.writeObject(List<Product> );

}catch (Exception ex){

}finally {
    try {
        if (oss!=null){
            oss.close();
        }
        if (fos!=null){
            fos.close();
        }
    }catch (IOException ex2){
        ex2.printStackTrace();
    }

}


    }

    @Override
    public void insertData() {

    }
}
