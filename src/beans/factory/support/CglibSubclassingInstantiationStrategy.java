package beans.factory.support;

import beans.BeansException;
import beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Constructor;

/**
 * CGLIB subclassing instantiation strategy
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, asgsTemp, proxy) ->
            proxy.invokeSuper(obj, asgsTemp));
        return ctor == null ? enhancer.create() : enhancer.create(ctor.getParameterTypes(), args);
    }
}
