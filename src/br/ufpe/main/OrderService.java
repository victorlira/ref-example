package br.ufpe.main;

class OrderService {
	double calcFinalPrice(boolean cash, double price) {
		double finalPrice = cash ? price : price * 0.9;
		if (finalPrice > 100) {
			finalPrice = applyTax(finalPrice);
		}
		return finalPrice;
	}
	double applyTax(double value) {
		return value + (value * 0.1);
	}
}