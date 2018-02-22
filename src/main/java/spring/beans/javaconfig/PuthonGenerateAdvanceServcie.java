package spring.beans.javaconfig;

import spring.beans.GenerateService;

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
public class PuthonGenerateAdvanceServcie implements GenerateService{

    private  PythonGenerateService pythonGenerateService;

    public PuthonGenerateAdvanceServcie(PythonGenerateService pythonGenerateService) {
        this.pythonGenerateService = pythonGenerateService;
    }


    @Override
    public String generateCode() {
        return this.pythonGenerateService.generateCode() + "advance";
    }


    public PythonGenerateService getPythonGenerateService() {
        return pythonGenerateService;
    }

    public void setPythonGenerateService(PythonGenerateService pythonGenerateService) {
        this.pythonGenerateService = pythonGenerateService;
    }
}
