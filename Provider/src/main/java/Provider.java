import com.atlucky.protocol.http.HttpServer;

/**
 * @Date 2023/8/30 13:44
 * @Author XiaoHu
 * @Description
 **/
public class Provider {
    public static void main(String[] args) {
        //Netty、Tomcat接收网络请求
        HttpServer httpServer = new HttpServer();
        httpServer.start("localhost",8080);
    }
}
