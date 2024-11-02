package com.bankApp.BankManagementApp.repo;

import com.bankApp.BankManagementApp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
