package com.gupaoedu.service.client;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface PersonSink {

    @Input("person-sink")
    SubscribableChannel channel();
}
