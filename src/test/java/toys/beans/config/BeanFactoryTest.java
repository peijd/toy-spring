package toys.beans.config;

import org.junit.Test;
import static org.junit.Assert.*;
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
    public  void testBeanFactory(){

        BeanFactory beanFactory = new BeanFactory();

        TestBean  testBean = new TestBean();

        BeanDefinition  beanDefinition = new BeanDefinition(testBean);


        beanFactory.registerBeanDefinition("testBean",  beanDefinition);

        TestBean test = (TestBean) beanFactory.getBean("testBean");


        assertEquals("hello", test.getHello());
    }

}
