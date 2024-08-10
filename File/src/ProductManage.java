import java.util.ArrayList;
import java.util.List;

public class ProductManage {
    private List<Product> productList;
    private ReadAndWriteData readAndWriteData;

    public ProductManage() {
        this.readAndWriteData = new ReadAndWriteData();
        this.productList = this.readAndWriteData.readData();
    }

    public void add(Product newProduct) {
        this.productList.add(newProduct);
        this.readAndWriteData.writeData(this.productList);
    }

    public List<Product> getProductList() {
        return this.productList;
    }
}
