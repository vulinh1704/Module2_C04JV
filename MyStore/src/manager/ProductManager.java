package manager;

import model.Product;

import java.util.ArrayList;

public class ProductManager implements IManager<Product> {
    private ArrayList<Product> list = new ArrayList<>();

    public Product getDetail(int id) {
        int index = this.findById(id);
        Product product = this.list.get(index);
        return product;
    }


    public ArrayList<Product> findByPrice(double from, double to) {
        ArrayList<Product> listSearch = new ArrayList<>();
        for (Product item: this.list) {
            if(item.getPrice() > from && item.getPrice() < to) {
                listSearch.add(item);
            }
        }
        return listSearch;
    }

    public ArrayList<Product> findByNameContain(String name) {
        ArrayList<Product> listSearch = new ArrayList<>();
        for (Product item: this.list) {
            if(item.getName().toLowerCase().contains(name.toLowerCase())) {
                listSearch.add(item);
            }
        }
        return listSearch;
    }

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
