#include<iostream>

using namespace std;

int main() {
	int sum = 0;
	for (int i = 1; i <= 10; ++i) {
		sum += i;
	}
	cout << "Suma numerelor de la 1 la 10 este: " << sum << '\n';
	return 0;
}
