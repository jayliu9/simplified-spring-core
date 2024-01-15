import beans.factory.config.BeanDefinition;
import beans.factory.support.DefaultListableBeanFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinition userServiceDef = new BeanDefinition(UserService.class);
        factory.registerBeanDefinition("userService", userServiceDef);

        UserService userService = (UserService) factory.getBean("userService");
        Assert.assertEquals(userService.sayHello(), "Hello!", "Failed to get bean from factory");
    }
}
