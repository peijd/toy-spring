package toys.beans.io;

import java.io.IOException;
import java.io.InputStream;

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
public interface Resource {

    InputStream getInputStream() throws IOException;
}
