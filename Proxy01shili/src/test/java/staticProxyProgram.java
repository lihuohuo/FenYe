import cn.huohuo.staticProxy.Proxy;
import org.junit.Test;

/**
 * Created by lenovo on 2017/7/30.
 */
public class staticProxyProgram {
    @Test
    public  void say(){
        Proxy proxy = new Proxy();
        proxy.say();

    }
}
