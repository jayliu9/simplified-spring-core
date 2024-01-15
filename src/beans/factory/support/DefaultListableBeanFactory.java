package beans.factory.support;

import beans.BeansException;
import beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {
    private Map<String, BeanDefinition> beanDefinitionMap;

    public DefaultListableBeanFactory() {
        this.beanDefinitionMap = new HashMap<>();
    }

    @Override
    protected BeanDefinition getBeanDefinition(String name) {
        BeanDefinition beanDefinition =  this.beanDefinitionMap.get(name);
        if (beanDefinition == null) {
            throw new BeansException("No bean named " + name + " is defined");
        }

        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
