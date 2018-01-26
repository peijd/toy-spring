package toys.beans.factory.config;

import javax.jws.Oneway;

import toys.beans.PropertyValue;
import toys.beans.PropertyValues;

import java.util.ArrayList;

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
 * / \
 *
 * @author peijundong@gmail.com
 * Created by peijundong on 2018/1/24。
 * Description:
 * Copyright(©) 2018 by peijundong
 */
public class BeanDefinition {
    private Object bean;

    private Class beanClass;

    private String beanClassName;
    
    private PropertyValues propertyValues = new PropertyValues();

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public BeanDefinition(){

    }

    public Object getBean()
    {
        return  bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        // set bean class by class name
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            // TODO exception
            e.printStackTrace();
        }
    }

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}

    
}
