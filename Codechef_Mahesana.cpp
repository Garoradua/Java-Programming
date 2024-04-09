#include<iostream>
using namespace std;
int main(){
	cout << "Total no of soldiers :";
	int N, lucky =0, unlucky =0;
	cin >> N;
	cout << "Enter the weapons of each soldier \n";
	int arr[N];
	for(int i=0; i<N; i++)
		cin >> arr[i];
	for(int i=0; i<N; i++){
		if(arr[i]%2==0){
			lucky++;
		}else{
			unlucky++;
		}
	}
	if(lucky>unlucky){
		cout << "ready for battle";
	}else{
		cout << "Not ready";
	}

}