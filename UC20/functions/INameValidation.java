package Assignment20.functions;

import Assignment20.exception.InvalidNameException;

@FunctionalInterface
public interface INameValidation {
    public boolean nameValidation(String name) throws InvalidNameException;
}