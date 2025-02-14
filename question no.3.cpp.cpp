#include <iostream>
using namespace std;
int Number(int arr[], int a)
 {
    int total = (a+1)*(a+2)/2;  
    int sum =0;
    for (int i = 0;i<a;i++) 
	{
        sum+=arr[i];
    }
    return total-sum; 
}
int main() 
{
    int arr[] ={1, 2, 4, 5, 6,};
    int a= sizeof(arr)/sizeof(arr[0]);
    cout << "missing number:" << Number(arr, a) << endl;
    return 0;
}
