package titoshotel.Interfaces;

import java.util.List;

public interface DAO<T> {
    void save(T c);
    void update(T c);
    void remove(T c);
    void remove(int id);
    T get(int id);
    List<T> getAll();
}
