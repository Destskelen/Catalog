![](polytech.jpg)
# Catalog

## Класс Product
```
Свойства класса:

String name;  (Название продукта)
int id;       (Код продукта)
double price; (Цена продукта)
```

## Класс Pricelist
Свойста и методы класса:
```
Найти продукт с указанным id:

private int findId(int id)
```

```
Установить название продукта с указанным id:

public void setName(int id, String newName)
```

```
Получить название продукта с указанным id:

public String getName(int id)
```

```
Получить цену продукта с указанным id:

public double getPrice(int id)
```

```
Установить цену продукта с указанным id:

public void setPrice(int id, double newPrice)
```

```
Удалить продукт с указанным id:

public int removeId(int id)
```

```
Высчитать цену указанного кол-ва товара с данным id:

public double amount(int id, int number)
```

## Общие свойства методов Pricelist
```
Возвращаемые данные:

 -1 в случае отсутвия продукта с указанным id
```

