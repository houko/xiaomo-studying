#include <iostream>

using namespace std;

int main() {
    // 开辟了一个double类型的空间并赋值
    double pi = 1.1314;
    // 找到 pi的地址并交给ptr_num, ptr_num就拿到了 pi的实际的地址
    double *ptr_num = &pi;
    // ptr_num现在是一个指向地址的指针
    cout << ptr_num << endl;  // 0x7ffee296a990
    // *ptr_num是指向pi的具体的值
    cout << *ptr_num << endl; // 1.1314


    string name = "xiaomo";

    int *ptr_null = nullptr;
    cout << ptr_null << endl;


    return 0;
}
