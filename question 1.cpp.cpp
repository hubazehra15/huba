#include <iostream>
int main() {
    int a,b= 0;
    std::cout << "Enter an integer: ";
    std::cin >> a;
    while (a != 0) {
        b=b*10+a% 10;
        a/= 10;
    }
    std::cout << "b: " << b << std::endl;
    return 0;
}
