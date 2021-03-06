package com.github.curriculeon.arcade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class ArcadeAccount {

    private String accountName;
    private String accountPassword;

    public ArcadeAccount(String accountName, String accountPassword) {
        this.accountName = accountName;
        this.accountPassword = accountPassword;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    @Override
    public String toString() {
        return "ArcadeAccount{" +
                "accountName='" + accountName + '\'' +
                ", accountPassword='" + accountPassword + '\'' +
                '}';
    }
}
