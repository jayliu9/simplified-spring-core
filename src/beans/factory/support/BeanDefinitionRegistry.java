package beans.factory.support;

import beans.factory.config.BeanDefinition;

/**
 * Interface for register BeanDefinition
 */
public interface BeanDefinitionRegistry {

    /**
     * register bean definition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
