package com.nit.novadirectory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.nit.novadirectory.domain.PersonProfile;

public interface PersonProfileRepository extends MongoRepository<PersonProfile, String> {
}
