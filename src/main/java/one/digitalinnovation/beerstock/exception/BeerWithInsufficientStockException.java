package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerWithInsufficientStockException extends Exception {

    private static final long serialVersionUID = 1L;

    public BeerWithInsufficientStockException(Long id, int quantityInStock, int quantityToDecrement) {
	super(String.format("Beer with ID %s has insufficient stock. Current stock: %s. Quantity to decrement: %s", id,
		quantityInStock, quantityToDecrement));
    }
}
