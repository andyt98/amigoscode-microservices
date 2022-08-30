package com.andy.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
