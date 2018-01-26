package toys.beans.factory.support;

import java.lang.reflect.Field;

import toys.beans.PropertyValue;
import toys.beans.factory.config.BeanDefinition;
import toys.beans.factory.config.BeanReference;

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
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
    	Object bean = createBeanInstance(beanDefinition);
    	applyPropertyValues(bean, beanDefinition);
    	return bean;
    }
    
    protected Object createBeanInstance(BeanDefinition beanDefinition) {
        // TODO interface throw exception
        if (!beanDefinition.getBeanClass().isInterface()){
            try {
                return  beanDefinition.getBeanClass().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    // spring not use this method
    protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
    	for (PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValues()) {
			Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
			declaredField.setAccessible(true);
			Object value = propertyValue.getValue();
			if (value instanceof BeanReference){
			    BeanReference  bf = (BeanReference) value;
                value = getBean(bf.getBeanName());
            }
			declaredField.set(bean, value);
		}
    }
    
    
}
