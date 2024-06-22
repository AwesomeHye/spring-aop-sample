package dev.elsboo.springaopsample.methodlog;

import dev.elsboo.springaopsample.methodlog.aop.ClassMethodLog;
import org.springframework.stereotype.Service;

@Service
@ClassMethodLog
public interface InterfaceMethodLogService {

    void log();
}
