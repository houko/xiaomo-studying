package gold;

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
 * Date  : 2017/12/11 19:57
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question12 implements AutoCloseable {


    @Override
    public void close() {
        System.out.println("Printer closed");
    }

    public void printImage() {
        System.out.println("Print.");
    }

    static class ImageScanner implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("Scanner closed");
        }


        public void scanImage() throws Exception {
            System.out.println("Scan.");
            throw new Exception("Unable to scan.");
        }
    }


    public static void main(String[] args) {
        try (
                ImageScanner ir = new ImageScanner();
                Question12 iw = new Question12()
        ) {
            ir.scanImage();
            iw.printImage();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
