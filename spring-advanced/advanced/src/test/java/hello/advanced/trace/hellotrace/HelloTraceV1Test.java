package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

class HelloTraceV1Test {
    @Test
    void begin_end() {
        HelloTraceV1 helloTrace = new HelloTraceV1();
        TraceStatus staus = helloTrace.being("hello");
        helloTrace.end(staus);
    }

    @Test
    void begin_exception() {
        HelloTraceV1 helloTrace = new HelloTraceV1();
        TraceStatus staus = helloTrace.being("hello");
        helloTrace.exception(staus, new IllegalStateException());
    }
}