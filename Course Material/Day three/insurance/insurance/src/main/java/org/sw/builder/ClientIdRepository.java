package org.sw.builder;

import org.sw.facts.ClientID;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientIdRepository {

    public static List<ClientID> getClientIDs() {
        List<ClientID> clientIDs = new ArrayList<>();

        clientIDs.add(ClientID.newBuilder()
                .withName("James Smith")
                .withIdNumber("ID-100")
                .withExpiryDate(LocalDate.of(2030, 5, 21))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("Maria Smith")
                .withIdNumber("ID-101")
                .withExpiryDate(LocalDate.of(2023, 5, 11))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("Robert Johnson")
                .withIdNumber("ID-102")
                .withExpiryDate(LocalDate.of(2037, 11, 11))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("Linda Johnson")
                .withIdNumber("ID-103")
                .withExpiryDate(LocalDate.of(2026, 11, 2))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("Michael Johnson")
                .withIdNumber("ID-104")
                .withExpiryDate(LocalDate.of(2032, 1, 11))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("Elizabeth Anderson")
                .withIdNumber("ID-105")
                .withExpiryDate(LocalDate.of(2024, 3, 31))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("David Lee")
                .withIdNumber("ID-106")
                .withExpiryDate(LocalDate.of(2025, 6, 8))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("Emily Taylor")
                .withIdNumber("ID-107")
                .withExpiryDate(LocalDate.of(2027, 3, 31))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("William Brown")
                .withIdNumber("ID-108")
                .withExpiryDate(LocalDate.of(2031, 1, 8))
                .build());

        clientIDs.add(ClientID.newBuilder()
                .withName("Jessica Thompson")
                .withIdNumber("ID-109")
                .withExpiryDate(LocalDate.of(2031, 1, 8))
                .build());

        return clientIDs;
    }
}
