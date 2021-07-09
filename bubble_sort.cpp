#include<iostream>
using namespace std;


void bubbleSort(int arr[],int size){
    int counter=1;
    while(counter<size){
        for(int i=0;i<size-counter;i++){
            if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;}
        }
        counter++;
    }
}
int main(){
    int size;
    cout<<"Enter the Size of Array "<<endl;
    cin>>size;
    cout<<"Enter the Elements of Array "<<endl;
    int arr[size];
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
    cout<<"Sorted Array :"<<endl;
    bubbleSort(arr,size);
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}