package manager;

import model.Category;
import saveData.ReadAndWriteCategory;

import java.util.ArrayList;
import java.util.List;

public class CategoryManage implements IManage<Category> {
    private List<Category> list;
    private ReadAndWriteCategory readAndWriteCategory = new ReadAndWriteCategory();
    public CategoryManage() {
        this.list = readAndWriteCategory.readData();
    }
    @Override
    public void add(Category category) {
        this.list.add(category);
        readAndWriteCategory.writeData(list);
    }

    @Override
    public void update(int id, Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Category> getAll() {
        return this.list;
    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    public Category findById(int id) {
        int index = findIndexById(id);
        return this.list.get(index);
    }
}
