package spring.beans.xml;

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
 * Created by peijundong on 2018/2/20。
 * Description:
 * Copyright(©) 2018 by peijundong
 */
public class XMLSettingConfigGenerateService implements GenerateService{

    private  String lang;

    private  String sayAfterLang = "code";

    private  XMLConfig xmlConfig;

    public XMLSettingConfigGenerateService(String lang) {
        this.lang = lang;
    }


    public XMLSettingConfigGenerateService(String lang, XMLConfig xmlConfig) {
        this.lang = lang;
        this.xmlConfig = xmlConfig;
    }

    @Override
    public String generateCode() {
        return null;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getSayAfterLang() {
        return sayAfterLang;
    }

    public void setSayAfterLang(String sayAfterLang) {

        this.sayAfterLang = sayAfterLang;
    }

    public XMLConfig getXmlConfig() {
        return xmlConfig;
    }

    public void setXmlConfig(XMLConfig xmlConfig) {
        this.xmlConfig = xmlConfig;
    }
}
