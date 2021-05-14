package com.tts.subscriberlist.subscriber;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

Iterable<Subscriber> findByLastName(String lastName);
}

