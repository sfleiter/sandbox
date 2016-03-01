package hello.actuator;

import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Component;

//@Component
// TODO called for every metrics, even those provided by Spring Boot itself and destroys those
// TODO see DebugFilter
public class RequestCounterService implements CounterService {
    @Override
    public void increment(String metricName) {
        System.out.println("inc: " + metricName);
    }

    @Override
    public void decrement(String metricName) {

    }

    @Override
    public void reset(String metricName) {

    }
}
