package com.librarian.rent;

import java.util.List;

public record RentRequest(
        List<Integer> bookIds
) {
}
