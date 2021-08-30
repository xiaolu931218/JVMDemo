package com;

public class TestClassLoader {
    public static void main(String[] args) {
        // 系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        // 扩展类加载器
        ClassLoader classLoaderP = classLoader.getParent();
        System.out.println("parent>>" + classLoaderP);//parent>>sun.misc.Launcher$ExtClassLoader@136432db
        // 引导类加载器
        ClassLoader classLoaderPP = classLoaderP.getParent();
        System.out.println("parentP>>" + classLoaderPP);//parentP>>null
        System.out.println(TestClassLoader.class.getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(String.class.getClassLoader());//null

    }
}
