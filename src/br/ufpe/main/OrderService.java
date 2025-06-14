package br.ufpe.main;

class OrderService {
	double calcFinalPrice(boolean cash, double price) {
		double finalPrice = price;
		if (cash) {
			finalPrice = finalPrice * 0.95;
		}
		finalPrice = checkAndApplyTax(finalPrice);
		return finalPrice;
	}

	private double checkAndApplyTax(double value) {
		if (value > 100) {
			value = value + (value * 0.1);
		}
		return value;
	}
}