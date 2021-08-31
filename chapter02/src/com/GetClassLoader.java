package com;

/**
 * 获取ClassLoader的四种方式
 */
public class GetClassLoader {

    public static void main(String[] args) {
        // 1、clazz。getClassLoader
        System.out.println("GetClassLoader.class.getClassLoader()>>>"+GetClassLoader.class.getClassLoader());
        // 2、当前线程的上下文的ClassLoader
        System.out.println("Thread.currentThread().getContextClassLoader()>>>"+Thread.currentThread().getContextClassLoader());
        // 3、系统的ClassLoader
        System.out.println("ClassLoader.getSystemClassLoader()>>>" + ClassLoader.getSystemClassLoader());
    }

}
