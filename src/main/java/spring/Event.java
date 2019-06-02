package spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class Event extends ApplicationEvent {
    public Event(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Published event";
    }
}
