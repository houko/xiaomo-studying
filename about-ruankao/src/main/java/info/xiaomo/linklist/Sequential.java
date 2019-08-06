package info.xiaomo.linklist;

/**
 * 顺序结构
 */
public class Sequential implements LinerList {

    final int defaultSize = 10;

    int maxSize;

    int size;

    Object[] listArray;

    public Sequential() {
        init(maxSize);
    }

    public Sequential(int size) {
        init(size);
    }

    private void init(int size) {
        maxSize = size;
        this.size = 0;
        listArray = new Object[size];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void insert(int index, Object target) throws Exception {

    }

    @Override
    public void delete(int index) throws Exception {

    }

    @Override
    public Object get(int index) throws Exception {
        return null;
    }
}
