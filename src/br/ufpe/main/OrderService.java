package br.ufpe.main;

class OrderService {
	double calcFinalPrice(double price) {
		if (price > 100) {
			return price + (price * 0.1);
		}
		return price;
	}
}
