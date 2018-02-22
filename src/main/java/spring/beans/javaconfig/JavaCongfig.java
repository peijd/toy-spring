package spring.beans.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
@Configuration
public class JavaCongfig {

    @Bean(name = "PythonGen")
    public PythonGenerateService  pythonGenerateService(){
        return  new PythonGenerateService();
    }

    @Bean(name = "PythonGenAdv")
    public  PuthonGenerateAdvanceServcie puthonGenerateAdvanceServcie(){
        return  new PuthonGenerateAdvanceServcie(pythonGenerateService());
    }

    @Bean(name = "PythonGenAdv2")
    public  PuthonGenerateAdvanceServcie puthonGenerateAdvanceServcie2(PythonGenerateService pythonGenerateService){
        return  new PuthonGenerateAdvanceServcie(pythonGenerateService);
    }

}
