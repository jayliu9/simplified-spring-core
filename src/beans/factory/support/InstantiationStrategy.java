package beans.factory.support;

import beans.BeansException;
import beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Interface for the strategy of Bean Instantiation
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, Constructor ctor, Object[] args) throws BeansException;
}
