package com.librarian.octopus.rent;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("rent")
public class RentAgent {
}
