package com.example.demo.config;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ConfigCloudinary {

    @Bean
    public Cloudinary configKey() {
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", "dmwnqymzb");
        config.put("api_key", "881635142492745");
        config.put("api_secret", "QLu9j1uyeM5QAkF6NgdLHlDOHUY");
        return new Cloudinary(config);
    }
}
