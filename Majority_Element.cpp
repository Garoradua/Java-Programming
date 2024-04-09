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
	// int temp[n];
	cout << half;
	for(int i=0; i<n; i++){
		int count=0;
		for(int j=i; j<n; j++){
			if(arr[i]==arr[j])
				count++;
			// cout << count;
		}
		if(count > half){
			cout << arr[i];
			break;
		}
	}
}