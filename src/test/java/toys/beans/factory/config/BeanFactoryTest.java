package toys.beans.factory.config;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import toys.beans.PropertyValue;
import toys.beans.PropertyValues;
import toys.beans.factory.BeanFactory;
import toys.beans.factory.support.DefaultListableBeanFactory;
import toys.beans.io.ClassPathResource;
import toys.beans.io.UrlResource;
import toys.beans.xml.XmlBeanFactory;

import java.io.InputStream;

/**
 * (       "     )
 * ( _  *
 * * (     /      \    ___
 * "     "        _/ /
 * (   *  )    ___/   |
 * )   "     _ o)'-./__
 * *  _ )    (_, . $$$
 * (  )   __ __ 7_ $$$$
 * ( :  { _)  '---  $\
 * ______'___//__\   ____, \
 * )           ( \_/ _____\_
 * .'             \   \------''.
 * |='           '=|  |         )
 * |               |  |  .    _/
 * \    (. ) ,   /  /__I_____\
 * snd  '._/_)_(\__.'   (__,(__,_]
 * <o>
 * |   愿你被这个世界温柔以待。
 * / \
 *
 * @author peijundong@gmail.com
 * Created by peijundong on 2018/1/24。
 * Description:
 * Copyright(©) 2018 by peijundong
 */
public class BeanFactoryTest {

    @Test
    public  void testBeanFactory() throws Exception{

//        BeanFactory beanFactory = new DefaultListableBeanFactory();
//
//
//        BeanDefinition  beanDefinition = new BeanDefinition();
//        beanDefinition.setBeanClassName("toys.beans.factory.config.TestBean");
//
//		PropertyValues propertyValues = new PropertyValues();
//		propertyValues.addPropertyValue(new PropertyValue("text", "hello"));
//        beanDefinition.setPropertyValues(propertyValues);
//
//        beanFactory.registerBeanDefinition("testBean", beanDefinition);
//
//
//
//        TestBean test = (TestBean) beanFactory.getBean("testBean");

//        InputStream stream = Test.class.getResourceAsStream("/test.xml");
//        System.out.println(stream != null);
//        stream = Test.class.getClassLoader().getResourceAsStream("test.xml");
//        System.out.println(stream != null);

//        InputStream stream = new ClassPathResource("test.xml").getInputStream();
//
//        System.out.println(stream != null);

        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("text.xml"));

        TestBean test = (TestBean) bf.getBean("testBean");

        assertEquals("water", test.getTestProperty().getPropertyStr());
    }

}
