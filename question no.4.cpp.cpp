#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
bool customSort(int a, int b) {
    if (a % 2 == 0 && b % 2 != 0) 
        return true;  
    if (a % 2 != 0 && b % 2 == 0) 
        return false; 
    if (a % 2 == 0) 
        return a < b;
    return a > b;      
}
int main() {
    vector<int> arr = {7,8,4,1,6,2};
    sort(arr.begin(), arr.end(), customSort);
    cout << "output: [";
    for (size_t i = 0; i < arr.size(); ++i) {
        if (i > 0) cout << ",";
        cout << arr[i];
    }
    cout << "]" << endl;
    return 0;
}
