package hello.actuator;

import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class MyMetric implements PublicMetrics {
    @Override
    public Collection<Metric<?>> metrics() {
        Metric m = new Metric<>("myMetricName", 5);
        return Collections.singleton(m);
    }
}
