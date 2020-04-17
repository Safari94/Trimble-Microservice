package io.safari94.trimblems.dao;

import io.safari94.trimblems.soap.tracking.TraceData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TracesDAO extends MongoRepository<TraceData,String> {
}
