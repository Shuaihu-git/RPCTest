package service.implement;

import com.common.HelloService;

/**
 * @Date 2023/8/30 13:27
 * @Author XiaoHu
 * @Description
 **/
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello :"+name;
    }
}
