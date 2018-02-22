package toys.beans.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

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
 * Created by peijundong on 2018/1/25。
 * Description:
 * Copyright(©) 2018 by peijundong
 */
public class ClassPathResource implements Resource{

   private final String  path;

    public ClassPathResource(String location){
        this.path = location;
    }

    @Override
    public InputStream getInputStream() throws IOException {
//        InputStream inputStream = ClassPathResource.class.getResourceAsStream(this.path);
//        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader = getClass().getClassLoader();
        URLConnection urlConnection = classLoader.getResource("test.xml").openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
