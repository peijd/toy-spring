package toys.beans.factory.config;

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
public class TestBean {
    private String text;

    private  PropertyTestBean testProperty;

    public String getHello(){
        return  text;
    }
    
	public void setText(String text) {
		this.text = text;
	}

    public PropertyTestBean getTestProperty() {
        return testProperty;
    }

    public void setTestProperty(PropertyTestBean testProperty) {
        this.testProperty = testProperty;
    }
}
