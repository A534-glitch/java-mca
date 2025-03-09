class Product{
    String pname;
    int pcode,price;
    Product(int code,String name,int pr){
        pcode = code;
        pname=name;
        price=pr;
    }
    void display(){
        System.out.println("Product Code: "+pcode);
        System.out.println("Product Name: "+pname);
        System.out.println("Product Price: "+price);
        System.out.println("------------------------------------------------------");
    }

    public  static void main(String[] args){
        Product p1 = new Product(1001, "Laptop", 45000);
        Product p2 = new Product(1002, "Smartphone", 20000);
        Product p3 = new Product(1003, "Tablet", 30000);

        

        System.out.println("Product details:");
        p1.display();
        p2.display();
        p3.display();
        Product lowest;
        if(p1.price<p2.price && p1.price < p3.price)
            lowest= p1;
        
            else if(p2.price < p3.price)
            lowest=p2;
            else
            lowest=p3;

            System.out.println("Product with the lowest Price:");
            lowest.display();
        
    }


}