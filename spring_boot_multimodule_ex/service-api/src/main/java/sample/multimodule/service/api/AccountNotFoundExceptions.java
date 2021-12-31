package sample.multimodule.service.api;

public class AccountNotFoundExceptions extends RuntimeException {
	
	private static final long serialVersionUID = -3891534644498426670L;

	public AccountNotFoundExceptions(String accountId) {
		super("No such account with id: " + accountId);
	}
}
