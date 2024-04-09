#include<iostream>
using namespace std;
int main(){
	int n;
	cin >> n;
	int arr[n];
	for(int i=0; i<n; i++){
		cin >> arr[i];
	}
	int half = n/2;
	int count[10] = {0};
	for(int i=0; i<n; i++){
		int x = arr[i];
		count[x]++;
		cout << count[x] << " ";
	}
	int max;
	for(int i=1; i<10; i++){
		if (count[i] > half)
			cout << i;
	}
	
}