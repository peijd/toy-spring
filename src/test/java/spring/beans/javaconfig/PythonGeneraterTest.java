package spring.beans.javaconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

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
 * Created by peijundong on 2018/2/13。
 * Description:
 * Copyright(©) 2018 by peijundong
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaCongfig.class, loader=AnnotationConfigContextLoader.class)
public class PythonGeneraterTest {

    @Autowired
    private PythonGenerateService  pythonGenerateService;

    @Autowired
    @Qualifier("PythonGenAdv")
    private PuthonGenerateAdvanceServcie  pythonGenerateAdvanceService;

    @Autowired
    @Qualifier("PythonGenAdv2")
    private PuthonGenerateAdvanceServcie  pythonGenerateAdvanceService2;

    @Test
    public void testGenerater(){
        Assert.assertEquals("Python code",pythonGenerateService.generateCode());

        Assert.assertEquals(pythonGenerateAdvanceService.getPythonGenerateService(),
                pythonGenerateAdvanceService2.getPythonGenerateService());
    }
}
