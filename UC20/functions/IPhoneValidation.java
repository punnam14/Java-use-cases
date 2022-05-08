package Assignment20.functions;

import Assignment20.exception.InvalidPhoneNumberException;

@FunctionalInterface
public interface IPhoneValidation {
    public boolean phoneValidation(String phone) throws InvalidPhoneNumberException;
}
