package com.cucumber.driver.wait;

/**
 * 
 * @param <F>
 * @param <T>
 * 
 *            Interface to use as condition for Waits
 */
public interface Function<F, T> {

	T apply(F input);

	@Override
	boolean equals(Object object);
}
