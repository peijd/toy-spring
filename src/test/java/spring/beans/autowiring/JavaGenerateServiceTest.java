package spring.beans.autowiring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import spring.beans.GenerateService;

import javax.inject.Inject;

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
 * Created by peijundong on 2018/2/7。
 * Description:
 *
 * 测试
 *
 *
 * Copyright(©) 2018 by peijundong
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = GenerateConfig.class)
public class JavaGenerateServiceTest {

    @Autowired
    private GenerateService javaGenerateService;

    @Inject
    private GenerateService haskellGenerateService;

    @Autowired
    @Qualifier("rubvGen")
    private GenerateService rubyGen;

    @Test
    public  void testJavaGenerateCode(){
        Assert.assertEquals("Java code",
        javaGenerateService.generateCode());
    }

    @Test
    public void testHaskellGenerateCode(){
        Assert.assertEquals("Haskell code", haskellGenerateService.generateCode());
    }

    @Test
    public void testRubyGenerateCode(){
        Assert.assertEquals("Ruby code", rubyGen.generateCode());
    }



}
