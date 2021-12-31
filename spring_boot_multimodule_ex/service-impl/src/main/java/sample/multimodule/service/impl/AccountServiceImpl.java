package sample.multimodule.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import sample.multimodule.domain.entity.Account;
import sample.multimodule.repository.AccountRepository;
import sample.multimodule.service.api.AccountNotFoundExceptions;
import sample.multimodule.service.api.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Value("${dummy.type}")
	private String dummyType;
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account findOne(String number) throws AccountNotFoundExceptions {
		if (number.equals("0000")) {
			throw new AccountNotFoundExceptions("0000");
		}
		Account account = accountRepository.findByNumber(number);
		if (account == null) {
			account = createAccountByNumber(number);
		}
		return account;
	}

	@Override
	public Account createAccountByNumber(String number) {
		Account account = new Account();
		account.setNumber(number);
		return accountRepository.save(account);
	}

	public String getDummyType() {
		return dummyType;
	}

	public void setDummyType(String dummyType) {
		this.dummyType = dummyType;
	}
}
