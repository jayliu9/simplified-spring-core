package beans.factory;

/**
 * Bean Container
 */
public interface BeanFactory {

    /**
     * Get bean instance
     * @param beanName
     * @return
     */
    Object getBean(String beanName);
}
