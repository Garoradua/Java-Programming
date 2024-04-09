#include<iostream>
#include <climits>
using namespace std;
int main(){
	int t;
	cin >> t;
	while(t--){
		int N, M;
		cin >> N >> M;
		int basket[N];
		int Price[N];
		int Min[M+1] = {0};
		cout << "Enter all the basket" <<endl;
		for(int i=0; i<N; i++){
			cin >> basket[i];
		}
		for(int i=0; i<N; i++){
			cin >> Price[i];
		}
		cout << "Hello";
		int basket_number, pp;
		for(int i=0; i<N; i++){
			cout << "Hey";
			basket_number = basket[i];
			pp = Price[i];
			cout << "basket number" << basket_number << endl;
			cout <<  "price" << pp <<endl;
			Min[basket_number] += pp;
			cout << basket_number << " " << Min[basket_number] << endl ;
		}
		int min_amount = INT_MAX;
		for(int i=1; i<=M; i++){
			if(min_amount > Min[i]){
				min_amount = Min[i];
			}
		}
		cout << min_amount;
	}
}