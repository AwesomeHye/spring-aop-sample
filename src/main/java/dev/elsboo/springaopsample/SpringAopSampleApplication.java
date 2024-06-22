package dev.elsboo.springaopsample;

import dev.elsboo.springaopsample.methodlog.MethodLogService;
import dev.elsboo.springaopsample.methodlog.ExtendsMethodLogService;
import dev.elsboo.springaopsample.methodlog.ImplementsMethodLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringAopSampleApplication implements CommandLineRunner {
    private final MethodLogService methodLogService;
    private final ExtendsMethodLogService extendsMethodLogService;
    private final ImplementsMethodLogService implementsMethodLogService;

    public static void main(String[] args) {
        SpringApplication.run(SpringAopSampleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        methodLogService.log();
        extendsMethodLogService.log();
        implementsMethodLogService.log();
    }
}
