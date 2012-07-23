package de.idos.updates.configuration;

public class ConfigurationFailedException extends RuntimeException {

    public ConfigurationFailedException(Throwable cause) {
        super(cause);
    }

    public ConfigurationFailedException(String message) {
        super(message);
    }
}