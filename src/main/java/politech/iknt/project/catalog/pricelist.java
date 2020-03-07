package politech.iknt.project.catalog;

import java.util.ArrayList;

class  Pricelist extends ArrayList<Product>{

    protected int findId(int id) {
        int result = -1;
        for (int i = 0; i < this.size(); i++){
            if (this.get(i).id == id) {
                result = i;
                break;
            }
        }
        return result;
    }

    public void setName(int id, String newName) {
        int i = findId(id);
        if (i != -1) {
            this.get(i).name = newName;
        }
    }

    public String getName(int id) {
        String result = "n/a";
        int i = findId(id);
        if (i != -1) result = this.get(i).name;
        return result;
    }

    public void setPrice(int id, double newPrice) {
        int i = findId(id);
        if (i != -1) {
            this.get(i).price = newPrice;
        }
    }

    public double getPrice(int id) {
        double result = -1;
        int i = findId(id);
        if (i != -1) result = this.get(i).price;
        return result;
    }

    public int removeId(int id) {
        int result = -1;
        int i = findId(id);
        if (i != -1) {
            this.remove(i);
            result = id;
        }
        return result;
    }

    public double amount(int id, int number) {
        double result = -1;
        int i = findId(id);
        if ((i != -1) & (number > 0)) {
            result = this.get(i).price * number;
        }
        return result;
    }
}