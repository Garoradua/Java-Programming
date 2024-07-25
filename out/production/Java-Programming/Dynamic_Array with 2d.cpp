#include<iostream>
using namespace std;
void printArr(int **arr, int n, int m){
	for(int i=0; i<n; i++){
		for(int j=0; j<m; j++){
			cout <<  arr[i][j];
		}
	}
}
int main(){
	int n,m;
	cin >> n >> m;
	int **arr = new int*[n];
	for(int i=0; i<n; i++){
		arr[i] = new int[m];
	}
	for(int i=0; i<n; i++){
		for(int j=0; j<m; j++){
			cin >>  arr[i][j];
		}
	}
	printArr(arr, n, m);
}