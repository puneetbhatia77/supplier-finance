package com.hcl.capstoneserver.account;

import com.hcl.capstoneserver.account.dto.AccountVerifiedDTO;
import com.hcl.capstoneserver.account.dto.GetOTP_DTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin
@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/api/account/get-otp/")
    public ResponseEntity<Boolean> getOTP(@Valid @RequestBody GetOTP_DTO dto) {
        return new ResponseEntity<>(accountService.getOTP(dto.getAccountNumber()), HttpStatus.ACCEPTED);
    }

    @PostMapping("/api/account/verify")
    public ResponseEntity<Boolean> verifyAccount(@Valid @RequestBody AccountVerifiedDTO accountVerifiedDTO) {
        return new ResponseEntity<>(accountService.verifyAccount(accountVerifiedDTO), HttpStatus.OK);
    }
}
