package Assignment20.functions;

import Assignment20.exception.InvalidEmailException;

@FunctionalInterface
public interface IEmailValidation {
    public boolean emailValidation(String email) throws InvalidEmailException;
}