package com.demo.server.repository;


import com.demo.server.domain.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
