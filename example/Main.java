package org.example;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
            product1.setName("Delong Kahve Makinesi");
            product1.setDiscount(7.0);
            product1.setUnitPrice(7500.);
            product1.setUnitInStock(3);
            product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
            product2.setName("Smeg Kahve Makinesi");
            product2.setDiscount(7.0);
            product2.setUnitPrice(7500.);
            product2.setUnitInStock(3);
            product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
            product3.setName("Kitchen Kahve Makinesi");
            product3.setDiscount(7.0);
            product3.setUnitPrice(7500.);
            product3.setUnitInStock(3);
            product3.setImageUrl("image2.jpg");

        Product[] products = {product1,product2,product3};

        System.out.println(("<ul>"));
        for (Product product: products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println(("</ul>"));

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("052834789324");
        individualCustomer.setCustomerNumber("12314");
        individualCustomer.setFirstName("Huzeyfe");
        individualCustomer.setLastName("ÖZVEREN");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("TobeTo");
        corporateCustomer.setPhone("05632432442");
        corporateCustomer.setTaxNumber("111111111111");
        corporateCustomer.setCustomerNumber("43242");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}