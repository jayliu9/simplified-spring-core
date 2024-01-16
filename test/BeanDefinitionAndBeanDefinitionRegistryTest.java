import bean.UserService;
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


        // With-args Constructor
        UserService userServiceWithArgs = (UserService) factory.getBean("userService", "Leo");
        Assert.assertEquals(userServiceWithArgs.queryUserInfo(), "Username: Leo", "Failed to get bean with args");
    }
}
