#include<iostream>
using namespace std;
void sum(int arr[], int s);
int main(){
    cout << "Enter the size of array \n";
    int size;
    cin >> size;
    int arr[size];
    for(int i=0; i<size; i++){
        cin >> arr[i];
    }
    sum(arr, size);
}
void sum(int arr[], int s){
    int sum=0;
    for(int i=0; i<s; i++){
        sum += arr[i];
    }
    cout << sum;
}