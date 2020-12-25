package ru.galkin.home.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.galkin.home.aspect.client.Account;

/**
 * Project: aspect
 *
 * <p>Author: Galkin A.B.
 *
 * <p>Date: 25.12.2020
 *
 * <p>Time: 11:28
 *
 * <p>Descriptions
 */
public class Main {

  static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    LOGGER.info("Start");
    Account account = new Account();
    LOGGER.info("With drawn {}", account.withdraw(1));
  }
}
