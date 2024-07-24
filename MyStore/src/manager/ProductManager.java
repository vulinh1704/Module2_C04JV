package manager;

import model.Product;

import java.util.ArrayList;

public class ProductManager implements IManager<Product> {
    private ArrayList<Product> list = new ArrayList<>();

    @Override
    public void add(Product product) {
        this.list.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        int index = this.findById(id);
        this.list.set(index, product);
    }

    @Override
    public void delete(int id) {
        int index = this.findById(id);
        this.list.remove(index);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (this.list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Product> findAll() {
        return this.list;
    }
}
