#include<iostream>
using namespace std;
void printArr(int *arr, int s){
	for(int i=0; i<s; i++)
		cout << arr[i];
}
int main(){
	int n;
	cin >> n;
	int *arr = new int[n];
	for(int i=0; i<n; i++){
		cin >> arr[i];
	}
	printArr(arr, n);
}