package sample.multimodule.service.api;

import sample.multimodule.domain.entity.Account;

public interface AccountService {
	
	 Account findOne(String number); 
	 Account createAccountByNumber(String number);
}
