package com.sandeep.service;

import com.sandeep.domain.WalletTransactionType;
import com.sandeep.model.Wallet;
import com.sandeep.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
