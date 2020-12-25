package ru.galkin.home.aspect.client;

/**
 * Project: aspect
 *
 * <p>Author: Galkin A.B.
 *
 * <p>Date: 25.12.2020
 *
 * <p>Time: 11:30
 *
 * <p>Descriptions
 */
public class Account {
  int balance = 20;

  public boolean withdraw(int amount) {
    if (balance < amount) {
      return false;
    }
    balance = balance - amount;
    return true;
  }
}
