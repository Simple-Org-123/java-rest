package com.example.customerprofile;

import com.example.customerprofile.data.CustomerProfileEntity;
import com.example.customerprofile.data.CustomerProfileRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class ApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private CustomerProfileRepository repository;

    @BeforeEach
    @AfterEach
    void cleanupDatabase() {
        repository.deleteAllInBatch();
    }
}
