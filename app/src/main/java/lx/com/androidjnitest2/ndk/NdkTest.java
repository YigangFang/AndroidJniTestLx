package lx.com.androidjnitest2.ndk;

/**
 * Created by 18834 on 2015/10/13.
 * Function：
 * Version:
 */
public class NdkTest {
    //jni调用的方法
    public native String ndkSayHello();

    static {
        //加载的动态so库  名字对应后面我们在build。gradle中配置的名字
        System.loadLibrary("JniTest");
    }
}
