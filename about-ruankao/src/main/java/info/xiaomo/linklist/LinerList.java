package info.xiaomo.linklist;

public interface LinerList {
    int size();

    boolean isEmpty();

    void insert(int index, Object target) throws Exception;

    void delete(int index) throws Exception;

    Object get(int index) throws Exception;


}
