package br.ufpe.main;

class OrderService {
	double calcFinalPrice(boolean cash, double price) {
		double finalPrice = cash ? price : price * 0.9;
		if (price > 100) {
			finalPrice = price + (price * 0.1);
		}
		return finalPrice;
	}
}