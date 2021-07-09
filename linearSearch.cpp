#include<iostream>
using namespace std;
int linearSearch(int arr[],int size,int key){
    for(int i=0;i<size;i++){
        if(arr[i]==key){
            return i;
        }
      
    }
    return -1;

}
int main(){

    int size,key;
    cout<<"Enter the Size of Array "<<endl;
    cin>>size;
    cout<<"Enter the Elements of Array "<<endl;
    int arr[size];
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
    cout<<"Enter the Searching Element "<<endl;
    cin>>key;
    int result=linearSearch(arr,size,key);
    cout<<"Searching Element's Index is "<<result;
    return 0;
}