#include <iostream>
#include <string>
using namespace std;

int main() {
    int total;
    cin >> total;

    while (total-- > 0) {
        string num;
        cin >> num;
        char last = num[num.size() - 1];

        if ((last - '0') % 2 == 0) cout << "even" << endl;
        else cout << "odd" << endl;
    }
    return 0;
}