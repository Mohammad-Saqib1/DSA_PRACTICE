#include<bits/stdc++.h>
using namespace std;

void insertionSort(int arr[],int size){
    for(int i=1;i<size;i++){
        int current=arr[i];
        int j=i-1;
        while(arr[j]>current){
            arr[j+1]=arr[j];
            j--;

        }
        arr[j+1]=current;

    }
}
int main(){

    int size;
    cout<<"Enter the Size of Array "<<endl;
    cin>>size;
    cout<<"Enter the Elements Of Array "<<endl;
    int arr[size];
    for(int i=0; i<size;i++){
        cin>>arr[i];
    }

    insertionSort(arr,size);
    cout<<" Sorted Array :"<<endl;
     for(int i=0; i<size;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}