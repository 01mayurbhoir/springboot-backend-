package com.example.journalApp.repository;

import com.example.journalApp.entity.ConfigJournalAppEntity;
import com.mongodb.client.MongoCollection;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {
}
