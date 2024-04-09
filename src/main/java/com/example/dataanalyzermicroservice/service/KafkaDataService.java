package com.example.dataanalyzermicroservice.service;

import com.example.dataanalyzermicroservice.model.Data;

public interface KafkaDataService {

    void handle(Data data);
}
