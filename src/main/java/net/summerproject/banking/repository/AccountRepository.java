package net.summerproject.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.summerproject.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account , Long>{
    
}
