package dev.elsboo.springaopsample.methodlog;

import dev.elsboo.springaopsample.methodlog.aop.ClassMethodLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@ClassMethodLog
public class ImplementsMethodLogService implements InterfaceMethodLogService{

    public void log() {
        log.info("method called");
    }
}
