package com.atguigu.sh.juc0615;

@FunctionalInterface
interface Foo
{
    public int add(int x ,int y);

    default int div(int x ,int y)
    {
        return x/y;
    }

    static int mul(int x ,int y)
    {
        return x * y;
    }
}


/**
 * 2    Lambda Express（前提是函数式接口，只有一个方法）
 *
 * 2.1 拷贝小括号，写死右箭头，落地大括号
 * 2.2 注解@FunctionalInterface
 * 2.3 default方法
 * 2.4 static
 *
 */
public class LambdaExpressDemo
{
    public static void main(String[] args)
    {
        /*Foo foo = new Foo()
        {
            @Override
            public void sayHello()
            {
                System.out.println("******hello 0615");
            }

            @Override
            public void say886()
            {

            }
        };
        foo.sayHello();*/

        Foo foo = (int x ,int y) -> {
            System.out.println("****come in add method");
            return x + y;
        };

        System.out.println(foo.add(3, 5));

        System.out.println(foo.div(10, 2));

        System.out.println(Foo.mul(2, 3));
    }
}
