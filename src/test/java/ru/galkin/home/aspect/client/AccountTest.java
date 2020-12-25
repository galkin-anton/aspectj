package ru.galkin.home.aspect.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Project: aspect
 *
 * <p>Author: Galkin A.B.
 *
 * <p>Date: 25.12.2020
 *
 * <p>Time: 12:14
 *
 * <p>Descriptions
 */
class AccountTest {
    private Account account;

    @BeforeEach
    public void before() {
        account = new Account();
    }

    @Test
    void given20AndMin10_whenWithdraw5_thenSuccess() {
        assertTrue(account.withdraw(5));
    }

    @Test
    void given20AndMin10_whenWithdraw100_thenFail() {
        assertFalse(account.withdraw(100));
    }
}
