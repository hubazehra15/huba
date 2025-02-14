#include <iostream>
using namespace std;
int sumUntilSingle(int n) {
    while (n > 9) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        n = sum;
    }
    return n;
}
int main() {
       cout << sumUntilSingle(987) << endl;  
    cout << sumUntilSingle(1234) << endl;  
    cout << sumUntilSingle(99999) << endl;
    return 0;
}
