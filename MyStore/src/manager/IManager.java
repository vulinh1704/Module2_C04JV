package manager;

import java.util.ArrayList;

public interface IManager<E> { // Tương tự tham số truyền vào nhưng dành cho kieu dữ liệu
    void add(E e);
    void edit(int id, E e);
    void delete(int id);
    int findById(int id);
    ArrayList<E> findAll();
}
