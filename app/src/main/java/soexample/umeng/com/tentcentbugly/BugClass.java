package soexample.umeng.com.tentcentbugly;

/**
 * 测试bug类.
 *
 * @author devilwwj
 * @since 2016/10/25
 */
public class BugClass {

    public String bug() {
        // 这段代码会报空指针异常
//        String str = null;
//        Log.e("BugClass", "get string length:" + str.length());
        return "我修改了很多资源文件";
    }
}
