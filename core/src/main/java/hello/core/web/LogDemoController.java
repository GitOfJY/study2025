package hello.core.web;

import hello.core.common.MyLogger;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoService logDemoService;
    // private final ObjectProvider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;

    @RequestMapping("log-demo")
    @ResponseBody
    public String logDemo(HttpServletRequest resquest) {
        String requestURL = resquest.getRequestURI().toString();

        // MyLogger myLogger = myLoggerProvider.getObject();
        System.out.println("MyLogger = " + myLogger.getClass());
        // MyLogger = class hello.core.common.MyLogger$$SpringCGLIB$$0
        // CGLIB 라이브러리로 내 클래스를 상속 받은 가짜 프록시 객체를 만들어서 주입한다

        myLogger.setRequestURL(requestURL);
        myLogger.log("controller test");
        logDemoService.logic("testID");
        return "OK";
    }

}
