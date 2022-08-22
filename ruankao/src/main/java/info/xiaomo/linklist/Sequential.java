package info.xiaomo.linklist;

/**
 * 顺序结构
 */
public class Sequential implements LinerList {

    /**
     * 缺省时长度默认为10
     */
    private final int defaultSize = 10;

    /**
     * 最大长度（开辟的空间）
     */
    private int maxSize;

    /**
     * 当前线性表长度
     */
    private int size;

    /**
     * 线性表内容
     */
    private Object[] listArray;

    public Sequential() {
        init(defaultSize);
    }

    public Sequential(int size) {
        init(size);
    }

    private void init(int size) {
        maxSize = size;
        // 实际为0
        this.size = 0;
        // 开辟空间
        listArray = new Object[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(int index, Object target) throws Exception {
        if (size == maxSize) {
            throw new Exception("顺序表己满！");
        }
        if (index < 0 || index > size) {
            throw new Exception("参数index错误");
        }

        // 给target滕位置
//        for (int i = size - 1; i >= index; i--) {
//            listArray[i + 1] = listArray[i];
//        }

        // 将以上代码转成native的c++，效率更高
        System.arraycopy(listArray, index, listArray, index + 1, size - index);

        listArray[index] = target;
        size++;
    }

    @Override
    public void delete(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("顺序表为空，无法删除！");
        }
        if (index < 0 || index > size - 1) {
            throw new Exception("参数错误！");
        }
        //移动元素
//        for (int j = index; j <= size - 1; j++) {
//            listArray[j] = listArray[j + 1];
//        }
        if (size >= index) {
            System.arraycopy(listArray, index + 1, listArray, index, size - index);
        }
        size--;
    }

    @Override
    public Object get(int index) throws Exception {
        if (index >= size || index <= 0) {
            throw new Exception("参数错误");
        }
        return listArray[index];
    }

    @Override
    public void show() {
        for (Object o : listArray) {
            if (o != null) {
                System.out.println(o);
            }
        }
        System.out.println("------------------end------------------------");
    }
}
