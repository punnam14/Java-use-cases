package Assignment20.functions;

import Assignment20.exception.InvalidPasswordException;

@FunctionalInterface
public interface IPasswordValidation {
    public boolean passwordValidation(String password) throws InvalidPasswordException;
}
