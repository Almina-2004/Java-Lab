class product {
    int pcode;
    String pname;
    int price;

    product(int pc, String pn, int pr) {
        this.pcode = pc;
        this.pname = pn;
        this.price = pr;
    }

    void show() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {
        product p1 = new product(101, "Pen", 10);
        product p2 = new product(102, "Pencil", 5);
        product p3 = new product(103, "Box", 100);

        // Declare lowest as a product type
        product lowest = p1;

        if (p2.price < lowest.price)
            lowest = p2;
        if (p3.price < lowest.price)
            lowest = p3;

        System.out.println("--- The Lowest Price Product ---");
        lowest.show();
    }
}