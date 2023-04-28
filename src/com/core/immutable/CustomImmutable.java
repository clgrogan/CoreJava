package com.core.immutable;

public class CustomImmutable {

	private final int x;

	public CustomImmutable(int x) {
		this.x = x;
	}

	public CustomImmutable change(int x) {
		if (this.x == x)
			return this;
		return new CustomImmutable(x);
	}

}
