#include<iostream>
using namespace std;
void rotate(int arr[],int size){
    int x=arr[size-1];//Store last element in x variable
    for(int i=size-1;i>=0;i--){
        arr[i]=arr[i-1];
    }
    arr[0]=x;//Store value of x at index 0
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
    cout<<endl;
    rotate(arr,size);
    cout<<"After Rotation by one Cyclically "<<endl;
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}