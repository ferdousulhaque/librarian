package com.librarian.octopus.user;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("user")
public interface UserAgent {
}
