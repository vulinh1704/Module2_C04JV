package manager;

import model.Category;
import model.Product;
import saveData.ReadAndWriteProduct;
import java.util.List;

public class ProductManage implements IManage<Product> {
    private List<Product> list;
    ReadAndWriteProduct readAndWriteProduct = new ReadAndWriteProduct();

    public ProductManage() {
        this.list = this.readAndWriteProduct.readData();
    }

    @Override
    public void add(Product product) {
        this.list.add(product);
        readAndWriteProduct.writeData(this.list);
    }

    @Override
    public void update(int id, Product product) {
        int index = this.findIndexById(id);
        this.list.set(index, product);
        readAndWriteProduct.writeData(this.list);
    }

    @Override
    public void delete(int id) {
        int index = this.findIndexById(id);
        this.list.remove(index);
    }

    @Override
    public List<Product> getAll() {
        this.list = readAndWriteProduct.readData();
        return this.list;
    }


    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.list.size(); i++) {
            if (id == this.list.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }


}
