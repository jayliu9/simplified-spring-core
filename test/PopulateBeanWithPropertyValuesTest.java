import bean.Person;
import beans.PropertyValue;
import beans.PropertyValues;
import beans.factory.config.BeanDefinition;
import beans.factory.support.DefaultListableBeanFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopulateBeanWithPropertyValuesTest {
    @Test
    public void testPopulateBeanWithPropertyValues() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues pvs = new PropertyValues();
        pvs.addPropertyValue(new PropertyValue("name", "leo"));
        pvs.addPropertyValue(new PropertyValue("age", "18"));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, pvs);
        beanFactory.registerBeanDefinition("person", beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        Assert.assertEquals(person.getName(), "leo");
        Assert.assertEquals(person.getAge(), 18);
    }
}
