package com.dev.springsecuritytutorial.entity.listener;

import com.dev.springsecuritytutorial.entity.User;
import com.dev.springsecuritytutorial.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

public class RegistrationCompleteEventListener  implements ApplicationListener<RegistrationCompleteEvent> {
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        User user = event.getUser();
    }
}
