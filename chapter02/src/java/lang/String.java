package java.lang;

/**
 * 测试双亲委派机制
 */
public class String {

    // java.lang包下的类由引导类加载器加载，该类不会被加载
    static {
        System.out.println(123);
    }

    /**
     * 错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
     *    public static void main(String[] args)
     * 否则 JavaFX 应用程序类必须扩展javafx.application.Application
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(222);
    }

}
