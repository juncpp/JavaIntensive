package edu.school21.chat.repositories;

import edu.school21.chat.models.Message;

import java.util.Optional;

public interface MessagesRepository {
    void save(Message msg);
    Optional<Message> findById(Long id);
}
