package Structral.Proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author yyzhou
 * @Date 2024/5/12 13:06
 * @PackageName:Structral.Proxy.Dynamic
 * @ClassName: JDKTiktokProxy
 * @Description: TODO
 * @Version 1.0
 */
public class JDKTiktokProxy<T> implements InvocationHandler {


    private T tartget;
    public JDKTiktokProxy(T tartget){
        this.tartget=tartget;
    }
    public static<T> T getProxy(T t){
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new JDKTiktokProxy(t));
        return (T) o;
    }

    //定义目标方法的拦截逻辑，每个方法都会拦截
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("真正的代理被执行");
        Object invoke = method.invoke(tartget, args);
        System.out.println("返回值："+invoke);
        return invoke;
    }
}
