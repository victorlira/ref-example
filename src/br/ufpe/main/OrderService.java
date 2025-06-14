package br.ufpe.main;

class OrderService {
	double calcFinalPrice(boolean cash, double price) {
		double finalPrice = price;
		if (cash) {
			finalPrice = finalPrice * 0.95;
		}
		if (finalPrice > 100) {
			finalPrice = finalPrice + (finalPrice * 0.1);
		}
		return finalPrice;
	}
}