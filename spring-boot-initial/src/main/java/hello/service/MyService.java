package hello.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ManagedResource
@ConfigurationProperties(prefix = "example")
public class MyService {

    public MyService(String foo) {
    }

    private List<String> names;

    @ManagedAttribute
    public List<String> getNames() {
        return names;
    }
    public void setNames(List<String> names) {
        this.names = names;
    }
}
