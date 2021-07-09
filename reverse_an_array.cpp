#include <iostream>
using namespace std;

void reverse(int arr[], int size)
{
    int start = 0, end = size - 1;

    while (start <= end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
int main()
{
    int size;
    cout << "Enter the Size of Array " << endl;
    cin >> size;
    cout << "Enter the Elements of Array " << endl;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
    reverse(arr, size);
    cout << "Reverse Array " << endl;
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}