package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// 1. public class NetworkClient implements InitializingBean, DisposableBean {
public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작 시 호출
    public void connet() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + ", message = " + message);
    }

    // 서비스 종료 시 호출
    public void discoonect() {
        System.out.println("close: " + url);
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("NetworkClient.afterPropertiesSet");
//        connet();
//        call("초기화 연결 메세지");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("NetworkClient.destroy");
//        discoonect();
//    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.afterPropertiesSet");
        connet();
        call("초기화 연결 메세지");
    }

    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.destroy");
        discoonect();
    }
}
