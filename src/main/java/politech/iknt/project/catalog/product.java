package politech.iknt.project.catalog;

class Product {
    String name;  // Название продукта
    int id;       // Код продукта
    double price; // Цена

    Product(String name, int id, double price){
        this.name = name;
        this.id = id;
        this.price = price;
    }
}
