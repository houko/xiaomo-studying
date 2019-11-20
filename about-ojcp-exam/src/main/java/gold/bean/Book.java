package gold.bean;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/12/13 21:01
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Book {

    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        boolean output = false;
        Book book = (Book) obj;
        if (this.name.equals(book.name)) {
            output = true;
        }
        return output;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String read(String bname) {
        return "Read" + bname;
    }
}
