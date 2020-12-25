package ru.galkin.home.aspect.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Project: aspect
 * <p>
 * Author: Galkin A.B.
 * <p>
 * Date: 25.12.2020
 * <p>
 * Time: 11:31
 * <p>
 * Descriptions
 */
public aspect AccountAspect {

    final int MIN_BALANCE = 10;
    final static Logger logger = LoggerFactory.getLogger("AccountAspect");

    pointcut callWithDraw(int amount, Account acc):
      call(boolean Account.withdraw(int)) && args(amount) && target(acc);

    before(int amount, Account acc): callWithDraw(amount, acc) {
        logger.warn("Before amount {}, balance {}, sign {}", amount, acc.balance, thisJoinPoint.getSignature());
    }

    boolean around(int amount, Account acc):
      callWithDraw(amount, acc) {
        if (acc.balance < amount) {
            return false;
        }
        return proceed(amount, acc);
    }

    after(int amount, Account balance): callWithDraw(amount, balance) {
        logger.warn("After amount {}, balance {}", amount, balance.balance);
    }
}
