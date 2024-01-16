package beans.factory;

import beans.BeansException;

/**
 * Bean Container
 */
public interface BeanFactory {

    /**
     * Get bean instance
     * @param beanName
     * @return
     */
    Object getBean(String beanName, Object... args) throws BeansException;
}
