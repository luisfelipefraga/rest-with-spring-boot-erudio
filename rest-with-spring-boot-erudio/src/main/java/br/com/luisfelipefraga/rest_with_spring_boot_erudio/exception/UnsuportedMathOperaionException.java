package br.com.luisfelipefraga.rest_with_spring_boot_erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperaionException extends RuntimeException {

    public UnsuportedMathOperaionException(String message) {
        super(message);
    }
}
