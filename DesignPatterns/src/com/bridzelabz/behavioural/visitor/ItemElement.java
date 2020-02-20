package com.bridzelabz.behavioural.visitor;

public interface ItemElement
{
	public int accept(ShoppingCartVisitor visitor);
}